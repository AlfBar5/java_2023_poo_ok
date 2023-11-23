package geometria;


public  class Triangulo extends Figura{

	private double base = 0.0;
	private double altura = 0.0;
	
	
	//constructor
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura= altura;
		
		
	}
	
	
	@Override
	public double superficie() {
		return base*altura/2;
	}



}
