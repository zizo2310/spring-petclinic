package org.springframework.samples.petclinic;

public class ExtremeMultiplication {

	private int x;
	private int y;

	public ExtremeMultiplication(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int extremeMultiply() {
		return this.x * this.y;
	}
}