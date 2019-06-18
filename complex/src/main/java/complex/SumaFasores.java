package complex;


public class SumaFasores {
	private FuncionSinusoidal funcion1;
	private FuncionSinusoidal funcion2;
	public SumaFasores(String funcion1, String funcion2) {
		this.funcion1 = new FuncionSinusoidal(funcion1);
		this.funcion2 = new FuncionSinusoidal(funcion2);
	}
	public FuncionSinusoidal sumarFasores() {
		this.validarQuePoseanMismaFrecuencia(funcion1,funcion2);
		this.mismaOperacion(funcion1,funcion2);
		Punto resultado = OperacionesBasicas.suma(this.aFasor(funcion1), this.aFasor(funcion2));
		return new FuncionSinusoidal(Double.toString(resultado.norma())+
				funcion1.getOperacion()+"("+funcion1.getFrecuencia()+"t"+ "+"+
				Double.toString(resultado.argumento())+")");
	}
	public void mismaOperacion(FuncionSinusoidal funcion1,FuncionSinusoidal funcion2) {
		if(!funcion1.getOperacion().equals(funcion2.getOperacion())) {
			if(funcion1.getOperacion() == "cos") {
				funcion1.setFaseInicial(funcion2.getFaseInicial()+ (double)Math.PI/2);
				funcion1.setOperacion("sen");
			}else {
				funcion2.setFaseInicial(funcion2.getFaseInicial()+ (double)Math.PI/2);
				funcion2.setOperacion("sen");
			}
		}
	}
	public Punto aFasor(FuncionSinusoidal funcion) {
		double real = funcion.getAmplitud()*Math.cos(funcion.getFaseInicial());
		double imaginario = funcion.getAmplitud()*Math.cos(funcion.getFaseInicial());
		//Revisar el error de aproximacion a cero
		if (funcion.getFaseInicial() ==0 || funcion.getFaseInicial() == Math.PI) 
			imaginario=0.0;
		if (funcion.getAmplitud() ==(double) Math.PI/2 || funcion.getAmplitud() == Math.PI*((double)(3.0/2))) 
			real=0.0;
		return new Punto(real,imaginario);
	}
	
	public void validarQuePoseanMismaFrecuencia(FuncionSinusoidal funcion1, FuncionSinusoidal funcion2) {
		if(!(funcion1.getFrecuencia() == funcion2.getFrecuencia())) {
			throw new DistintasFrecuenciasException("WARNING: Las funciones sinusoidales poseen diferentes frecuencias");
		}
	}
 	public FuncionSinusoidal getFuncion1() {
		return funcion1;
	}
	public void setFuncion1(FuncionSinusoidal funcion1) {
		this.funcion1 = funcion1;
	}
	public FuncionSinusoidal getFuncion2() {
		return funcion2;
	}
	public void setFuncion2(FuncionSinusoidal funcion2) {
		this.funcion2 = funcion2;
	}
	
}
