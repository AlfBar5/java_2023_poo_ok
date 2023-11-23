package p2;

import p1.Uno;

public class Dos extends Uno {
	
	
	public void metodo() {
		
		// a=3; //no se puede
		// b=5; //no se puede
		c=6;
		d=20;
		
		//creamos un objeto de la clase Uno en otro paquete distinto
		//Solo podemos acceder a los métodos públicos
		Uno uno = new Uno();
		uno.d=40; //solo se puede usar el atributo público 
		//uno.c=30; //no se puede acceder al atributo del paquete uno
		c=30; //sí se puede, solo a traves de herencia
		//uno.b=45; //no se puede
		//uno.a //no se puede
	}

}
