package principal;

public class Test {

	public static void main(String[] args) {

		//guardamos un string en un objeto de tipo object
		Object ob="Cadena";
		
		//conversión explicita CASTING
		String cad=(String)ob;
		
		
		// error de casting 
		// ClassCastException
		Object num="300";
		Integer it=(Integer)num;
		System.out.println(it);
		
		
		
	}

}
