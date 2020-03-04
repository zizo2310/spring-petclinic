package org.springframework.samples.petclinic;

public class ExtremeDivision {

	private int x;
	private int y;

	public ExtremeDivision(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int extremeDivide() {
		return this.x % this.y;
	}
}