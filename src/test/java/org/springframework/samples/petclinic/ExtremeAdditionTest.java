package org.springframework.samples.petclinic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExtremeAdditionTest {

	@Test
	public void testExtremeSubtract() {

		ExtremeAddition e1 = new ExtremeAddition(16, 4);
		assertEquals(e1.extremeAdd(), 20);
	}

}