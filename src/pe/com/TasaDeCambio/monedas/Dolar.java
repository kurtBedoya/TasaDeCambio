package pe.com.TasaDeCambio.monedas;

public class Dolar extends moneda {
	

	public double getCambioSol() {
		return super.getCantidad()*3.65;
	}

	public double getSolCambioA() {
		return super.getCantidad()*0.27;
		
		
	}

}
