package principal;


//vamos a crear una implementación por defecto de la interfaz
//creamos un metódo static y que devuelva
interface Printer{
	void print(String cad);
	
	static Printer of() {
		//creamos un objeto que implementa la interfaz
		//mediante una clase anónima
		return new Printer() {
			
			@Override
			public void print(String cad) {
				// TODO Auto-generated method stub
				//imprime la cadena en pantalla
				System.out.println(cad);
				
			}
		};
		
	}
	
}







public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//llamamos al método estático de la interfaz
		Printer pr = Printer.of();
		//le pasamos la cadena al método
		pr.print("lalala lalala");
		pr.print("lololo");
		
		
	}

}
