import java.util.Arrays;
import java.util.List;

public class Test5FindFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		
		//Cual es el primer número negativo de la lista
		
		//hace las devoluciones en una clase que se llama optional con get()
		//se usa get() por si la devolución viene vacia
		
		System.out.println("---- primer número negativo de la lista --------");
		
		System.out.println(
				
				nums.stream()
				.filter(n->n<0) //stream con los negativos
				.findFirst().get()
				
				);
		
		

		// con caracteres
		//nombre del primer producto que empiece por a
		// si no hay ninguno, que muestre "no hay ninguno"
		
		String nombres= "leche,atún,vino,patatas,leche,agua,vino,lechuga";
		
		
		System.out.println("---- nombre del primer producto que empiece por a --------");
		
		//Convertimos el string en un array
		//String [] nomb = nombres.split(",");
		//Stream<String> nom = Arrays.stream(nombres.split(","));
		
		System.out.println(
				
		Arrays.stream(nombres.split(",")) //stream
		.filter(s->s.startsWith("a")) //stream empiezan por "a"
		.findFirst() //stream, nos quedamos con el primero
		.orElse("No hay ninguno") //devolución. Si no hay ninguno, pintar texto alternativo
		
		);
		
		
		
	}

}
