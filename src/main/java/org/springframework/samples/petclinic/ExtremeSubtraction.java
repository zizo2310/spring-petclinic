package org.springframework.samples.petclinic;

public class ExtremeSubtraction implements MathStatement {

	private int x;

	private int y;

	public ExtremeSubtraction(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int extremeSubtract() {
		return this.x - this.y;
	}

	@Override
	public String profoundMathStatement() {
		return "2 - 2 is also 4 as well!? No just kidding. It's 0";
	}

}