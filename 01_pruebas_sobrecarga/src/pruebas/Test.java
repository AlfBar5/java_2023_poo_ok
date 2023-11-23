package pruebas;

public class Test {

	public static void main(String[] args) {
		// creamos objeto operaciones
		Operaciones operaciones= new Operaciones();
		
		// al método le podemos pasar todos 
		operaciones.sum();
		operaciones.sum(3);
		operaciones.sum(3,4);
		operaciones.sum(6,7,8);
		operaciones.sum(4,6,6,6,8,9);
		
		
	Operaciones operacionesdos= new Operaciones();
			
			String s = null;
			// al método le podemos pasar todos 
			operacionesdos.sumados(s);
			operacionesdos.sumados(s,3);
			operacionesdos.sumados(s,3,4);
	
		}
	

}
