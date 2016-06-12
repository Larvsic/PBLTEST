package OperacionesBasicas;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio1Testeos {
	
	@Test
	public void metodoSumaTesteo(){
		
		Ejercicio1 ejercicio = new Ejercicio1();
		int respuesta = ejercicio.metodoSuma(8, 9);
		int respuestaEsperda = 17;
		assertEquals(respuesta, respuestaEsperda);
		
	}
	
	@Test
	public void metodoRestaTesteo(){
		Ejercicio1 ejercicio = new Ejercicio1();
		//int respuesta = ejercicio.metodoResta(8, 8);
		Assert.assertTrue(ejercicio.metodoResta(8, 8) == 0);
		
	}

}


