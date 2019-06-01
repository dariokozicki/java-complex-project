import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import complex.OperacionesAvanzadas;
import complex.Punto;
public class OperacionesAvanzadasTest {
	@Test
	public void potenciaTest() {
		Punto punto = new Punto(0,3);
		Punto resultado = OperacionesAvanzadas.potencia(punto, 2);
		assertTrue(resultado.norma()==9);
		assertTrue(resultado.argumento() == Math.PI);
	}
	@Test
	public void radicacionNesimaTest() {
		Punto punto = new Punto(0,9);
		ArrayList<Punto> resultado = OperacionesAvanzadas.raizNescima(punto, 2);
		assertTrue(resultado.stream().allMatch(puntos-> puntos.norma()==3));
		assertTrue(this.redondeo(resultado.get(0).argumento()).equals(this.redondeo((Double)Math.PI/4)));
	}
	public Double redondeo(Double nro) {
		return Double.parseDouble(String.format("%.10f", nro).replace(",", "."));
	}
	@Test
	public void raicesPrimitivas() {
		OperacionesAvanzadas operaciones = new OperacionesAvanzadas(); 
		Punto punto = new Punto(0,9);
		ArrayList<Punto> resultado = operaciones.raicesPrimitivas(punto, 4);
		assertTrue(resultado.size()==2);
	}
}
