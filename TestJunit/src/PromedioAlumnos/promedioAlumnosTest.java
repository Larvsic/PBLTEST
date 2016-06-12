package PromedioAlumnos;

import static org.junit.Assert.*;

import org.junit.Test;

public class promedioAlumnosTest {
	
	
	public void alumnoTest(){
		
	}
	
	@Test
	public void alumnoPromedioTest(){
		Alumnos alumnos = new Alumnos("Luis", 10, 10);
		int resultado = alumnos.promedioAlumnos();
		assertEquals((10+10)/2, resultado);
		
	}
	
	@Test
	public void alumnosPromediOtraFormaTest(){
		Alumnos alumno = new Alumnos("Luis", 4, 6);
		int resultado = alumno.promedioAlumnos();
		int expected = 5;
		assertEquals(resultado,expected);
	}

}
