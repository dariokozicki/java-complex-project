import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import complex.FuncionSinusoidal;
import complex.FuncionSinusoidalFormatoException;

public class FuncionSinusoidalTest {
	@Test
	public void FuncionCorrectaIngresada() {
		FuncionSinusoidal funcion = new FuncionSinusoidal("4cos(3t+2)");
		assertTrue(funcion.getAmplitud() == 4);
		assertEquals(funcion.getOperacion(),"cos");
		assertTrue(funcion.getFrecuencia() == 3);
		assertTrue(funcion.getFaseInicial() == 2);
	}
	@Test(expected = FuncionSinusoidalFormatoException.class)
	public void FuncionIncorrectaIngresada() {
		new FuncionSinusoidal("hola");
	}
}
