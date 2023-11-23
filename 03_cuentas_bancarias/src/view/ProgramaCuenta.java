package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Movimiento;
import service.CuentaMovimientos;

/*
 
Pide el número de cuenta y saldo inicial, después:
1.- Ingresar
2.- Extraer
3.- Saldo y movimientos
4.- Salir

 */


public class ProgramaCuenta {

	
	//Creo un objeto CuentaMovimientos para poder acceder a sus métodos
	static CuentaMovimientos cuentamov;
	
	
	public static void main(String[] args) {
		
		Scanner scpedir=new Scanner(System.in);
		//pido codigo, saldo, pido límite y creo objeto CuentaMovimientos
		String codigo;
		double saldo,limite;
				
		System.out.println("Introduce el Código de cuenta: ");
		codigo=scpedir.nextLine();
				
		System.out.println("Introduce el saldo inicial:");
		saldo=Double.parseDouble(scpedir.nextLine());
		
		System.out.println("Introduce el límite:");
		limite=Double.parseDouble(scpedir.nextLine());
		
		//creo objeto cuentaMovimientos
		cuentamov = new CuentaMovimientos(codigo,saldo,limite);
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
		mostrarMenu();
		opcion=sc.nextInt();//lee la opción elegida
		switch(opcion) { //evaluamos
			case 1:
				ingresar();
				break;
			case 2:
				extraer();
				break;
			case 3:
				mostrarMovimientos();
				break;
						
			case 4:
				System.out.println("---Adios---");
		}
	}while(opcion!=4);
		

	}

	
	
	static void mostrarMenu() {
	System.out.println("1.- Ingresar dinero");
	System.out.println("2.- Extraer dinero");
	System.out.println("3.- Saldo y movimientos");
	System.out.println("4.- Salir");

	}
		
		


	
	static void ingresar(){
		Scanner sc=new Scanner(System.in);
		double cantidad;
		System.out.println("Introduce cantidad");
		cantidad=Double.parseDouble(sc.nextLine());
		cuentamov.ingresar(cantidad);
		
	}
	

	static void extraer() {
		Scanner sc=new Scanner(System.in);
		double cantidad;
		System.out.println("Introduce cantidad");
		cantidad=Double.parseDouble(sc.nextLine());
		cuentamov.extraer(cantidad);
	}
	
	static void mostrarMovimientos() {
		ArrayList<Movimiento> movs=cuentamov.obtenerMovimientos();
		for(Movimiento m:movs) {
			System.out.println("Tipo:"+m.getTipo()+" Cantidad:"+m.getCantidad()+" Fecha:"+m.getFechahora());
		}
		System.out.println("Saldo final: "+cuentamov.getSaldo());
	}
	
}
