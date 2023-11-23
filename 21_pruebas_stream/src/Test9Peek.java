import java.util.List;

public class Test9Peek {

	public static void main(String[] args) {
		
		// Mostrar todos los números positivos y la suma de los mismos
		// forEach intermedio
		System.out.println("----  Mostrar todos los números positivos y la suma de los mismos --------");
		List<Integer> nums = List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		
		System.out.println(
			nums.stream()
			.filter(n->n>0)
			.peek(n->System.out.println(n))
			.mapToInt(n->n)
			.sum()
		);
				
	}

}
