package complex;

import java.math.BigInteger;
import java.util.ArrayList;

public class OperacionesAvanzadas {
	public  static Punto potencia(Punto base, int exponencial) {
		double resultadoNorma= Math.pow(base.norma(),exponencial);
		double resultadoArgumento = base.argumento()* exponencial;
		return crearElPuntoApartirDe(resultadoNorma,resultadoArgumento);
	}
	public static ArrayList<Punto> raizNescima(Punto radicando,int radical){
		double resultadoNorma = Math.pow(radicando.norma(),(1/Double.valueOf(radical)));
		
		ArrayList<Double> resultadoArgumentos = new ArrayList<Double>();
		ArrayList<Punto> resultado = new ArrayList<Punto>();
		for(int i=0;i<radical;i++)
			resultadoArgumentos.add(((i* 2 * Math.PI) + radicando.argumento())/radical);
			resultadoArgumentos.stream().forEach(argumento-> {
			resultado.add(crearElPuntoApartirDe(resultadoNorma,argumento));});
	return resultado;
	}
	private static Punto crearElPuntoApartirDe(double norma,double argumento) {
		//Revisamos el redondeo porque cuando el seno o coseno me tiene que dar cero solamente 
		Double real = norma*Math.cos(argumento);
		Double img = norma*Math.sin(argumento);
		if (argumento ==0 || argumento == Math.PI) 
			img=0.0;
		if (argumento ==(Double) Math.PI/2 || argumento == Math.PI*((Double)(3.0/2))) 
			real=0.0;
		return new Punto(real,img);
	}
	public ArrayList<Punto> raicesPrimitivas(Punto radicando,int radical) {
		ArrayList<Punto> resultado = raizNescima(radicando,radical);
		ArrayList<Punto> primitiva = new ArrayList<Punto>();
		for(int i=0; i<radical; i++){
			if(BigInteger.valueOf(i).gcd(BigInteger.valueOf(radical)).intValue()==1)
				primitiva.add(resultado.get(i));
		}
		return primitiva;
	}
}
