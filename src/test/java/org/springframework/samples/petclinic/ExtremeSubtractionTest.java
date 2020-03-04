package org.springframework.samples.petclinic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExtremeSubtractionTest {

	 @Test
	   public void testExtremeSubtract() {	

	     ExtremeDivision e1 = new ExtremeDivision(16, 4);
	      assertEquals(e1.extremeDivide(), 12);     
	   }
}