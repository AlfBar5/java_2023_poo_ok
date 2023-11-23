package principal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import clases.OperacionesColecciones;

public class Test {

	public static void main(String[] args) {
		// crear una lista y un conjunto cualquiera de números enteros
		//probar el funcionamiento del método sumar()
		
		
		ArrayList<Integer> listanum = new ArrayList();
		
		listanum.add(4);
		listanum.add(5);
		listanum.add(6);
		
		HashSet<Integer> listanum2=new HashSet<>();
		
		listanum2.add(4);
		listanum2.add(6);
		listanum2.add(9);
		
		
		
		
		//crear un objeto de la clase operaciones colecciones
		OperacionesColecciones oper = new OperacionesColecciones();
		
		//Polimorfismo. Hemos hecho un método al que le podemos pasar distintos tipos de objetos tipo array
		//arraylist y HastSet
		System.out.println(oper.sumar(listanum));
		System.out.println("--------");
		System.out.println(oper.sumar(listanum2));
		System.out.println("--------");
		System.out.println(oper.juntarlistasnumeros(listanum,listanum2));
		System.out.println("--------");
		
		//otra forma con polimorfismo con set que es más amplio
		Set<Integer> resultado=oper.subconjunto(listanum,listanum2);
		for(Integer in:resultado) {
			System.out.println(in);
		}
		System.out.println("--------");
		
		
	}

}
