package service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import model.Movimiento;

/*

	Clase CuentaMovimientos
	Clase que hereda CuentaLimite. Incopora un nuevo método obtenerMovimientos
	que devolverá un ArraList con los movimientos realizados
	en la cuenta
	Cada movimiento se define por: cantidad, fechaHora, tipo (ingreso o extracción)
	
*/
	

public class CuentaMovimientos extends CuentaLimite {
	

	// definimos array para guardar movimientos
	ArrayList<Movimiento> movimientos= new ArrayList<>();
	
	
	
	//constructor
	public CuentaMovimientos(String codigoCuenta, double saldo, double limite) {
		
		//llamamos al constructor de la superclase
		super(codigoCuenta, saldo, limite);
		
			}

	
	public ArrayList<Movimiento> obtenerMovimientos(){
		return movimientos;
	}

	
	
	
	//Hay que sobreescribir los métodos ingresar y extraer otra vez
	//si yo quiere que cuando saque o meta dinero se registre en los movimientos, hay que definirlos otra vez
			
	//MÉTODO ingresar
	// el control del límite ya lo hacen la clase de la que hereda
	@Override
	public void ingresar(double cantidad) {
		
			movimientos.add(new Movimiento(cantidad,LocalDateTime.now(),"Extracción"));
			super.ingresar(cantidad);
						
	}
		
		
		
		
	//MÉTODO extraer
	// el control del límite ya lo hacen la clase de la que hereda
	@Override
	public void extraer(double cantidad) {
		
			movimientos.add(new Movimiento(cantidad,LocalDateTime.now(),"Ingreso"));			
			super.extraer(cantidad);
			
	}
		
		
	

}
