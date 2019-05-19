import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import complex.OperacionesAvanzadas;
import complex.Punto;
public class OperacionesAvanzadasTest {
	@Test
	public void potenciaTest() {
		OperacionesAvanzadas operaciones = new OperacionesAvanzadas(); 
		Punto punto = new Punto(0,3);
		Punto resultado = operaciones.potencia(punto, 2);
		assertTrue(resultado.norma()==9);
		assertTrue(resultado.argumento() == Math.atan(Math.sin(punto.argumento()*2)/Math.cos(punto.argumento()*2)));
	}
	@Test
	public void radicacionNesimaTest() {
		OperacionesAvanzadas operaciones = new OperacionesAvanzadas(); 
		Punto punto = new Punto(0,9);
		ArrayList<Punto> resultado = operaciones.raizNescima(punto, 2);
		assertTrue(resultado.stream().allMatch(puntos-> puntos.norma()==3));
		assertTrue(resultado.get(1).argumento() == Math.atan(Math.sin((2*Math.PI+punto.argumento())/2)/Math.cos((2 * Math.PI+punto.argumento())/2)));
	}
	@Test
	public void raicesPrimitivas() {
		OperacionesAvanzadas operaciones = new OperacionesAvanzadas(); 
		Punto punto = new Punto(0,9);
		ArrayList<Punto> resultado = operaciones.raicesPrimitivas(punto, 4);
		assertTrue(resultado.size()==2);
	}
}
