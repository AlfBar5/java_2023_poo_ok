package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestLectura {

	public static void main(String[] args) {

		//ruta como variable
		String dir="c:\\temp\\productos.txt";
		
		//Crear interfaz Path, para poder acceder a sus métodos
		Path path = Path.of(dir);
		
		//Lectura de un fichero
		try {
			Files.lines(path) //da un stream de cadena de caracteres
			.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
