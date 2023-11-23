package principal;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List es inmutable
		//para poder eliminar elementos convertimosla lista en arraylist
		List<Integer> numeros = new ArrayList<>(List.of(7,12,-9,3,-6,4));
		
		//eliminar los negativos
		numeros.removeIf(n->n<0);
		numeros.forEach(n->System.out.println(n));
		
		
	}

}
