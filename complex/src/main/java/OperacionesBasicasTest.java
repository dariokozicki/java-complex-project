import static org.junit.Assert.assertTrue;
import org.junit.Test;
import complex.OperacionesBasicas;
import complex.Punto;

public class OperacionesBasicasTest {
	@Test
	public void realizarRestaCorrectamente() {
		Punto punto1 = new Punto(2,4);
		Punto punto2 = new Punto(2,3);
		Punto resultado = OperacionesBasicas.resta(punto1,punto2);
		assertTrue(resultado.getIm()==1);
		assertTrue(resultado.getRe()==0);
	}
	@Test
	public void realizarSumaCorrectamente() {
		Punto punto1 = new Punto(2,4);
		Punto punto2 = new Punto(2,3);
		Punto resultado = OperacionesBasicas.suma(punto1,punto2);
		assertTrue(resultado.getIm()==7);
		assertTrue(resultado.getRe()==4);
	}
	@Test
	public void realizarMultiplicacionCorrectamente() {
		Punto punto1 = new Punto(2,4);
		Punto punto2 = new Punto(2,3);
		Punto resultado = OperacionesBasicas.multiplicacion(punto1,punto2);
		assertTrue(resultado.getIm()==14);
		assertTrue(resultado.getRe()==-8);
	}
	@Test
	public void realizarDivisionCorrectamente() {
		Punto punto1 = new Punto(2,4);
		Punto punto2 = new Punto(2,3);
		Punto resultado = OperacionesBasicas.cociente(punto1,punto2);
		assertTrue(resultado.getIm()==(double)2/13);
		assertTrue(resultado.getRe()== (double)16/13);
	}
}
