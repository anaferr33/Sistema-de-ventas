package ar.edu.utn;

public class DescuentoFijo extends Descuento{
	

	public float valorFinal(float valorInicial){
		return valorInicial - this.getValorDesc();
		} 
	
	public String toString() {
		return "Descuento Fijo";
	}
}
