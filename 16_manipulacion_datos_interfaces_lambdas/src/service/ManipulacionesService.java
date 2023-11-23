package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;



public class ManipulacionesService {
	
	/*
	
	//método de números enteros y que tiene que devolver la suma de todos los pares
	public int sumaPares(List<Integer> numeros) {
		int suma=0;
		for(Integer in:numeros) {
			if(in%2==0) {
				suma+=in;
			}
		}
		return suma;
	}

	
	
	//método. A partir de una lista de números enteros, suma los números positivos de la lista
	public int sumaPositivos(List<Integer> numeros) {
		int suma=0;
		for(Integer in:numeros) {
			if(in>0) {
				suma+=in;
			}
		}
		return suma;
		
	}
	
	//Metodos para sumar los múltiplos de 5
	  
	
	 */
	
	
	
	// INTERFAZ PREDICATE<T>
	//implementamos el método predicate, me dan una lista y una condición
	
	//Creamos un método para sumar los números de la lista que cumplar el criterio (condición)
	//valdrá para todos
	// devuelve un entero
	
	public int sumaCriterio(List<Integer> numeros, Predicate<Integer> criterio) {
		
		int suma=0;
		for(Integer in:numeros) {
			if(criterio.test(in)) {
				suma+=in;
			}
		}
		return suma;
		
	}
	
	
	
	
	
	
	// interfaz CONSUMER
	//método que recibe una lista de enteros y los imprime
	//método que recibe una lista de enteros y los guarda en un fichero
	//método que recibe una lista de enteros y los manda a la nube
	//Con un método consumer<T> -- Toma un dato y hace algo con él
	//no devuelve nada
	
	public void procesaLista(List<Integer> numeros, Consumer<Integer> consumer) {
		
		//recorro cada número de la lista y accept
		for(Integer num:numeros) {
			consumer.accept(num);
			
		}
		
		
	}
	
	
	
	////UNIÓN DE LOS OTROS DOS ANTERIORES PREDICATE Y CONSUMER
	//método que recibe una lista de enteros e imprime los pares
	//método que recibe un conjunto de enteros y guarda en un fichero los positivos
	//método que recibe una lista de enteros y manda a la nube los múltiplos de cinco
	
	public void procesaColeccionPorCriterio(Collection<Integer> numeros, 
											Predicate<Integer> criterio, 
											Consumer<Integer> proceso) {
		
	
		//recorro cada número de la colección (admite tanto listas como conjuntos
		//si el número cumple el criterio, se realiza el proceso
		for(Integer n:numeros) {
			if(criterio.test(n)) {
				proceso.accept(n);
			}
			
		}
		
		
	}
	
	
	
	 // INTERFAZ FUNCTION<T,R>
	// TRANSFORMA EL DATO EN OTRO antes de lo que tengas que hacer con él
	//método que recibe colección de enteros y devuelve la suma de los cuadrados de esos números
	//método que recibe colección de enteros y devuelve la suma de las raices cúbicas de esos números
	public int sumaTransformacion(Collection<Integer> numeros, UnaryOperator<Integer> fun) {
		
		int suma=0;
		//se aplica la operación fun a cada número de la lista y se suman todos
		for(Integer n:numeros) {
			suma+=fun.apply(n); //se acumula el resultado de operar el número
		}
		return suma;
	}
	
	
	
	// Método que recibe una colección de cadenas de texto y devuelva una lista
	// con aquellas que cumplan con el predicado recibido como parametro
	//parametro coleccion devolución lista
	
	public List<String> obtenerCadenasCriterio(Collection<String> cadenas, Predicate<String> criterio){
		
		//creo lista de datos tipo arraylist
		List<String> datos = new ArrayList<>();
		
		//metemos en este arraylist las cadenas que cumplan el predicado (criterio)
		for(String s:cadenas) {
			if(criterio.test(s)) {
				datos.add(s);
			}
		}
		
		return datos;
		
	}
	
	
	
}
