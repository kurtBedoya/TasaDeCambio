package pe.com.TasaDeCambio.monedas;

public class Euro extends moneda {
	
	

	public double getCambioSol() {
		return super.getCantidad()*4;
	}

	public double getSolCambioA() {
		return super.getCantidad()*0.25;
	}


}
