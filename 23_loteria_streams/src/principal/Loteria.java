package principal;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Loteria {

	public static void main(String[] args) {

		// generar combinacion lotería primitiva
		// mientras haya menos de 6 números generados
		// generamos un número y comprobamos que no se haya generado antes (repetido)
		// en caso de que sea nuevo, lo guardamos y sino vamos a por el siguiente
		
		//rango de 1 a 49
		Stream.generate(()->(int)(Math.random()*49+1)) //Stream<Integer> genera numeros
		.distinct() //distintos
		.limit(6) //límite 6
		.sorted() //ordenar
		.forEach(n->System.out.println(n+",")); //imprimir

		
		
		
	}

	
}
