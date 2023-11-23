import java.util.List;

public class Test7MaxMin {

	public static void main(String[] args) {


		
		List<Integer> nums = List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		
		System.out.println("---- Mostrar el negativo más alto --------");
		
		System.out.println(
				
				nums.stream()
				.filter(n->n<0) //stream de los negativos
				.max((a,b)->a-b)  //opcional con el resultado, el negativo más alto
				.orElse(null) //orElse por si acaso el resultado es nulo
				);
		
		
		
		

	}

}
