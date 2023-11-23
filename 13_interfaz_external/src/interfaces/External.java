package interfaces;

import java.util.Scanner;

public interface External {
	
	void send(String texto);
	String read();
	
	//incorporar un método estático que proporcione una implementación por defecto de esta interfaz
	//con envío de datos a la pantalla
	//y lectura desde el teclado
	
	//void print(String cad);
	
	static External of() {
		//creamos un objeto que implementa la interfaz
		//mediante una clase anónima
		return new External() {
			
			@Override
			public void send(String texto) {
				// TODO Auto-generated method stub
				System.out.println(texto);
				
			}
			
			@Override
			public String read() {
				// TODO Auto-generated method stub
				Scanner textoread= new Scanner(System.in);
				return textoread.nextLine();
			}
		};
		
	}
	

}
