package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Ciudad;

public class CiudadesService {
	
	//Lista de objetos Ciudad
	List<Ciudad> ciudades=new ArrayList<>();
	
	
	
	//MÉTODOS
	//-1- recibe los datos de la ciudad y la agrega
	//no puede haber dos ciudades con mismo nombre y país
	//Devuelve boolean informando se añade o no
	
	public boolean altaPaises(String nombre, String pais, int habitantes, Double temperaturaMedia) {
			

		if(ciudades.stream().noneMatch(n->n.getNombre().equals(nombre)&&n.getPais().equals(pais))) {
			ciudades.add(new Ciudad(nombre, pais, habitantes, temperaturaMedia));
			return true;
		}
		
		return false;
		
	}
					
		
		
	
	
	//-2- A partir de un pais devuelve el total de ciudades registradas de ese país
	
	public int totalCiudadesPais(String pais) {
		
		//return un int. El count devuelve un long. Tenemos que hacer un casting, de long a int
		return (int)
				ciudades.stream()
				.filter(n->n.getPais().equals(pais))
				.count();
		
		
	}
	
	
	//-3- Devuelve el total de paises registrados
	public int totalPaises() {
		
		//return un int. El count devuelve un long. Tenemos que hacer un casting, de long a int
		return (int)
				ciudades.stream()	
				.map(s->s.getPais()) //transformamos cadena Strint a integer con map //entra ciudad -> sale string
				.distinct() //elimino los paises repetidos
				.count();
				
	}
	
	
	//-4- A partir de una temperatura media, 
	//indica si hay alguna ciudad con temperatura inferior a ese valor
	public boolean existeCiudadTempInf(double temp) {
		
		return 
				ciudades.stream()
				.anyMatch(c->c.getTemperaturaMedia()<temp); //devuelve un boolean
 				
				
	}
	
	
	//-5- Método que devuelva los datos del pais cuyo nombre se recibe como parámetro
	// Buscador de paises
	// para uso de optional
	//si no la encuentra que devuelva null
	
	public Ciudad ciudadPornombre(String nombre) {
		
		return 
				ciudades.stream()
				.filter(c->c.getNombre().equals(nombre)) //busqueda
				.findFirst() //nos quedamos con el primer objeto que encontramos
				.orElse(null); //si llamamos a get() y no hay nada, nos da una excepcion. Recurrimos al orElse
				
				//.orElse devuelve una ciudad y si no existe devuelve null
	}
	
	
	
	//-6- Método que devuelve todos los datos del objeto Ciudad más poblada
	public Ciudad ciudadMasPoblada() {
		
		return 
				ciudades.stream()
				.max((a,b)->Long.compare(a.getHabitantes(), b.getHabitantes())) //metodo final- Optional<Ciudad>
				.orElse(new Ciudad()); //proporcionamos una ciudad vacia, si no hay resultados
		
				

				
	}

	
	
	//-7- dado un país, media de habitantes de sus ciudades
	
	public double mediaHabitantesCiudadesPorPais(String pais) {
	
		return 
				ciudades.stream()
				.filter(p->p.getPais().equals(pais)) //stream datos pais
				/*
				.mapToLong(s->s.getHabitantes()) //transformamos a Long, es ya un Long stream
				.average() //calculamos la media
				.orElse(0.0);
				*/
				.collect(Collectors.averagingDouble(c->c.getHabitantes()));
	}
	
	
	//-8- temperatura media más alta de entre todas las ciudades
	
	public double temperaturaMasAlta() {
		return 
				ciudades.stream()
				.mapToDouble(c->c.getTemperaturaMedia()) //transdormamos a double stream
				.max() //valor máximo del stream
				.orElse(0);
		
				
	}
	
	
	
	//-9- A partir de un pais devuelve la lista de ciudades de dicho país
	
	public List<Ciudad> listaCiudadesPorPais(String pais){
		return 
				ciudades.stream()
				.filter(n->n.getPais().equals(pais))
				.collect(Collectors.toList())
				;
			
	}
	
	
	
	
	
	
	
	//-10- devuelve una lista con los nombres de los países
	
	public List<String> listaPaises(){
			
			return
					ciudades.stream() //strean ciudades Stream<Ciudad>
					.map(c->c.getPais()) //Stream<String>
					.distinct()
					.collect(Collectors.toList())
					;
 		
		
	}
	
	
	//toMap tabla con clave y valor
	
	//-11- Método que devuelva una tabla con las ciudades agrupadas por país
	
	public Map<String, List<Ciudad>> ciudadesAgrupadasPorPais(){
		
		return
				ciudades.stream()
				.collect(Collectors.groupingBy(s->s.getPais()))
				;
		
	}
	
	
	
	
	//-12- método que, a partir de una temperatura, devuelva una tabla con dos listas de ciudades
	//por un lado, las que tienen una temperatura media superior a ese valor
	//y, por otro, las que tienen una temperatura inferior
	
	public Map<Boolean,List<Ciudad>> ciudadesDosListasTemperatura(double temperatura){
		
		return 
				ciudades.stream()
				.collect(Collectors.partitioningBy(t->t.getTemperaturaMedia()>=temperatura))
				;
		
		//
		
	}
	
	
	

}
