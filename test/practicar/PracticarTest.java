package practicar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ErrorCollector;

public class PracticarTest {
	private Practicar practicar;
	
	@BeforeEach
	void setUp() throws Exception {
		practicar = new Practicar();
	}

	@Test
	void testCantidadLetrasS() {
		assertEquals(1, practicar.cantidadLetrasS());
	}
	
	@Test
	void testIndexOf() {
		assertEquals(5, practicar.indexOfLibertad());
	}
	
	@Test
	void testLastIndexOf() {
		assertEquals(7, practicar.lastIndex());
	}
	
	@Test
	void testSubString() {
		assertEquals("il", practicar.subString());
	}
	
	
	@Test
	void testEmpiezaCon() {
		assertFalse(practicar.empiezaCon());
	}
	
	
	@Test 
	void testEsIgual() {
		assertFalse(practicar.esIgual());
	}
	
	
	@Test
	void testSubstringIgual() {
		assertTrue(practicar.substringIgual());
	}
}
