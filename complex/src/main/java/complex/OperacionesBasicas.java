package complex;

public class OperacionesBasicas {
	public Punto resta(Punto complejo1,Punto complejo2) {
		double resultadoReal = complejo1.getRe()- complejo2.getRe();
		double resultadoImaginario = complejo1.getIm()- complejo2.getIm();
		return new Punto(resultadoReal, resultadoImaginario);
	}
	public Punto suma(Punto complejo1,Punto complejo2) {
		double resultadoReal = complejo1.getRe()+ complejo2.getRe();
		double resultadoImaginario = complejo1.getIm()+ complejo2.getIm();
		return new Punto(resultadoReal, resultadoImaginario);
	}
	public Punto multiplicacion(Punto complejo1,Punto complejo2) {
		double resultadoReal = complejo1.getRe()*complejo2.getRe() - complejo1.getIm()* complejo2.getIm();
		double resultadoImaginario = complejo1.getRe()*complejo2.getIm()+ complejo1.getIm()*complejo2.getRe();
		return new Punto(resultadoReal, resultadoImaginario);
	}
	public Punto cociente(Punto complejo1,Punto complejo2) {
		double divisor =(Math.pow(complejo2.getRe(),2)-Math.pow(complejo2.getIm(),2));
		double resultadoReal = multiplicacion(complejo1, complejo2.complemento()).getRe()/ divisor;
		double resultadoImaginario = multiplicacion(complejo1, complejo2.complemento()).getIm()/ divisor;
		return new Punto(resultadoReal, resultadoImaginario);
	}
}