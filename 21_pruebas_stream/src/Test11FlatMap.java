import java.util.Arrays;

public class Test11FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Array de dos dimensiones
		//Array de Arrays - array de tres elementos, cada elemento es una array
		String[][] pedidos= {
				{"azucar","agua","vino","azucar"},
				{"cerveza","pollo","jamóm","vino"},
				{"agua","aceite","pan","jamón","lechuga"}
				};
		
		
		//¿Cuantos productos se han pedido entre todos las tiendas 
		//sin contar productos repetidos
		
		System.out.println("----  Cuantos productos se han pedido entre todos las tiendas --------");
		
		System.out.println(
				
		//Hay que generar un stream con todos estos arrays
		Arrays.stream(pedidos)   //esto es un stream de arrays de arrays- Stream<String[]>
		.flatMap(a->Arrays.stream(a)) //Stream<String> //aplano el stream en un único array unidimensional
		.distinct()
		.count()
		
		);
		
		
		//si son tres dimensiones, hay que hacer dos conversiones .flapMap consecutivos
		
		/*
		List<List<List<Integer>>> nums;
		nums.stream() //Stream<List<List>>
		.flatMap(l->l.stream()) //Stream<List>
		.flatMap(l->stream()) //Stream<Integer>
		
		*/
		
		
	}

}
