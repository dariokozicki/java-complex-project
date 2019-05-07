package complex;
import complex.Punto;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Complejo{
    Punto parOrdenado = new Punto();

    public Complejo(String expression) {
        Pattern parOrdenado = Pattern.compile("\\(" +
                "(\\d+\\.?\\d*)" +
                "," +
                "(\\d+\\.?\\d*)" +
                "\\)");
        Pattern polar = Pattern.compile("\\[" +
                "(\\d+\\.?\\d*)" +
                "," +
                "(\\d+\\.?\\d*)" +
                "\\]");
        Pattern binomial = Pattern.compile("" +
                "(\\d+\\.?\\d*)" +
                "\\s?" +
                "\\+" +
                "(\\d+\\.?\\d*)j"
                );
        Matcher matchord = parOrdenado.matcher(expression);
        Matcher matchpol = polar.matcher(expression);
        Matcher matchbin = binomial.matcher(expression);
        if (matchord.find()) {
            setOrdenadoOBinomial(matchord);
        } else {
            if (matchpol.find()) {
                setPolar(matchpol);
            }else{
                if (matchbin.find()){
                    setOrdenadoOBinomial(matchbin);
                }else{
                    throw new NoPerteneceANingunFormatoException("WARNING: el formato del complejo ingresado es invalido");
                }
            }

        }
    }
    public void setOrdenadoOBinomial(Matcher matchord){
        parOrdenado.setRe( Double.parseDouble(matchord.group(1)) );
        parOrdenado.setIm( Double.parseDouble(matchord.group(2)) );
    }
    public void setPolar(Matcher matchpol){
        double rads = corregirGiro( Double.parseDouble(matchpol.group(2)) );
        parOrdenado.setRe( Double.parseDouble(matchpol.group(1))*Math.cos(rads) );
        parOrdenado.setIm( Double.parseDouble(matchpol.group(1))*Math.sin(rads) );

    }
    public double corregirGiro(double radianes){
        return radianes % (2*Math.PI);
    }
    public Punto getPunto() {
    	return parOrdenado;
    }
}
