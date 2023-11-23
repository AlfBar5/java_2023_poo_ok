package clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class OperacionesColecciones  {

	
	// método que usa collection es una interfaz heredada por list y set
	public int sumar(Collection<Integer> coleccion) {
		int suma=0;
		for(Integer in:coleccion) {
			suma+=in;
		}
		return suma;
	}
	
	
	//realizar un segundo método que reciba dos colecciones de números
	// y devuelva un conjunto con los números repetidos contenidos en ambas colecciones
	
	public ArrayList<Integer> juntarlistasnumeros(Collection<Integer> coleccionuno, Collection<Integer> colecciondos) {
	
		ArrayList listanumeros = new ArrayList<>();
		
		
		for(Integer elemento:coleccionuno) {
			//sacamos solo los números repetidos
			if(colecciondos.contains(elemento)) {
				listanumeros.add(elemento);
			}
			
		}
		
	
		
		return listanumeros;
		
	}
	
	
	
	//otra forma con set
	
	public Set<Integer> subconjunto(Collection<Integer> col1, Collection<Integer> col2){
		Set<Integer> resultado=new HashSet<>();
		for(Integer data:col1) {
			if(col2.contains(data)) {
				resultado.add(data);
			}
		}
		return resultado;
	}
	
	
	
	
	
	
}






