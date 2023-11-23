package principal;




//interfaz
interface Printer{
	void print(String s);
}


//crear implementación de la interfaz en la que el método muestre por pantalla el parámetro
////Forma clásica, creando una clase
class PrinterPantalla implements Printer{

	@Override
	public void print(String s) {
		System.out.println(s);
		
	}
	
}




public class ImplementacionFuncionalClasica {

	public static void main(String[] args) {

		//creo un objeto printer pantalla
		Printer printer=new PrinterPantalla();
		printer.print("implementación clásica");
		
		
		

	}

}
