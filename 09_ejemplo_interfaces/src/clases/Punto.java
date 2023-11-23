package clases;

public class Punto {
	
	//los atributos private solo se ven desde su clase
	private int x;
	private int y;
	
	
	
	//constructor que permite inicializar los atributos de esta clase

	/*
	la x sin this es el parámetro
	la x con this es el atributo
	*/
	
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	
	// constructor sin parametros
	public Punto() {
		x=20;
		y=10;
	}
	
	
	


	// seter y getter

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}
	
	
	
	public void dibujar() {
		System.out.println("Coordenadas: "+x+","+y);
	}
	
	
	
	
	
}
