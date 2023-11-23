import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test8Map {

	public static void main(String[] args) {


		String nombres= "leche atún,vino,patatas,mantequilla-ajo,arroz,lechuga";
		
		
		//Mostrar las longuitudes de cada texto de menor a mayor
		System.out.println("---- Mostrar las longuitudes de cada texto --------");
		
		//Arrays.stream(nombres.split(","))  //stream de cadenas
		//le decimos al split que hay varios tipos de separadores: coma, espacio, guión medio
		Arrays.stream(nombres.split("[, -]"))  //stream de cadenas
		.map(s->s.length())   //transforma el string de cadenas de caracteres en un string de integer)
		.sorted()  //ordenamos
		.forEach(n->System.out.println(n)); //muestra las longuitudes de los nombres
		
		
		
		
		//Mostrar el total de caracteres de todos los productos, sin contar repetidos
		System.out.println("---- Mostrar el total de caracteres de todos los productos --------");
		
		System.out.println(
				
		Arrays.stream(nombres.split("[, -]"))  //stream de cadenas Stream<string>
		.distinct() //eliminamos cadenas duplicadas, aunque en este caso no hay ninguna
		.mapToInt(s->s.length())  //IntStream
		.sum()
		
				);
		

		
		
		//OTRA FORMA DEL ANTERIOR
		//Mostrar el total de caracteres de todos los productos, sin contar repetidos
		System.out.println("---- 2 Mostrar el total de caracteres de todos los productos --------");
		
		System.out.println(
				
		Arrays.stream(nombres.split("[, -]"))  //stream de cadenas Stream<string>
		.distinct() //eliminamos cadenas duplicadas, aunque en este caso no hay ninguna
		.collect(Collectors.summingInt(s->s.length()))
		
				);
		

		
		
		
		
		
		
		
		
		//calcula la media de todos los positivos
		System.out.println("---- calculo de la media de todos los positivos --------");
		List<Integer> nums = List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		
		System.out.println(
				
				nums.stream()
				.filter(n->n>0) //stream números positivos
				.mapToInt(n->n)  //IntStream //convertimos a interfaz IntStream
				.average() //calculamos la media
				.orElse(0)
				
		);
		
		
		//OTRA FORMA DEL ANTERIOR
		//calcula la media de todos los positivos
		System.out.println("---- 2 calculo de la media de todos los positivos --------");
		List<Integer> nums22 = List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		
		System.out.println(
				
				nums22.stream()
				.filter(n->n>0) //stream números positivos
				.collect(Collectors.averagingDouble(n->n))
				
		);
		
		
		
		
		
		
	}

}
