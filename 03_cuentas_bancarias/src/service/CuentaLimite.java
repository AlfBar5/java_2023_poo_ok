package service;

public class CuentaLimite extends Cuenta{
	
	//clase cuenta límite, que hereda de cuenta
	//incorpora un atributo llamado límite para limitar la extracción  a dicho valor
	//cuando alguien intenta sacar o ingresar solo puede hacerlo hasta ese límite 
	//Dispondrá de un método ajustarLimite(), para cambiar el límite a la mitad del saldo
	//límite se inicializa en el constructor
	
	private double limite;
	
	// constructor
	public CuentaLimite(String codigoCuenta, double saldo, double limite) {
		
		//llamamos al constructor de la superclase
		super(codigoCuenta,saldo);
		this.limite=limite;	
		
	}
	
	
	public double ajustarLimite() {
		limite=getSaldo()/2;
		return limite;
				
	}
	
	
	/*
	
	//MÉTODO ingresar
	@Override
	public void ingresar(double cantidad) {
		super.ingresar(cantidad);
		
		if (cantidad<=limite) {
			super.ingresar(cantidad);
		}else {
			super.ingresar(limite);;
		}
		
	}
	
	*/
	
	
	//MÉTODO extraer
	@Override
	public void extraer(double cantidad) {
		super.extraer(cantidad);
		
		// si no supera el límite, se saca el dinero.
		// si supera el límite solo deja sacar el límite
		if (cantidad<=limite) {
			super.extraer(cantidad);
		}else {
			super.extraer(limite);
		}
	}
	
	
	
	
	

}
