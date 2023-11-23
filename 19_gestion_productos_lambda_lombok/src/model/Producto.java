package model;

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

public class Producto {

	private String nombre;
	private Double precio;
	private String categoria;
	
	
	
	
	
	
}
