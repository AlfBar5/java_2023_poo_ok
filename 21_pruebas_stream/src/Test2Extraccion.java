import java.util.List;

public class Test2Extraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		
		//muestra los siete primeros números no repetidos
		
		System.out.println("---- 7 primeros no repetidos--------");
		
		nums.stream()
		.distinct()  //devuelve un stream, es un método intermedios
		.limit(7)
		.forEach(n->System.out.println(n));
		
		
		//hay algún negativo?
		//Devuelve true si algún elemento del Stream cumple con la condición del predicado
		System.out.println("---- ver si hay negativos en la lista --------");
		
		System.out.println(				
		nums.stream()
		.anyMatch(n->n<0)		
		);
		
		
		//son todos pares? 
		//pregunto si todos cumplen algo
		
		System.out.println("---- ver si todos son pares --------");
		
		System.out.println(				
				nums.stream()
				.allMatch(x->x%2==0)		
				);
		
	}

}
