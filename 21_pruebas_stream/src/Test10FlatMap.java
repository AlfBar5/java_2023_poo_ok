import java.util.Arrays;
import java.util.List;

public class Test10FlatMap {

	public static void main(String[] args) {

		//cada elemento de esta lista es un array 
		//con las notas de una clase diferente
		//Cada elemento contiene un array diferente a su vez
		//Double elementos como objetos, no como double (que es un tipo primitivo)
		//Stream trabaja con objetos
		
		List<Double[]> notas=List.of(
				new Double[] {2.5,6.7,4.6,9.0,4.0},
				new Double[] {1.5,6.7,4.6,9.0},
				new Double[] {6.7,4.6,9.0},
				new Double[] {6.5,6.7,4.6,9.0},
				new Double[] {9.5,4.0,6.0}
				
				);
				
		//Nos piden el cálculo de la media de todo el centro de formación
		//flatMap
		
		System.out.println("----  Nota media de todo el colegio con objetos Double--------");
		
		System.out.println(
				
			notas.stream() //stream de arrays Stream<double>[]
			.flatMap(a->Arrays.stream(a)) //aplano todos los stream en un único stream.
			.mapToDouble(a->a) //cada elemento lo transformo en double - DoubleStream para poder usar el average()
			.average() //OptionalDouble
			.getAsDouble() 

		);
		
		
		
		
		
		
		
		
		
		List<double[]> notasprimi=List.of(
				new double[] {2.5,6.7,4.6,9.0,4.0},
				new double[] {1.5,6.7,4.6,9.0},
				new double[] {6.7,4.6,9.0},
				new double[] {6.5,6.7,4.6,9.0},
				new double[] {9.5,4.0,6.0}
				
				);
				
		//Nos piden el cálculo de la media de todo el centro de formación
		//flatMapToDouble
		
		System.out.println("----  Nota media de todo el colegio partiendo de tipos primitivos double --------");
		
		System.out.println(
				
			notasprimi.stream() //stream de arrays Stream<double>[]
			.flatMapToDouble(a->Arrays.stream(a)) //aplano todos los stream en un único stream. Ya directamente como DoubleStream
			//.mapToDouble(a->a) //cada elemento lo transformo en double - DoubleStream para poder usar el average()
			.average() //OptionalDouble
			.getAsDouble() 

		);
		
		
		
		
		
		
	}

}
