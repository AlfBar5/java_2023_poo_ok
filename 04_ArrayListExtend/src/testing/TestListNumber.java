package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.ListNumber;

class TestListNumber {
	
	//declaramos la variable de la clase ListNumber
	ListNumber listNumber;
	

	//En el setup añadimos los datos
	@BeforeEach
	void setUp() throws Exception {
		//inicializo el objeto arraylist y le añado 3 valores
		listNumber=new ListNumber();
		listNumber.add(5);
		listNumber.add(10);
		listNumber.add(15);
		
	}
	

	@Test
	void testFirst() {
		//le decimos que el 5 es el primero
		assertEquals(5, listNumber.first());
	}

	@Test
	void testLast() {
		//le decimos que el 15 es el último
		assertEquals(15, listNumber.last());
	}

	@Test
	void testSum() {
		
		assertEquals(30, listNumber.sum());
	}

	@Test
	void testAddInteger() {
		assertFalse(listNumber.add(10));
	}

	/*
	@Test
	void testAddIntInteger() {
		fail("Not yet implemented");
	}
	*/

}
