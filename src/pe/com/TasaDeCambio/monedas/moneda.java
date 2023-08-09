package pe.com.TasaDeCambio.monedas;

public abstract class moneda {
	
	//public String tipo;
	private double cantidad;
	

	public abstract double getCambioSol();
	
	public abstract double getSolCambioA();
	
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}


}
