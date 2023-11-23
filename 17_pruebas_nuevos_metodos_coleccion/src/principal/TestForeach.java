package principal;

import java.util.HashMap;
import java.util.List;

public class TestForeach {

	public static void main(String[] args) {
		// forEach(Consumer<E> action)
		// Recibe como parámetro un Consumer y aplica ese Consumer a cada elemento de la lista

		//Creo una lista de enteros
		List<Integer> numeros = List.of(7,12,9,3,6,4);
				
		//Imprimir por pantalla de la forma clásica
		for(Integer n:numeros) {
			System.out.println(n);
		}

		System.out.println("--------------");
		
		//De la nueva forma
		//programación funcional. Lógica de aplicación a partir de funciones
		//sin instrucciones de control
		
		numeros.forEach(n->System.out.println(n));
		
		////misma línea con referencias a métodos
		//numeros.forEach(System.out::println);
	
		
		System.out.println("--------------");
		
		
		

		//HashMap<Integer, String> dias =new HashMap<Integer, String>();
		HashMap<Integer, String> dias =new HashMap<>();
		dias.put(100,  "Lunes");
		dias.put(200,  "Martes");
		dias.put(300,  "Miércoles");
		dias.put(400,  "Jueves");
		dias.put(500,  "Viernes");
		
		
		
		
		////Imprimir claves y valores de la forma clásica
		var valores=dias.values();
		for(String s:valores) {
			System.out.println(s);
		}
		
		
		System.out.println("---");
		
		var claves=dias.keySet();
		for(int s:claves) {
			System.out.println(s);
		}
		
		
		System.out.println("--------------");
		
		//
		//Clave k, valores v
		dias.forEach((k,v)->System.out.println(k+":"+v));
		
		

		System.out.println("--------------");
		


	}

}
