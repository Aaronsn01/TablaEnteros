/**
 * 
 */
package TablaEnteros;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

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
		int max = -999;
		Integer [] arrayNumero2 = new Integer[3];
		arrayNumero2[0] = -1000;
		arrayNumero2[1] = -2000;
		arrayNumero2[2] = -3000;
		
		TablaEnteros tabla2 = new TablaEnteros(arrayNumero2);
		assertEquals(max, tabla2.mayorTabla());
	}
	
	@Test
	void testMayorTabla2() {
		assertEquals(50, tablaEnteros.mayorTabla());
	}

	@Test
	void testPosicionTabla1() {
		assertEquals(3, tablaEnteros.posicionTabla(40));
	}

	@Test
	void testPosicionTablaNull() {
		assertThrows(NoSuchElementException.class,() -> tablaEnteros.posicionTabla(200));
	}
	/**
	 * Test method for {@link TablaEnteros.TablaEnteros#posicionTabla(int)}.
	 */
	@Test
	void testPosicionTabla() {
		fail("Not yet implemented");
	}

}
