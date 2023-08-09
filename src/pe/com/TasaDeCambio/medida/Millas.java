package pe.com.TasaDeCambio.medida;

public class Millas extends Medida {
	
	
	public double getCambioDeMetroA() {
		return super.getMedida()*1610 ;
	}

	
	public double getCambioAMetro() {
		return super.getMedida()*0.0621371;
	}
	

}
