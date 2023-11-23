package model;

import java.time.LocalDate;




/*
Aplicación de pedidos

Un pedido se caracteriza por: producto,fechaPedido,precio

1.- Alta pedido
2.- Pedido más reciente
3.- Pedidos por precio inferior
4.- Se solicita una cantidad de meses y el programa nos muestra los pedidos anteriores a ese número de meses introducidos
4.- Salir

*/

public class Pedido {
	private String producto;
	private LocalDate fechaPedido;
	private double precio;
	public Pedido(String producto, LocalDate fechaPedido, double precio) {
		super();
		this.producto = producto;
		this.fechaPedido = fechaPedido;
		this.precio = precio;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public LocalDate getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
