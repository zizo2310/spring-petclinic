package org.springframework.samples.petclinic;

public class ExtremeSubtraction {

	private int x;
	private int y;

	public ExtremeSubtraction(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int extremeSubtract() {
		return this.x - this.y;
	}
}