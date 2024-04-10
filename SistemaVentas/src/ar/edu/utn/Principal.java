package ar.edu.utn;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args){
				
		/*		
		Persona persona1 = new Persona();
		persona1.apellido= "Gomez";
		persona1.nombre= "Ana";
		persona1.fechaDeNacimiento= LocalDate.of(1970, 5, 12);
		persona1.display();
		
		LocalDate fecha = LocalDate.of(1987, 12, 24);
		Persona persona2 = new Persona("Claudio", "Paz", fecha);
		persona2.display();
		//System.out.println(persona1.nombre);*/
		
		
		/*Descuento desc1 = new DescuentoFijo();
		desc1.setValorDesc(14.0F);
		System.out.println(desc1.valorFinal(10)); // 86
		//-----------------------------
		Descuento desc2 = new DescuentoPorcentaje();
		desc2.setValorDesc(0.3F);
		System.out.println(desc2.valorFinal(10)); // 70
		
		
		String a = desc1.toString();
		System.out.println(a);
		
		System.out.println(desc2);*/
		
		
		//GENERO PRODUCTOS
		Producto p1 = new Producto("LECHE");
		Producto p2 = new Producto("CAFE");
		Producto p3 = new Producto("MATE");
		Producto p4 = new Producto("AZUCAR");
		Producto p5 = new Producto("SAL", "Sal fina de mesa", 5, 150.0);
		Producto p6 = new Producto("Aceite", 550.50, 20);
		p4.cantidad = 5;
		
		//CREO EL CARRITO DE COMPRAS
		CarritoCompra c = new CarritoCompra();
		
		//GENERAR ITEMS
		ItemCarrito i1 = new ItemCarrito(p4, 2);
		ItemCarrito i2 = new ItemCarrito(p1, 3);
		ItemCarrito i3 = new ItemCarrito(p6, 3);
		
		//AGREGO ITEMS AL CARRITO
		c.agregarItem(i1);
		c.agregarItem(i2);
		c.agregarItem(i3);
		
		//MUESTRO LOS PRODUCTOS ASOCIADOS AL CARRITO
		c.mostrarCarrito();
		
		
		

}
}	
