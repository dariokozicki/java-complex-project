package complex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FuncionSinusoidal {
	private double frecuencia;
	private double amplitud;
	private double faseInicial;
	private String operacion;
	Matcher funcionMacheada;
	public FuncionSinusoidal(String funcion) {
		this.validarFormato(funcion);
		this.setAmplitud(Double.parseDouble(funcionMacheada.group(1)));
		this.setOperacion(funcionMacheada.group(2));
		this.setFrecuencia(Double.parseDouble(funcionMacheada.group(3)));
		this.setFaseInicial(Double.parseDouble(funcionMacheada.group(4)));
		
	}
	public void validarFormato(String funcion) {
		Pattern formato = Pattern.compile("(\\d+\\.?\\d*)" +
                "(cos)"+
                "\\("+
                "(\\d+\\.?\\d*)"+
                "t"+ 
                "\\+" + 
                "(\\d+\\.?\\d*)"+
                "\\)");
		funcionMacheada = formato.matcher(funcion);
		if(!funcionMacheada.find()) {
			formato = Pattern.compile("(\\d+\\.?\\d*)" +
	                "(sen)"+
	                "\\("+
	                "(\\d+\\.?\\d*)"+
	                "t"+ 
	                "\\+" + 
	                "(\\d+\\.?\\d*)"+
	                "\\)");
			funcionMacheada = formato.matcher(funcion);
			if(!funcionMacheada.find()) {
				throw new FuncionSinusoidalFormatoException("WARNING: La funcion sinusoidal no posee el formato indicado");
			}
		}		
	}
	public double getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	public double getAmplitud() {
		return amplitud;
	}
	public void setAmplitud(double amplitud) {
		this.amplitud = amplitud;
	}
	public double getFaseInicial() {
		return faseInicial;
	}
	public void setFaseInicial(double faseInicial) {
		this.faseInicial = faseInicial;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	
}
