package pe.com.TasaDeCambio.medida;

public class Yardas extends Medida {
	
	
	public double getCambioDeMetroA() {
		return super.getMedida()*0.9144;
	}

	
	public double getCambioAMetro() {
		return super.getMedida()*1.09361;
	}

}
