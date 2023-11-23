package model;




import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//colocamos antes de la clase lo que queremos que haga la librería LOMBOK
//Coloca el código durante la compilación del código

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter


public class Curso {
	
	private String denominacion;
	private int duracion;
	private LocalDate fecha;
	private int precio;

	
}
