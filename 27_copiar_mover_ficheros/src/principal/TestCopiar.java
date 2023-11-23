package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class TestCopiar {

	public static void main(String[] args) throws IOException {
		
		// Copiar un fichero de una dirección en otra
		//Dirección origen
		String dirOrigen="c:\\temp\\origen\\para_copiar.txt";
		
		//Dirección destino. PONER NOMBRE DE FICHERO TAMBIËN
		//lo que hace es copiar el contenido de un archivo manteniendo el original
		String dirDestino="c:\\temp\\destino\\fichero_copiado.txt";
		
		//try capth añadido a la función main (throws IOException), no aconsejable
		//Files.copy(Path.of(dirOrigen), Path.of(dirDestino));
		
		//Solo se puede hacer un vez la operación si no le ponemos tercer parámetro CopyOptions
		Files.copy(Path.of(dirOrigen), Path.of(dirDestino),StandardCopyOption.REPLACE_EXISTING);
		

	}

}
