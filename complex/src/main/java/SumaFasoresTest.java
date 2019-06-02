import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import complex.FuncionSinusoidal;
import complex.SumaFasores;

public class SumaFasoresTest {
	@Test
	public void sumaDeFasoresMismaFrecuenciaMismoOperador() {
		SumaFasores suma= new SumaFasores("2cos(2t+0)","3cos(2t+0)");
		FuncionSinusoidal funcion =suma.SumarFasores();
		assertEquals(funcion.getOperacion(),"cos");
		assertEquals(funcion.getOperacion(),"cos");
		assertTrue(funcion.getAmplitud()==5);
		assertTrue(funcion.getFrecuencia()==2);
		assertTrue(funcion.getFaseInicial()==0);
	}
}
