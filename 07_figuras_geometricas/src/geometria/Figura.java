package geometria;

public abstract class Figura {
	
	//atributos
	private String color;

	//constructor con un parámetro
	public Figura(String color) {
		super();
		this.color = color;
	}

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//no puedo en esta clase calcular la superficie de las figuras geométricas
	//pero puedo hacer una clase abstract para que lo hereden las clases hijas y lo implementen
	//si hay un método abstracto, la clase tiene que ser abstract
	public abstract double superficie();


	

}
