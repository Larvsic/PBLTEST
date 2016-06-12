package SerieFibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiboTest {
	@Test
	public void numeroDentroSerieTest(){
		Fibo serie = new Fibo();
		int n = 5;
		boolean expected = true;
		boolean respuesta = serie.ehFibonacci(n);
		assertEquals(respuesta,expected);
		
	}
	
}
