package complex;

import java.math.BigInteger;
import java.util.ArrayList;

public class OperacionesAvanzadas {
	public  Punto potencia(Punto base, int exponencial) {
		double resultadoNorma= Math.pow(base.norma(),exponencial);
		double resultadoArgumento = base.argumento()* exponencial;
		return crearElPuntoApartirDe(resultadoNorma,resultadoArgumento);
	}
	public ArrayList<Punto> raizNescima(Punto radicando,int radical){
		double resultadoNorma = Math.pow(radicando.norma(),(1/Double.valueOf(radical)));
		ArrayList<Double> resultadoArgumentos = new ArrayList<Double>();
		ArrayList<Punto> resultado = new ArrayList<Punto>();
		for(int i=0;i<radical;i++)
			resultadoArgumentos.add(((i* 2 * Math.PI) + radicando.argumento())/radical);
		resultadoArgumentos.stream().forEach(argumento-> resultado.add(crearElPuntoApartirDe(resultadoNorma,argumento)));
	return resultado;
	}
	public Punto crearElPuntoApartirDe(double norma,double argumento) {
		return new Punto(norma*Math.cos(argumento),norma*Math.sin(argumento));
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
