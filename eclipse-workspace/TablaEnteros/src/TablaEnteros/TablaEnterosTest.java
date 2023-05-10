/**
 * 
 */
package TablaEnteros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author aaron
 *
 */
class TablaEnterosTest {
	TablaEnteros tablaEnteros;
	Integer [] Numeros = new Integer[5];

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		Numeros[0] = 10;
		Numeros[1] = 20;
		Numeros[2] = 30;
		Numeros[3] = 40;
		Numeros[4] = 50;
		tablaEnteros = new TablaEnteros(Numeros);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link TablaEnteros.TablaEnteros#TablaEnteros(java.lang.Integer[])}.
	 */
	
	void testTablaEnterosNull() {
		Integer [] Nulo = new Integer [0];
		assertThrows(IllegalArgumentException.class,() ->new TablaEnteros(Nulo));
	}
	
	@Test
	void testTablaEnteros() {
		assertEquals(Numeros, new TablaEnteros(Numeros));
	}

	/**
	 * Test method for {@link TablaEnteros.TablaEnteros#sumaTabla()}.
	 */
	@Test
	void testSumaTabla() {
		int suma = 150;
		assertEquals(suma, tablaEnteros.sumaTabla());
	}

	/**
	 * Test method for {@link TablaEnteros.TablaEnteros#mayorTabla()}.
	 */
	@Test
	void testMayorTabla() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link TablaEnteros.TablaEnteros#posicionTabla(int)}.
	 */
	@Test
	void testPosicionTabla() {
		fail("Not yet implemented");
	}

}
