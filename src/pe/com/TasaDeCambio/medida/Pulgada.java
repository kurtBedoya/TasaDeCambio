package pe.com.TasaDeCambio.medida;

public class Pulgada extends Medida {

	
	public double getCambioDeMetroA() {
		return super.getMedida()*0.0254 ;
	}

	
	public double getCambioAMetro() {
		return super.getMedida()*39.3701;
	}

	
}
