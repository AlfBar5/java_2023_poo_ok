package principal;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Pedido;
import serializacion.DeserializadorFecha;

public class TestJson {

	public static void main(String[] args) {
		// leer los datos del pedido que se encuentra en c:/temp/pedidos.json
		
		//ayuda oficial de gson: https://javadoc.io/doc/com.google.code.gson/gson/latest/com.google.gson/com/google/gson/Gson.html
		
		String ruta="c:\\temp\\pedidos.json";
		
		//devuelve el javabean con los datos metidos dentro
		//	fromJson​(String json, Class<T> classOfT)
		// primer parámetro: ruta del fichero
		// segundo parámetro : tipo de objeto al que quiero convertir el json (Pedido).
		//Se le dice con la clase Class (contiene información de clases java, metadatos)
		//Gson gson =new Gson();
		
		
		//Creamos el Gson para que pase por el deserializador
		//hay que usar el objeto de la clase DeserializadorFecha para convertir el LocalDate
		Gson gson= new GsonBuilder()
				.registerTypeAdapter(LocalDate.class, new DeserializadorFecha()) //GsonBuilder
				.create(); //Gson
				
		
		//PARA UN PRODUCTO SOLO
		//poner atriburos de json distinguiendo may y minusculas igual que el model
		
		/*
		try(FileReader reader = new FileReader(ruta);)
		{
			Pedido pedido=gson.fromJson(reader, Pedido.class);
			System.out.println("Producto: "+pedido.getProducto());
			System.out.println("Fecha pedido: "+pedido.getFechaPedido());
			System.out.println("Precio: "+pedido.getPrecio());
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
		*/
		
		
		//PARA PODER PASAR LA FECHA COMO LOCALDATE, TENEMOS QUE HACER UN
		//DESERIALIZADOR PERSONALIZADO
		//QUE LE DIGAMOS COMO SE CONVIERTE CADA CAMPO
		//ESTA EN LA CLASE
		
		
		
		//CON UN ARRAY DE DATOS
		try(FileReader reader = new FileReader(ruta);)
		{
			Pedido[] pedidos=gson.fromJson(reader, Pedido[].class);
			for(Pedido pedido:pedidos) {
				System.out.println("Producto: "+pedido.getProducto());
				System.out.println("Fecha pedido: "+pedido.getFechaPedido());
				System.out.println("Precio: "+pedido.getPrecio());
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	
	}
	
}

