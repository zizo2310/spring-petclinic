package org.springframework.samples.petclinic;

public class ExtremeDivision implements MathStatement {

	private int x;

	private int y;

	public ExtremeDivision(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int extremeDivide() {
		return this.x % this.y;
	}

	@Override
	public String profoundMathStatement() {
		return "2 / 2 = 1 but 1 / 1 = 1 and yet 2 / 1 = 2";
	}

}