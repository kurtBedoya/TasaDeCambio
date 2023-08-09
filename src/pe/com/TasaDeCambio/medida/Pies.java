package pe.com.TasaDeCambio.medida;

public class Pies extends Medida {

	
	public double getCambioDeMetroA() {
		return super.getMedida()*0.3048;
	}

	
	public double getCambioAMetro() {
		return super.getMedida()*3.28084;
	}
	

	
}
