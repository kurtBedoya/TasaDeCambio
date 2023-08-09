package pe.com.TasaDeCambio.monedas;

public class Won extends moneda {


	public double getCambioSol() {
		return super.getCantidad()*0.0028;
	}

	public double getSolCambioA() {
		return super.getCantidad()*354;
	}

}
