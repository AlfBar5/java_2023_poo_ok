package principal;

import java.util.ArrayList;
import java.util.List;


//las interfaces ya tienen métodos estáticos para crear listas




class DatosDos{
	
	
	
	//método que nos devuelva una lista con los 10 primeros números enteros
	//Forma antigua
	public List<Integer> numeros(){
		
		/*
		ArrayList<Integer> lst=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			lst.add(i);
		}
		return lst;
	
		*/
		
		//esté método estatico ya está implementado en la interfaz de List:
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html
		return List.of(1,2,3,4,5,6,7,8,9,10); 
		//Son inmutables, no se les puede añadir o quitar elementos
		
		/*
		//ejemplo de 1000 primeros números con List.of y elementos indefinidos
		
		Integer [] nums=new Integer[1000];
		for(int i=1;i<=1000;i++) {
			nums[i-1]=i;
		}
		return List.of(nums); 
		
		*/
	}
	
	
	
	
	
}



public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos objeto de la clase datos
		DatosDos dat= new DatosDos();
		//le pedimos la lista
		List<Integer> nums=dat.numeros();
		for(Integer n:nums) {
			System.out.println(n);
		}
	}

}
