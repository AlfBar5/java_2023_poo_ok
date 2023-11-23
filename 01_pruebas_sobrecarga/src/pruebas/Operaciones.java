package pruebas;

public class Operaciones {
	
	
	/*
	 * 	 
	 * Todas las clases tienen un constructor por defecto 
     * (aunque explicitamente no lo hayamos creado nosotros) lo construye java
	 *
	 *
	 */
	
	//método sum con sobrecarga
	//método para sumar todos los parámetros que le mandamos
	//los tres puntos es número variable de parámetros
	//Para el interior del método, eso es un array. Hay que tratar la variable n como un array
	
	public int sum(int ... numeros) {
		
		int suma=0;
		for(int num:numeros) {
			
			suma+=num;
		}
		
		return suma;
	}

	
	// sobrecarga con parámetros fijos y otros variables
	// la sobrecarga variable tiene que ser el último definido y solo puede haber uno
	public int sumados(String s, int ... numeros) {
			
			String frase= s;
			
			int suma=0;
			for(int num:numeros) {
				
				suma+=num;
			}
			
			return suma;
		}
	
	
	
	//mismo método sobrecargado, con un int y con un array. Si lo llamamos se ejecuta la coincidencia exacta
	//si se llama con un int, el orden de preferencia es este
	public int multi(int s) {
		return 10;
	}
	
	public int multi(long k) {
		return 100;
	}
	
	public int multi(Integer n) {
		return 40;
	}
	
	public int multi(int ... datos) {
		return 30;
	}
	
	
	
	/*
	----------Este es el orden de preferencia en un método con sobrecarga
	-coincidencia exacta
	-promoción de tipos (conversión implicita entre primitivos
	-autoboxing
	-método con número variable de argumentos
	
	*/
	
	
	////////////////////
	
	
	//internamente estamos inclumpliendo las reglas de la sobrecarga, los dos son array
	// error de método duplicado
	
	/*
	public int div(int ... nums) {
		return 20;
	}
	
	
	public int div(int [] valores) {
		return 20;
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
}
