package complex;
import complex.Complejo;
public class Transformacion {
	public String pasarAPolar(String expression) {
		Punto punto = new Punto();
		Complejo complejo = new Complejo();
		punto = complejo.complejo(expression);
		return "["+ String.valueOf(punto.norma()) +","+ Math.atan2(punto.im(), punto.re()) + "]";
	}
	public String pasarABinomial(String expression) {
		Punto punto = new Punto();
		Complejo complejo = new Complejo();
		punto = complejo.complejo(expression);
		return "("+ String.valueOf(punto.re()) +","+ String.valueOf(punto.im())+ ")";
	}
}