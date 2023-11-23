package service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Pedido;

public class PedidosService {
	
	ArrayList<Pedido> pedidos=new ArrayList<>();
	
	public void guardarPedido(String producto, LocalDate fechaPedido,double precio) {
		pedidos.add(new Pedido(producto,fechaPedido,precio));
	}
	
	
	public Pedido pedidoMasReciente() {
		
		/*
		Pedido pedido=pedidos.get(0);
		LocalDate fechaReciente=pedido.getFechaPedido();
		
		for(Pedido p:pedidos) {
			if(p.getFechaPedido().isAfter(fechaReciente)) { //si encontramos una fecha más reciente, actualizamos variables
				fechaReciente=p.getFechaPedido();
				pedido=p;
			}
		}
		*/
		
		return pedidos.stream()//Stream<Pedido>
				.max((a,b)->a.getFechaPedido().compareTo(b.getFechaPedido()))//Optional<Pedido>
				.orElse(null);
				
				
		
		
	}
	
	
	
	
	public List<Pedido> pedidosPrecio(double precioMax) {
		
		/*
		ArrayList<Pedido> resultado=new ArrayList<Pedido>();
				
		for(Pedido p:pedidos) {
			if(p.getPrecio()<precioMax) {
				resultado.add(p);
			}
		}
		return resultado;
		*/
		
		return 
				pedidos.stream() // stream de todos los pedidos
				.filter(p->p.getPrecio()<precioMax) //filtramos los pedidos cuyo precio sea inferior al precioMax // Stream de objetos<pedido>
				//.collect(Collectors.toList())
				.toList() //lo pasamos a lista
				;
		
		
	}
	
	public List<Pedido> anteriores(int meses){
		
		/*
		
		ArrayList<Pedido> resultado=new ArrayList<>();
		LocalDate referencia=LocalDate.now().minusMonths(meses);
		for(Pedido p:pedidos) {
			if(p.getFechaPedido().isBefore(referencia)) {
				resultado.add(p);
			}
		}
		return resultado;
		
		*/
		
		return pedidos.stream()//Stream<Pedido>
				.filter(p->p.getFechaPedido().isBefore(LocalDate.now().minusMonths(meses)))
				.toList();
		
	}
	
	
	//devuelve una tabla con una partición de pedidos.
	//Los caros (precio superior a la media) por un lado
	//y los baratos (precio inferior a la media) por otro
	public Map<Boolean,List<Pedido>> pedidosAgrupados(){
		
		//tenemos que hacer dos stream
		//calculamos la media
		double media=pedidos.stream()
				.collect(Collectors.averagingDouble(p->p.getPrecio()));
		
		return pedidos.stream()
				.collect(Collectors.partitioningBy(p->p.getPrecio()>media))
				;
		
		
		
	}
	
	
}
