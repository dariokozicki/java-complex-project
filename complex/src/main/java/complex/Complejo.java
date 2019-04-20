package complex;
import complex.Punto;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Complejo{
    Punto binomial = new Punto();

    public Complejo(String expression) {
        Pattern binomial = Pattern.compile("\\(" +
                "(\\d+\\.?\\d+)" +
                "," +
                "(\\d+\\.?\\d+)" +
                "\\)");
        Pattern polar = Pattern.compile("\\[" +
                "(\\d+\\.?\\d+)" +
                "," +
                "(\\d+\\.?\\d+)" +
                "\\]");
        Matcher matchbin = binomial.matcher(expression);
        Matcher matchpol = polar.matcher(expression);
        if (matchbin.find()) {
            setBinomial(matchbin);
        } else {
            if (matchpol.find()) {
                setPolar(matchpol);
            }
        }
    }
    public void setBinomial(Matcher matchbin){
        binomial.re( Double.parseDouble(matchbin.group(0)) );
        binomial.im( Double.parseDouble(matchbin.group(1)) );
    }
    public void setPolar(Matcher matchpol){
        double rads = corregirGiro( Double.parseDouble(matchpol.group(1)) );
        binomial.re( Double.parseDouble(matchpol.group(0))*Math.cos(rads) );
        binomial.im( Double.parseDouble(matchpol.group(0))*Math.sin(rads) );

    }
    public double corregirGiro(double radianes){
        return radianes % (2*Math.PI);
    }
}
