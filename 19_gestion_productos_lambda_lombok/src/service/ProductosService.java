package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class ProductosService {
	
	
	List<Producto> productos= new ArrayList<>();
	
	
	//alta
	public void altaProdutos(String nombre, double precio, String categoria) {
		productos.add(new Producto(nombre, precio, categoria));
	}
	
	
	//bajar precio
	public void bajarPrecio(int porcentaje) {
		//recibe un objeto producto
		
		/*
		productos.replaceAll(p->{
				p.setPrecio(p.getPrecio()*(1-porcentaje/100.0));
				return p;
		});
		*/

		productos.forEach(p->p.setPrecio(p.getPrecio()*(1-porcentaje/100.0)));
		
	}
	
	
	//subir precio por categoria
	public void subirPrecioCategoria(int porcentaje, String categoria) {
		
		productos.replaceAll(p->{
		if(p.getCategoria().equals(categoria)) {
			p.setPrecio(p.getPrecio()*(1+porcentaje/100.0));
		}
		return p;
	});
		
	}
	
	//eliminar productos por categoria
	public void eliminarPorCategoria(String categoria) {
		
		productos.removeIf(p->p.getCategoria().equals(categoria));
		
	}
	
	
	
	
	
	public void ordenarPorPrecio() {
		
		//devuelve un int, para comparar dobles
		productos.sort((a,b)->Double.compare(a.getPrecio(), b.getPrecio()));
		
		
	}

	
	public List<Producto> obtenerProductos(){
					
		return productos;
		
	}
	
	
}
