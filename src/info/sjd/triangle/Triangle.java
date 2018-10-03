package info.sjd.triangle;

import info.sjd.AbstractShape;
import info.sjd.Shape;

public class Triangle extends AbstractShape {

	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int getArea() {
		return (int)(height*base/2);
	}

}
