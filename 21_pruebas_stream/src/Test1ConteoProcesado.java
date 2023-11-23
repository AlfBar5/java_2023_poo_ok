import java.util.List;

public class Test1ConteoProcesado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		
		
		System.out.println("----contar elementos--------");
		
		//contar elementos
		//nums.stream().count();
		System.out.println(nums.stream().count());
		
		System.out.println("--------imprimir los numeros--------");
		
		//imprimir los numeros
		nums.stream()
		.forEach(n->System.out.println(n));
		
		
		System.out.println("--------mostrar sin duplicados--------");
		
		
		//mostrar el contenido de una lista sin duplicados
		
		nums.stream()
		.distinct()  //devuelve un stream, es un método intermedios
		.forEach(n->System.out.println(n));
		
		
		
	}

}
