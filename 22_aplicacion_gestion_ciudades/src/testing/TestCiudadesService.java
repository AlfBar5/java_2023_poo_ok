package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.CiudadesService;

class TestCiudadesService extends CiudadesService {

	//declaramos objeto
	CiudadesService service;
	
	@BeforeEach
	void setUp() throws Exception {
		service =new CiudadesService();
		
		//datos de prueba antes @BeforeEach setUp
		//añadimos unos datos que se cargan antes de cada prueba
		//alta ciudades
		service.altaPaises("c1", "p1", 100_000, 28.5);
		service.altaPaises("c2", "p1", 200_000, 23.0);
		service.altaPaises("c3", "p2", 150_000, 23.5);
		service.altaPaises("c4", "p2", 100_000, 21.5);
		service.altaPaises("c5", "p1", 40_000, 9.5);
		service.altaPaises("c6", "p3", 900_000, 30.5);
		
	}

/*
	@Test
	void testTotalCiudadesPais() {
		fail("Not yet implemented");
	}

*/
	
	@Test
	void testTotalPaises() {
		//tres paises hay en los datos de prueba
		//el método service.totalPaises debe contar tres si está bien hecho
		assertEquals(3, service.totalPaises());
		
		
	}

	@Test
	void testExisteCiudadTempInf() {
		// da true, porque hay ciudades con temperatura media mayor de 20º
		assertTrue(service.existeCiudadTempInf(20)); 
		
		// da false, porque hay ciudades con temperatura media inferior de 5
		assertFalse(service.existeCiudadTempInf(5));
	}
	
	
	/*	

	@Test
	void testCiudadPornombre() {
		fail("Not yet implemented");
	}
	
*/

	@Test
	void testCiudadMasPoblada() {
		assertEquals("c6",service.ciudadMasPoblada().getNombre());
	}
	
	@Test
	void  testMediaHabitantesCiudadesPorPais() {
		assertEquals(125_000, service.mediaHabitantesCiudadesPorPais("p2"));
		
		// con delta. Cuando el valor no es exacto en decimales, se puede utilizar un margen de error
		//assertEquals(125_000, service.mediaHabitantesCiudadesPorPais("p2"),0.5);
	}
	
	
	@Test
	void testTemperaturaMasAlta() {
		assertEquals(30.5, service.temperaturaMasAlta());
	}
	
	@Test
	void testciudadesAgrupadasPorPais() {
		//nueva ciudad de prueba, se añade a las de arriba
		service.altaPaises("c6", "p4", 900_000, 30.5);
		
		assertEquals(1, service.ciudadesAgrupadasPorPais().get("p4").size()); 
		
		assertEquals(2, service.ciudadesAgrupadasPorPais().get("p2").size()); 
		
	}
	
	
	@Test
	void testciudadesDosListasTemperatura() {
		//2 false, menor a 22grados
		assertEquals(2, service.ciudadesDosListasTemperatura(22.0));
	}
	
	
	
}
