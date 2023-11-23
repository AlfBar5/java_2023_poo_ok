package principal;

import java.util.ArrayList;
import java.util.List;

public class TestReplaceAll {

	public static void main(String[] args) {
		// sustituye cada elemento de la lista por su cuadrado
		
		//List es inmutable
		//para poder eliminar elementos convertimosla lista en arraylist
		List<Integer> numeros = new ArrayList<>(List.of(7,12,-9,3,-6,4));
		
		numeros.replaceAll(n->n*n);
		
		numeros.forEach(n->System.out.println(n));
		

	}

}
