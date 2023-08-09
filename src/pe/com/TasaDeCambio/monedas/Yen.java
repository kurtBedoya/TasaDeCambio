package pe.com.TasaDeCambio.monedas;

public class Yen extends moneda {


	public double getCambioSol() {
		return super.getCantidad()*0.026;
	}

	public double getSolCambioA() {
		return super.getCantidad()*39;
	}
	

}
