import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalcTest {
	
/*	@BeforeAll
	void testSomething {
		
	}
	@AfterAll
	@BeforeEach
	@AfterEach
*/	
	
	@Test
	void testAdd() {
		
		Calculator clsCalc = new Calculator();
		if (clsCalc.add(1,5) !=6) {
		   fail("Not yet implemented");
		}
		
	}
	
	@Test
	void testSubtract() {
		
		//Calculator clsCalc = new Calculator();
		//assertEquals(Calculator.subtract(7,5),2);
	/*	assertNotEquals(false, true);
		assertNull()
		assertNotNull
		assertTrue
		assertFalse
		assertSame
		assertNotSame
	*/	
		if (Calculator.subtract(7,5) !=2) {
		   fail("Not yet implemented");
		}
		
	}

}
