package principal;



//Defino interfaz
interface Datos{
	
	static void print() {
		System.out.println("Interfaz datos");
	}
	
}



//Clase que implementa la interfaz datos
class Prueba implements Datos{
	
	//para llamar al método de la CLASE, hay que sobreescribir el método de la interfaz
	static void print() {
		System.out.println("clase datos");
	}
	
}






//main
public class Test {

	public static void main(String[] args) {
		
		//llamamos a la clase prueba y metodo print
		//no se puede así, ya que el método de la interfaz es estatico
		//es un método exclusivo de la interfaz
		//hay que llamar a la interfaz.metodo
		Datos.print();
		
		//una vez sobreescrito el método print de la interfaz en la clase, 
		//entonces sí podemos llamarlo
		Prueba.print();
		
		
		
	}

}
