package service;

import java.util.ArrayList;


/*
 
Vamos a crear una clase, llamada ListNumber, para manejar listas de números enteros.
La clase, heredará ArrayList<Integer>, e incorporará las siguientes mejoras:

-Método first() que devuelve el primer elemento de la lista
-Método last() que devuelve el último elemento de la lista (ambos devuelven null si la lista está vacía)
-Método sum() que devuelve la suma de todos los elementos de la lista

-No debe permitir añadir números ya existentes


 */

// esta clase extiende la clase ArralyList e incorpora métodos propios

public class ListNumber extends ArrayList<Integer> {
	
	

	 //sacar el primer número del array
	 public Integer first() {
		 
		 //return get(0);
		//operador ternario para controlar que no en el array hay algo
		 return size()>0?get(0):null;
		 
	 }
	 
	 
	 //sacar el último de la lista
	 public Integer last() {
		 
		 //return get(size()-1);
		 return size()>0?get(size()-1):null;
		 
	 }
	 
	 
	 //total
	 public int sum() {
		  int total = 0;
		  //this, es la instancia del propio objeto arraylis que queremos recorrer
		  for(Integer num:this) {
			  total+=num;
		  }
		  return total;
	 }


	//tenemos que sobreescribir el método add, para que no se añadan números repetidos
	//Source/override implement métodos
	// devuelve un true o false
	@Override
	public boolean add(Integer e) {
		// TODO Auto-generated method stub
		if(!contains(e)) {
			return super.add(e);
		}
		return false;
	}

	// no devuelve nada, y añade el elemento
	@Override
	public void add(int index, Integer element) {
		// TODO Auto-generated method stub
		// si no contiene el elemento lo añadimos
		if(!contains(element)) {
			super.add(index, element);
		}
		
		
	}
	 
	 
	 
	 
	 
}
