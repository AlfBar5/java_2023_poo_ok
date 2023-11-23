import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test4Filter {

	public static void main(String[] args) {


		List<Integer> nums = List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		
		// Filter
		//Cuantos numeros pares hay
		
		System.out.println("---- Cuantos numeros pares hay --------");
		
		System.out.println(nums.stream()
				.distinct()
				.filter(n->n%2==0)
				.count());
		
		
		
		// con caracteres
		//cuántos productos de menos de 6 caracteres hay?
		String nombres= "leche,atún,vino,patatas,leche,agua,vino,lechuga";
		
		
		System.out.println("---- Cuantos numeros pares hay --------");
		
		//Convertimos el string en un array
		//String [] nomb = nombres.split(",");
		
		//Stream<String> nom = Arrays.stream(nombres.split(","));
		
		System.out.println(
				
		Arrays.stream(nombres.split(",")) //stream
		.distinct() //stream
		.filter(s->s.length()<6) //stream
		.count()
		
		);
				
		
	}

}
