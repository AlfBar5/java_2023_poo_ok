package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Producto;
import service.ProductosService;

public class GestionProductos {

	
	
	
	public static void main(String[] args) {


		var prService=new ProductosService();
		
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			try {
				opcion=Integer.parseInt(sc.nextLine());//lee la opción elegida
				switch(opcion) { //evaluamos
					case 1:
						
						//creamos seis productos
						prService.altaProdutos("p1",10,"cat1");
						prService.altaProdutos("p2",10,"cat1");
						prService.altaProdutos("p3",10,"cat1");
						prService.altaProdutos("p4",10,"cat1");
						prService.altaProdutos("p5",10,"cat2");
						prService.altaProdutos("p6",10,"cat2");
						prService.altaProdutos("p7",10,"cat3");
						break;
						
					case 2:
						
						prService.bajarPrecio(5);
						break;
						
					case 3:
						
						prService.subirPrecioCategoria(10, "cat1");
						break;
						
					case 4:
						
						prService.eliminarPorCategoria("cat3");
						break;
						
					case 5:
						
						prService.ordenarPorPrecio();
						break;
						
					case 6:
						
						prService.obtenerProductos().forEach(p->
						System.out.println(p.getNombre()+", "+p.getPrecio()+", "+p.getCategoria())
						);
						
						break;
					
					case 7:
						System.out.println("---Adios---");
				}
			}
			catch(NumberFormatException ex) {
				ex.printStackTrace();
				System.out.println("Debes elegir opción correcta");
				opcion=0; //para que vuelva a generar el bucle
			}
		}while(opcion!=7);
		
		

	}
	
	
	
	/*
	 * 
Cada producto se caracteriza por:
nombre
precio
categoria

	 
1-pide datos y guarda el producto
2-pide porcentaje y baja precios de todos los productos
3-ordena productos por precio de menor a mayor, a nivel visual no muestra nada
4-pide categoría y elimina productos de esa categoria
5-pide categoria y porcentaje y sube el precio solo a productos de esa categoría
6- muestra productos

	 
	 */
	
	
	
	static void mostrarMenu() {
		System.out.println("1.- Nuevo producto");
		System.out.println("2.- Bajar precios");
		System.out.println("3.- Ordenar productos");
		System.out.println("4.- Eliminar productos");
		System.out.println("5.- Subir precios por categoría");
		System.out.println("6.- Mostrar todos los productos");
		System.out.println("7.- Salir");
		
	}
	
	
	

}
