package principal;




//interfaz
interface PrinterDos{
	void print(String s);
}



//crear implementación de la interfaz en la que el método muestre por pantalla el parámetro
////Forma clásica, creando una clase
// No tengo que crear una clase que implemente la intefaz





public class ImplementacionFuncionalLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaro la variable: Printer printer
		//Esta es la clase creada con lambda: s->System.out.println(s);
		PrinterDos printer=s->System.out.println(s);
		
		//llamo al método print
		printer.print("Implementación con lambdas");
		
		
		
	}

}
