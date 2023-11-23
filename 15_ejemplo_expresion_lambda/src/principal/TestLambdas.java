package principal;

import java.util.function.BiPredicate;


public class TestLambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Mediante expresión lambda
		//Crear una implementación BiPredicate<Integer, Integer>
		// que devuelva true solo cuando los números sean iguales


	


/*
		BiPredicate<Integer, Integer> impl=(n1,n2)->{
			if(n1=n2){
				return true;
			}else{
				return false;
			};

*/
		
		// con operador ternario
		BiPredicate<Integer, Integer> impl1=(n1,n2)->n1==n2;




		////otra implementación que devuelva true si ambos números son positivos

		BiPredicate<Integer, Integer> impl2=(n1,n2)->n1>0&&n2>0;



		////partiendo de las implementaciones anteriores, crear una
		//// implementación que devuelva true si ambos números son 
		/// positivos e iguales

		//primera manera
		 BiPredicate<Integer, Integer> impl3=(n1,n2)->(n1>0&&n2>0)&&n1==n2;
		
		 //segunda manera, usando los objetos BiPredicate y usando los dos primeros
		  BiPredicate<Integer, Integer> impl4=impl1.and(impl2);
		 
		  //llamamos al método pasando parámetros para probar
		 System.out.println(impl4.test(3, 3));
		
	}

}
