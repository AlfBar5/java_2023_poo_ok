package principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Curso;

public class Ordenar {

	public static void main(String[] args) {

		//creamos una lista de cursos
		List<Curso> cursos=new ArrayList<>(List.of(
				
				new Curso("Java Básico",100,LocalDate.of(2023, 11, 20),250),
				new Curso("Angular",200,LocalDate.of(2023, 11, 20),150),
				new Curso("Curso C",450,LocalDate.of(2023, 9, 20),450),
				new Curso("Curso Java Intermedio",500,LocalDate.of(2023, 9, 20),350),
				new Curso("Java III",400,LocalDate.of(2023, 9, 20),350)
				
				));
				
		//ordenar la lista de cursos por fecha de inicio
		//en caso de comenzar en la misma fecha, se ordena por duración
		//después se muestran todos
		
		//Ordenados por fecha
		cursos.sort((a,b)->a.getFecha().compareTo(b.getFecha()));
		
		cursos.forEach(c->System.out.println(c.getDenominacion()+", "+c.getDuracion()+", "+c.getFecha()));
		
		
		System.out.println("-----------------");
		
		//Ordenadados por fecha y duración
		//hay que unir dos compareTo, mirar métodos default
		//hay que llamar al método thenComparing sobre un objeto 
		//Como hay que usar varios objetos de comparación, los vamos guardando en dos variables
		//y el cmpMix que es la unión de los dos
		Comparator<Curso> cmp1 = (a,b)->a.getFecha().compareTo(b.getFecha());
		Comparator<Curso> cmp2 = (a,b)->Integer.compare(a.getDuracion(), b.getDuracion());
		
		//unión de las dos comparaciones con thenComparing
		Comparator<Curso> cmpMix = cmp1.thenComparing(cmp2);
		cursos.sort(cmpMix);
				
		cursos.forEach(c->System.out.println(c.getDenominacion()+", "+c.getDuracion()+", "+c.getFecha()));

	}

}


