package pe.com.TasaDeCambio.test;

import pe.com.TasaDeCambio.control.ControlCambio;
import pe.com.TasaDeCambio.monedas.Dolar;
import pe.com.TasaDeCambio.monedas.Yen;
import pe.com.TasaDeCambio.monedas.moneda;

public class TestCambioSol {
	
	public static void main(String[] args) {
		
		moneda dolar = new Dolar();
		moneda yen = new Yen();
		
		dolar.setCantidad(100);
		yen.setCantidad(100);
		
		ControlCambio controlCambio = new ControlCambio();
		controlCambio.registrarCantidad(dolar);
		controlCambio.registrarCantidad(yen);
				
		
		
	}


}
