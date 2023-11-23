import java.util.List;

public class Test6Ordenacion {

	public static void main(String[] args) {
		
		
		List<Integer> nums = List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		
		// cual es el número más pequeño
		//ordenamos y nos quedamos con el primero
		
		System.out.println("---- cual es el número más pequeño --------");
		
		System.out.println(
			nums.stream()
			.sorted() //devuelve un stream, ordenación predeterminada de menos a más
			.findFirst() //cogemos el primero
			.get() //hay algo seguro, no necesimos usar el orElse

			);
		
		
		
		
		// mostrar los cinco números más altos sin repetirlos
		System.out.println("---- mostrar los cinco números más grandes --------");
		
		
		nums.stream()
		.distinct() //stream de números sin repetir
		.sorted((a,b)->b-a) //ordenación inversa, de mayor a menor
		.limit(5) //cogemos los cinco primeros del stream
		.forEach(n->System.out.println(n)); // los pintamos
				
		
		
		
		//mostrar los números que van desde la posición 5 hasta la 10
		System.out.println("---- mostrar los números que van desde la posición 5 hasta la 10 --------");
		
		int pos1=5;
		int pos2=10;
		nums.stream()
		.skip(pos1-1) //stream saltando los 5 primeros números
		.limit(pos2-pos1) //me quedo con los que hay entre pos1 y pos2
		.forEach(n->System.out.println(n));
		
		
		
		
	}

}
