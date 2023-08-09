package pe.com.TasaDeCambio.monedas;

public class LibrasEsterlinas extends moneda {



	public double getCambioSol() {
		return super.getCantidad()*4.7;
	}

	public double getSolCambioA() {
		return super.getCantidad()*0.21;
	}

}
