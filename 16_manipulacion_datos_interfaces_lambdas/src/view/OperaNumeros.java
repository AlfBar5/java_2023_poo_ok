package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import service.ManipulacionesService;


/*

//creamos una clase que implemente la interfaz para los pares
class CriterioPares implements Predicate<Integer>{

	//aqui decido el criterio
	//decido cuando devuelve true o cuando false
	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t%2==0;
	}
	
	
	
}


*/


/*

//creamos una clase que implemente la interfaz para sumar los negativos
class CriterioNegativos implements Predicate<Integer>{

	//aqui decido el criterio
	//decido cuando devuelve true o cuando false
	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t<0;
	}
	
	
	
}



*/


/*

//Clase para guardar el fichero
//guardar en un fichero de dirección c:/temp/listanegativos.txt la lista de números
class GuardarFichero implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		
						
				//hay que poner el try cacht OBLIGATORIAMENTE
				try {FileOutputStream fos = new FileOutputStream("c:\\temp\\listanegativos.txt");
					PrintStream out= new PrintStream(fos);
					
					out.println(t);
					
				}
				catch(IOException ex){
					ex.printStackTrace();
				}
			
			
	}
	
}


*/

/*

class CriterioLongitud implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.length()>5;
	}
	
}

*/




public class OperaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numeros = List.of(-57,11,2,-1,10,8);
		
		//utilizando la clase manipulacionesservice, 
		//mostrar una suma de los pares por un lado
		//y la suma de los negativos por otro
		
		ManipulacionesService service= new ManipulacionesService();
		
		/*
		int total=0;
		total = service.sumaCriterio(numeros, new CriterioPares());
		System.out.println("Suma de los números pares: "+total);
		*/
		
		
		//usando expresiones lambda
		int total=0;
		
		//Predicate<Integer> implementacion=t->t%2==0;
		//total = service.sumaCriterio(numeros, implementacion);
		
		total = service.sumaCriterio(numeros, t->t%2==0);
		System.out.println("Suma de los números pares: "+total);
		
		
		
		/*
				
		int totalneg=0;
		totalneg = service.sumaCriterio(numeros, new CriterioNegativos());
		System.out.println("Suma de los números negativos: "+totalneg);
		
		*/
		
		int totalneg=0;
		
		//Predicate<Integer> implementacion2=t->t<0;
		//totalneg = service.sumaCriterio(numeros, implementacion2);
		
		totalneg = service.sumaCriterio(numeros, t->t<0);
		System.out.println("Suma de los números negativos: "+totalneg);
		
		
		
		//Le pasamos el criterio de negativos y el proceso de guardar fichero
		//el método guardar fichero sobreescribe el resultado, solo se verá el último negativo
		
		//service.procesaColeccionPorCriterio(numeros, implementacion2, new GuardarFichero());
		
		service.procesaColeccionPorCriterio(numeros, t->t<0, t->{

		//hay que poner el try cacht OBLIGATORIAMENTE
			try {FileOutputStream fos = new FileOutputStream("c:\\temp\\listanegativos.txt");
				PrintStream out= new PrintStream(fos);
				
				out.println(t);
				
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
				
		});
		
		
		/*
		List<String> nombres=List.of("pan","cadenalarga","vino","bicicleta");
		List<String> res=service.obtenerCadenasCriterio(nombres, new CriterioLongitud());
		System.out.println(res);
		
		*/
		
		
		List<String> nombres=List.of("pan","cadenalarga","vino","bicicleta");
		
		//Predicate<String> implementacion3=t->t.length()>5;
		//List<String> res=service.obtenerCadenasCriterio(nombres, implementacion3);
		
		List<String> res=service.obtenerCadenasCriterio(nombres, t->t.length()>5);
		
		System.out.println(res);
		
		
		
		
		//Subinterfaz de Function donde el tipo de entrada coincide con el de devolución
		UnaryOperator<String> impl = s->s.concat("by");
		
		// dos parametos y salida
		BiFunction<Double, Double, Double> impl2 = (a,b)->a+b;
		
		//no recibe parámetros
		Supplier<Double> impl3 = ()->Math.PI;
		
		//no devuelve nada
		Consumer <Integer> impl4 = n->System.out.println(n/10);
		
		//devuelve un boolean
		Predicate<Integer> impl5 = r->r>0&&r%5==0;
		
		
	}
	
	
	
	
	
	

}
