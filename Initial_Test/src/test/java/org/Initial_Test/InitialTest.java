package org.Initial_Test;

import static org.junit.Assert.*;
import org.junit.Test;

public class InitialTest {
	
	@Test
	public void initialTest(){
		Object obj = new Object();
		assertEquals(2,2);
		assertTrue(true);
		assertFalse(false);
		assertNotNull(obj);
		assertSame(obj, obj);
		assertNull(null);
		System.out.println("***** Ejecutado InitialTest ");
	}
	
}
