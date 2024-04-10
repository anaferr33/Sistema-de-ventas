package ar.edu.utn;



import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {
	 String nombre;
	public String apellido;
	public LocalDate fechaDeNacimiento;
		
	public Persona() {
	}

	public Persona(String nombre, String apellido, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public void display() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Edad: " + edad());
	}

	public long edad() {
		LocalDate hoy = LocalDate.now();
		long edad = ChronoUnit.YEARS.between(fechaDeNacimiento, hoy);
		return edad;
		
		
	}

}
