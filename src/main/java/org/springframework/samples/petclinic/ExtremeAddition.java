package org.springframework.samples.petclinic;

public class ExtremeAddition implements MathStatement {

	private int x;

	private int y;

	public ExtremeAddition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int extremeAdd() {
		return this.x + this.y;
	}

	@Override
	public String profoundMathStatement() {
		return "2 + 2 is 4";
	}

}