package pe.com.TasaDeCambio.medida;

public abstract class Medida {
	
	
	private double medida;
	
	
	public abstract double getCambioDeMetroA();
	public abstract double getCambioAMetro();
	
	public double getMedida() {
		return medida;
	}

	public void setMedida(double medida) {
		this.medida = medida;
	}
	


}
