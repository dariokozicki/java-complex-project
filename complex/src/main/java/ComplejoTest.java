import static org.junit.Assert.assertTrue;

import org.junit.Test;

import complex.Complejo;
import complex.NoPerteneceANingunFormatoException;

public class ComplejoTest {
	@Test 
	public void seIngresaUnComplejoParOrdenado(){
		Complejo complejo = new Complejo("(1,2)");
		assertTrue(complejo.getPunto().getRe() == 1);
		assertTrue(complejo.getPunto().getIm() == 2);
	}
	@Test 
	public void seIngresaUnComplejoBinomial(){
		Complejo complejo = new Complejo("1+2j");
		assertTrue(complejo.getPunto().getRe() == 1);
		assertTrue(complejo.getPunto().getIm() == 2);
	}
	@Test 
	public void seIngresaUnComplejoPolar(){
		Complejo complejo = new Complejo("[1,0]");
		assertTrue(complejo.getPunto().getRe() == 1);
		assertTrue(complejo.getPunto().getIm() == 0);
	}
	@Test (expected = NoPerteneceANingunFormatoException.class)
	public void seIngresaUnComplejoNoCorrespondienteConElFormato(){
		Complejo complejo = new Complejo(",0]");
	}
}
