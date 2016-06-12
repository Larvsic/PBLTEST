package OperacionesBasicas;
import org.junit.Assert;
import org.junit.Test;

public class TestMetodoResta {
	
	@Test
	public void pruebaResta(){
		Ejercicio1 ejercicioResta = new Ejercicio1();
		int respuestaResta = ejercicioResta.metodoResta(10, 2);
		int expected = 8;
		Assert.assertEquals(respuestaResta, expected);
	}

}
