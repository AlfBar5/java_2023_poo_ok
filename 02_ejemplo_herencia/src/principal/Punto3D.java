package principal;

public class Punto3D extends Punto {

	
	private int z;
	
	
	//tenemos que tener un constructor para que se le puedan proporcionar también la z
	public Punto3D(int x, int y, int z) {
		//llamamos al constructor de la superclase para la x y la y
		super(x,y);
		
		this.z=z;
	}
	
	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}

	
	
	
	// SOBREESCRITURA DE MÉTODOS
	// PODEMOS VOLVER A REESCRIBIR EL MÉTODO HEREDADO DE OTRA
	// LO VOLVEMOS A ESCRIBIR RESPETANDO LA ESTRUCTURA
	// COMO x e y son private, TENEMOS QUE LLAMAR AL METODO GET
	// La anotación @Override indica al compilador que se está intentando sobrescribir un método
	
	
		
	@Override
	public void dibujar() {
		
		System.out.println("Coordenadas: "+getX()+","+getY()+","+getZ());
	}
	
	
	/*
	 
	 // llamar al método de la superclase
	super.dibujar(); //llama a dibujar() de Punto
	System.out.print(","+getZ());
	
	 */
	
	

}
