package service;

public class Cuenta {

	//definimos atributos o propiedades
	private String codigoCuenta;
	private double saldo;
	
	// constructor
	public Cuenta(String codigoCuenta, double saldo) {
		
		this.codigoCuenta = codigoCuenta;
		this.saldo = saldo;
	}

	//Constructor regalamos 50€
	public Cuenta(String codigoCuenta) {
		
		this.codigoCuenta = codigoCuenta;
		this.saldo=50;
	}
	
	
	//MÉTODO ingresar
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	
	//MÉTODO extraer
	public void extraer(double cantidad) {
		saldo-=cantidad;
	}
	
	
	//metodo getter para consultar el saldo en cualquier momento
	public double getSaldo() {
		return saldo;		
	}
	
	
	
}
