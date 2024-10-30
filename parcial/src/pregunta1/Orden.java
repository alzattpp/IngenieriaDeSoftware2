package pregunta1;

	public class Orden {
	public double calcularTotalConImpuesto(double precio) {
		double impuesto = price * 0.1;
		return precio + impuesto;
	}
	
	public double caslcularDescuentoTotal(double precio, double descuento) {
		double descuentoPrecio = precio - descuento;
		double impuesto = descuentoPrecio * 0.1;
		return descuentoPrecio + impuesto;
	}

}
