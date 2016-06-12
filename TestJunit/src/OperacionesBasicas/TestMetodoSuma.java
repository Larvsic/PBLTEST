package OperacionesBasicas;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class TestMetodoSuma {
	
	@Test
	public void prueba1(){
		Ejercicio1 ejercicio1Suma = new Ejercicio1();
		int respuesta = ejercicio1Suma.metodoSuma(10, 1);
		int resultadoEsperado = 11;
		Assert.assertEquals(respuesta, resultadoEsperado);
		
	}
	
	@Test
	public void prueba2(){
		Ejercicio1 ejercicio = new Ejercicio1();
		Assert.assertTrue(ejercicio.metodoSuma(4,4) == 8);
		Assert.assertFalse(ejercicio.metodoSuma(4, 4)==4);
	}

}
