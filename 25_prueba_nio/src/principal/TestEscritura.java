package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TestEscritura {

	public static void main(String[] args) {

		//ruta como variable
		String dir="c:\\temp\\productos.txt";
		
		List<String> lst=List.of("pan","agua","filete","pizza","fanta");
		
		//Crear interfaz Path, para poder acceder a sus métodos
		Path path = Path.of(dir);
		
		//Escritura del fichero. El try catch es obligatorio
		try {
			Files.write(path, lst);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//añade un nuevo producto al txt
		//el modo predeterminado es sobreescritura, perdemos lo anterior
		//para añadir hay que poner la opción (constante): ,StandardOpenOption.APPEND
		try {
			Files.writeString(path, "cerveza",StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
