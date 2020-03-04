package org.springframework.samples.petclinic;

public class ExtremeMultiplication implements MathStatement {

	private int x;

	private int y;

	public ExtremeMultiplication(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int extremeMultiply() {
		return this.x * this.y;
	}

	@Override
	public String profoundMathStatement() {
		return "2 * 2 is also 4! Not 4 factorial. I'm just shocked so I am using an exclamation mark...";
	}

}