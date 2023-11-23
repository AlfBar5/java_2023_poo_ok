package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.ServiceEmpleados;

class TestServiceEmpleados {

	
	//los datos del json ya los pilla cada método al cargar el json
	ServiceEmpleados service;
	
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		service=new ServiceEmpleados(); //creamos uno limpio en setup
		
	}

	
	
	@Test
	void testEmpleadosPorCategoria() {
		
		//devuelve una lista. Aplicamos .size para ver que en la lista hay dos elementos
		assertEquals(2, service.empleadosPorCategoria("sistemas").size());
		//segunda suposición que tiene que devolver una lista de 1
		assertEquals(1, service.empleadosPorCategoria("ventas").size());
	}

	@Test
	void testEmpleadoMayorSalario() {
		
		//
		assertEquals("Javier", service.empleadoMayorSalario().getNombre());
		
		
	}

	@Test
	void testBuscarEmpleado() {
		
		assertEquals("Laura", service.buscarEmpleado("lauri@gmail.es").getNombre());
	}

}
