package model;

import java.time.LocalDateTime;

public class Movimiento {
	
	private double cantidad;
	private LocalDateTime fechahora;
	private String tipo;
	
	//constructor con atriburos
	public Movimiento(double cantidad, LocalDateTime fechahora, String tipo) {
		super();
		this.cantidad = cantidad;
		this.fechahora = fechahora;
		this.tipo = tipo;
	}
	
	public Movimiento() {
		super();
	}

	//setter y getter
	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDateTime getFechahora() {
		return fechahora;
	}

	public void setFechahora(LocalDateTime fechahora) {
		this.fechahora = fechahora;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
