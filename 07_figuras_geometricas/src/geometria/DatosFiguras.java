package geometria;

public class DatosFiguras {

	public static void main(String[] args) {
		
		//SIN POLIMORFISMO
		
		// crear un objeto cualquiera de cada subclase de figura y a continuación mostrar su color y superficie
		
		//Creamos un triángulo
		Triangulo triang = new Triangulo("amarillo", 6, 9);
		
		//sacamos color triángulo
		System.out.println("Color de la figura; "+triang.getColor());
		//sacamos superficie triángulo
		System.out.println("Superficie de la figura; "+triang.superficie());
		
		
		//Creamos un círculo
		Circulo circ = new Circulo("azul", 7);
				
		//sacamos color círculo
		System.out.println("Color de la círculo; "+circ.getColor());
		//sacamos superficie círculo
		System.out.println("Superficie de la círculo; "+circ.superficie());
		
		
		
		
		
		
	}

}
