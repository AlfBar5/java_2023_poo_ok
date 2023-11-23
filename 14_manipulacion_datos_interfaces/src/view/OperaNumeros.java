package view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import service.ManipulacionesService;


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




class CriterioLongitud implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.length()>5;
	}
	
}






public class OperaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numeros = List.of(-57,11,2,-1,10,8);
		
		//utilizando la clase manipulacionesservice, 
		//mostrar una suma de los pares por un lado
		//y la suma de los negativos por otro
		
		ManipulacionesService service= new ManipulacionesService();
		
		int total=0;
		total = service.sumaCriterio(numeros, new CriterioPares());
		System.out.println("Suma de los números pares: "+total);
		
				
		int totalneg=0;
		totalneg = service.sumaCriterio(numeros, new CriterioNegativos());
		System.out.println("Suma de los números negativos: "+totalneg);
		
		//Le pasamos el criterio de negativos y el proceso de guardar fichero
		//el método guardar fichero sobreescribe el resultado, solo se verá el último negativo
		service.procesaColeccionPorCriterio(numeros, new CriterioNegativos(), new GuardarFichero());
		
		
		List<String> nombres=List.of("pan","cadenalarga","vino","bicicleta");
		List<String> res=service.obtenerCadenasCriterio(nombres, new CriterioLongitud());
		System.out.println(res);
		
	}
	
	
	
	
	
	

}
