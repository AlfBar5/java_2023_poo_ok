package principal;

import clases.Mesa;
import clases.Punto3D;
import interfaces.Operaciones;


public class TestPolimorfismo {

	public static void main(String[] args) {
		// polimorfismo
		procesar(new Mesa(30,2,4));
		procesar(new Punto3D(5,3,2));

	}

	
	//método para cualquier objeto que implemente la interfaz operaciones
	//este método se puede usar para objetos de cualquier clase que implemente la interfaz
	public static void procesar(Operaciones oper) {
		//giramos 30 grados e invertimos resultado
		oper.girar(30);
		System.out.println(oper.invertir());
	}
	
	
}
