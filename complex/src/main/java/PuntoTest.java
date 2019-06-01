import static org.junit.Assert.assertTrue;
import org.junit.Test;

import complex.Punto;

public class PuntoTest {
	@Test
	public void instanciacionDePunto() {
		Punto punto=new Punto(0,2);
		assertTrue(punto.getIm() == 2);
		assertTrue(punto.norma() == 2);
		assertTrue(punto.getRe() == 0);
		assertTrue(punto.argumento()==Math.PI/2);
	}
	@Test
	public void instanciacionDePuntoConImaginarioNegativo() {
		Punto punto=new Punto(0,-2);
		assertTrue(punto.getIm() == -2);
		assertTrue(punto.norma() == 2);
		assertTrue(punto.getRe() == 0);
		assertTrue(punto.argumento()==Math.PI*(double)3/2);
	}
	@Test
	public void instanciacionDePuntoPrimerCuadrante() {
		Punto punto=new Punto(1,1);
		assertTrue(punto.getIm() == 1);
		assertTrue(punto.norma() == Math.sqrt(2));
		assertTrue(punto.getRe() == 1);
		assertTrue(punto.argumento()==Math.PI*(double)1/4);
	}
	@Test
	public void instanciacionDePuntoSegundoCuadrante() {
		Punto punto=new Punto(-1,1);
		assertTrue(punto.getIm() == 1);
		assertTrue(punto.norma() == Math.sqrt(2));
		assertTrue(punto.getRe() == -1);
		assertTrue(punto.argumento()==Math.PI*(double)3/4);
	}
	@Test
	public void instanciacionDePuntoCuartoCuadrante() {
		Punto punto=new Punto(1,-1);
		assertTrue(punto.getIm() == -1);
		assertTrue(punto.norma() == Math.sqrt(2));
		assertTrue(punto.getRe() == 1);
		assertTrue(punto.argumento()==Math.PI*(double)7/4);
	}
	@Test
	public void instanciacionDePuntoTercerCuadrante() {
		Punto punto=new Punto(-1,-1);
		assertTrue(punto.getIm() == -1);
		assertTrue(punto.norma() == Math.sqrt(2));
		assertTrue(punto.getRe() == -1);
		assertTrue(punto.argumento()==Math.PI*(double)5/4);
	}

	@Test
	public void instanciacionDePunto2() {
		Punto punto=new Punto(1,2);
		assertTrue(punto.argumento()==Math.atan(2/1));
	}
	@Test
	public void instanciacionDePuntoSinParametros() {
		Punto punto=new Punto();
		assertTrue(punto.getIm() == 0);
		assertTrue(punto.norma() == 0);
		assertTrue(punto.getRe() == 0);
	}
}
