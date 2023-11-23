package model;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter



/*
Con json

*/

public class Pedido {
	private String producto;
	private LocalDate fechaPedido;
	private double precio;
	
	
}
