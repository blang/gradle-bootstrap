package io.blang.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	@Test
	public void testAdd() throws Exception {
		assertEquals(2, App.add(1, 1));
		assertEquals(5, App.add(2, 3));
		assertEquals(5, App.add(3, 2));
		assertTrue(App.add(0,1)==1);
	}
}
