package service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.google.gson.Gson;

import model.Empleado;


public class ServiceEmpleados {

	
	
	
	// código común a los otros métodos lo metemos en un método private
	private Stream<Empleado> getEmpleados(){
		
		String ruta="c:\\temp\\empleados.json";
		Gson gson =new Gson();
		
		try(FileReader reader = new FileReader(ruta);)
		{
			
			Empleado[] empleados=gson.fromJson(reader, Empleado[].class);
			return Arrays.stream(empleados); //devuelve stream de objetos empleados
			
		}catch(IOException ex) {
			ex.printStackTrace();
			return Stream.empty(); //devolvemos un stream vacío si hay excepcion
		}
		
		
	}
		
	
	
	
	// - Método Obtener lista de empleados por departamento
	public List<Empleado> empleadosPorCategoria(String cat){
		
				return
					getEmpleados()
					.filter(c->c.getDepartamento().equals(cat)) //Stream<Empleado>
					.toList();
			
	}
	
	
	
		
	// - Método Obtener empleado con mayor salario
	public Empleado empleadoMayorSalario() {
			
				return
					getEmpleados()
					.max((a,b)->Double.compare(a.getSalario(), b.getSalario())) //Optional
					.orElse(null); //por si viene vacio
	

	}
		
		
		
		
	// - Método Busqueda de empleado por email 
	public Empleado buscarEmpleado(String email) {
			
				return
					getEmpleados()
					.filter(s->s.getEmail().equals(email))
					.findFirst() // devuelve el primer resultado encapsulado en un optional
					.orElse(null); //por si viene vacio
	}
		
		
}
	
	
	
	
	

