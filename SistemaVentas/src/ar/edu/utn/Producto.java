package ar.edu.utn;

import java.time.LocalDate;

public class Producto {
	private String nombre;
	private String descripcion;
	private LocalDate fechaAlta;
	private int pesoKg;
	private double precio;
	private static final Double minPrecio = 0.1;
	public int cantidad;

	public Producto(String nombre, String descripcion, int pesoKg, double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaAlta = LocalDate.now();
		this.pesoKg = pesoKg;
		this.precio = precio;
	}

	public Producto(String nombre) {
		this.nombre = nombre;
		this.fechaAlta = LocalDate.now();
		this.precio = minPrecio;
	}
	
	
	

	public Producto(String nombre, double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		
	}

	
	public boolean hayStock() {
		if (cantidad > 0)
			return true;
		else
			return false;
	}

	public double getPrecio() {
		return precio;
	}
	
	/*public void mostrarProducto() {
		System.out.print("Producto: "+nombre+ " - ");
		System.out.print("Precio: "+precio);
	}*/

}
