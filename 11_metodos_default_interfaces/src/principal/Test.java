package principal;


//metodos de la interfaz publicos y abstractos siempre
interface Calculadora{
	int sumar(int a, int b);
	int restar(int a, int b);
	int multiplicar(int a, int b);
	
	//método para sumar números enteros variables
	// recorremos los números y retornamos resultado
	//obligatorio poner default si el método de la interfaz tiene código
	default int sumatorio(int ...nums) {
		int resultado=0;
		for(int n:nums) {
			resultado+=n;
		}
		return resultado;
	}
}




interface Estadisticas{
	default int sumatorio(int ...datos) {
		return datos[0]+datos[datos.length-1];
	}
	
}




//clase que implementa interfaz calculadora
//hereda 4 métodos, el default no hace falta sobreescribirlo
class Matematicas implements Calculadora,Estadisticas{

	// cuando hay dos métodos defaults repetidos en dos interfaz, hay herencia multiple
	//hay que sobreescribir el método default(en este caso)
	//y sobreescribir el método con cualquiera de las dos versiones heredadas
	@Override
	public int sumatorio(int... nums) {
		// TODO Auto-generated method stub
		return Calculadora.super.sumatorio(nums);
	}

	@Override
	public int sumar(int a, int b) {
		return a+b;
	}

	@Override
	public int restar(int a, int b) {
		return Math.max(a, b)-Math.min(a, b);
	}

	@Override
	public int multiplicar(int a, int b) {
		return a*b;
	}
	
}




public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matematicas mat= new Matematicas();
		System.out.println(mat.sumatorio(4,8,1,34,13));
		
	}

}
