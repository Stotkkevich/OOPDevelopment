package info.sjd.square;

import info.sjd.AbstractShape;
import info.sjd.Shape;

public class Square extends AbstractShape {

	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int getArea() {
		return side*side;
	}

}
