package principal;

import java.util.ArrayList;
import java.util.List;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List es inmutable
		//para poder eliminar elementos convertimosla lista en arraylist
		List<Integer> numeros = new ArrayList<>(List.of(7,12,-9,3,-6,4));
		
		//ordenamos de menor a mayor
		//a,b son parejas de números
		
		//numeros.sort((a,b) -> a>b?1:-1); //una forma
		
		numeros.sort((a,b)->a-b); //segunda forma
		
		numeros.forEach(n->System.out.println(n));
		
		System.out.println("----------------");
		
		//ordenar de mayor a menor
		numeros.sort((a,b)->b-a); //segunda forma
		
		numeros.forEach(n->System.out.println(n));
		
		System.out.println("----------------");
		
		////ordenar alfabeticamente un arraylist de cadenas de caracteres
		List<String> cadenaalfa = new ArrayList<>(List.of("Marcos","Lucas","Laura","Angela","Elena","Zacarías"));
		cadenaalfa.sort((a,b)->a.compareTo(b)); 
		
		////misma línea que la anterior con referencia a método ::
		//cadenaalfa.sort(String::compareTo);
	
		cadenaalfa.forEach(n->System.out.println(n));
		
	}

}
