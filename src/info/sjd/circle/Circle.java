package info.sjd.circle;

import info.sjd.AbstractShape;
import info.sjd.Shape;

public class Circle extends AbstractShape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public int getArea() {
		return (int)(Math.PI*radius*radius);
	}

}
