package pe.com.TasaDeCambio.test;

import pe.com.TasaDeCambio.control.*;
import pe.com.TasaDeCambio.monedas.Dolar;
import pe.com.TasaDeCambio.monedas.moneda;

public class TestSolCambioA {
	
	public static void main(String[] args) {
		
		moneda dolar = new Dolar();
		
		dolar.setCantidad(100);
		
		ControlSolCambio controlSolCambio = new ControlSolCambio();
		
		controlSolCambio.registrarCantidad(dolar);
		
			
		
		
	}


}
