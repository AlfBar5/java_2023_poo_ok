package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestMover {

	public static void main(String[] args) throws IOException {
		
		// Copiar un fichero de una dirección en otra
		//Dirección origen
		String dirOrigen="c:\\temp\\origen\\para_mover.txt";
		
		//Dirección destino. PONER NOMBRE DE FICHERO TAMBIËN
		//lo que hace es mover el archivo manteniendo el original
		String dirDestino="c:\\temp\\destino\\destino_mover.txt";
		
		//try capth añadido a la función, no aconsejable
		Files.move(Path.of(dirOrigen), Path.of(dirDestino));
		
		//el archivo desaparece de la carpeta origen, es "movido", 
		//por lo que ejecutar una segunda vez provoca error

	}

}
