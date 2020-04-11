package org.springframework.samples.petclinic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExtremeSubtractionTest {

	@Test
	public void testExtremeSubtract() {

		ExtremeSubtraction e1 = new ExtremeSubtraction(16, 4);
		assertEquals(e1.extremeSubtract(), 12);
	}

}