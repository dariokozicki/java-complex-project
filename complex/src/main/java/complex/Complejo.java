package complex;
import complex.Punto;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Complejo{
    Punto complejo = new Punto();

    public Punto complejo(String expression) {
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
            return setBinomial(matchbin);
        } else {
            if (matchpol.find()) {
                return setPolar(matchpol);
            }
        }return complejo;
    }
    public Punto setBinomial(Matcher matchbin){
        complejo.re( Double.parseDouble(matchbin.group(0)) );
        complejo.im( Double.parseDouble(matchbin.group(1)) );
        return complejo;
    }
    public Punto setPolar(Matcher matchpol){
        double rads = corregirGiro( Double.parseDouble(matchpol.group(1)) );
        complejo.re( Double.parseDouble(matchpol.group(0))*Math.cos(rads) );
        complejo.im( Double.parseDouble(matchpol.group(0))*Math.sin(rads) );
        return complejo;

    }
    public double corregirGiro(double radianes){
        return radianes % (2*Math.PI);
    }
}
