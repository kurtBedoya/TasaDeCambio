package pe.com.TasaDeCambio.medida;

public class Kilometro extends Medida {

	
	public double getCambioDeMetroA() {
		return super.getMedida()*1000;
	}

	
	public double getCambioAMetro() {
		return super.getMedida()*0.001;
	}

}
