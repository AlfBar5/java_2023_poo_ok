import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test12CollectColecciones {

	public static void main(String[] args) {
		

		List<Integer> nums = List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		
		//crear una lista con todos los números positivos sin incluir repetidos
		System.out.println("---- crear una lista con todos los números + sin repetir --------");
		
		List<Integer> positivos = nums.stream() //Stream<Integer>
				.distinct() // Stream<Integer> solo distintos
				.filter(n->n>0) // Stream<Integer> solo positivos
				.collect(Collectors.toList());  //convertimos el stream en lista llamando al método toList() de la clase Collectors, que implementa la interfaz de collect
				//.toList(); // también valdría desde Java 16
		
		
		//Creando un conjunto Set que no admite elementos repetidos
		Set<Integer> positiv = nums.stream() //Stream<Integer>				
				.filter(n->n>0) // Stream<Integer> solo positivos
				.collect(Collectors.toSet()); 
		
		
		
		//toMap convertir a tabla con clave y valor
		List<String> empleados=List.of("111A,Angel","222B,Ana","333C,Juan");
		//generar una tabla, donde el código es la clave y el nombre el valor
		Map<String,String> emps= empleados.stream() //Stream<String>
				.collect(Collectors.toMap(s->s.split(",")[0], s->s.split(",")[1])); //dos funciones para indicarle al Collectors que campo es la clave y cuál es el valor)
				
		
		
		
		//AGRUPACIÓN POR DEPARTAMENTOS
		List<String> empleados2=List.of(
				"1A,ventas","2B,contabilidad","333C,ventas",
				"1A,contabilidad","222B,contabilidad","333C,almacén",
				"1A,almacén","2322B,almacén","333C,almacén",
				"1131A,ventas","22s42B,ventas","3343C,ventas"
				);
		
		
		System.out.println("----  AGRUPACIÓN POR CLAVE --------");
		
		//generar una tabla, donde el código es la clave y el nombre el valor
		Map<String,List<String>> division= empleados2.stream() //Stream<String>
				.collect(Collectors.groupingBy(s->s.split(",")[0])); 
		
		division.forEach((k,v)->System.out.println(k+":"+v));
		
		
		
		
		System.out.println("----  OTRA FORMA por departementos--------");
		
		division.forEach((k,v)->{
			System.out.println(k);
			v.forEach(n->System.out.println(n.split(",")[1]));
		});
		
		
		
		System.out.println("----  Generar dos listas: positivos y negativos --------");
		
		//A partir de la lista de números, generar un map con dos listas
		//negativos por un lado, positivos por otro
		
		Map<Boolean,List<Integer>> numeros=nums.stream()
				.collect(Collectors.partitioningBy(n->n>0)); //la condición para estar en la lista de trues, es ser positivo
		
		System.out.println(numeros);
		
		
		//partitioningBy solo puede haber dos grupos
		//con groupingBy hay n grupos
		
		
	}
	

}
