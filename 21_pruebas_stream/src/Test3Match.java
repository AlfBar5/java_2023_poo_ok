import java.util.List;

public class Test3Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//imprime los tres primeros, 
		//hasta que llega al primero negativo y, como ya da false, pues no sigue
		//esto es para ahorrar recursos
		List<Integer> nums = List.of(6,11,-4,8,-1,10,8);
		nums.stream()
		.anyMatch(x->{
			System.out.println(x);
			return x<0;
			
		});
		
		
		

	}

}
