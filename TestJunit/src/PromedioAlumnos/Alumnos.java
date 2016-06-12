package PromedioAlumnos;

public class Alumnos {
	private String nombre;
	private int notaParcial;
	private int notaFinal;
	
	public Alumnos(String nombre, int notaParcial, int notaFinal){
		this.nombre = nombre;
		this.notaParcial = notaParcial;
		this.notaFinal = notaFinal;
	}
	
	public int promedioAlumnos(){
		return (this.notaParcial + this.notaFinal)/2;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getNotaParcial() {
		return notaParcial;
	}
	public int getNotaFinal() {
		return notaFinal;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}
	public void setNotaParcial(int notaParcial) {
		this.notaParcial = notaParcial;
	}
	
}
