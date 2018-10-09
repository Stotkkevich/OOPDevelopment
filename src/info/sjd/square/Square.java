package info.sjd.square;

import java.util.logging.Logger;

import info.sjd.AbstractShape;

public class Square extends AbstractShape {

	private static Logger logger = Logger.getLogger(Square.class.getName());
	
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

	public static void main(String[] args) {
		Square square = new Square();
		square.setSide(8);
		logger.info("Square with site " + square.getSide() + " has area " + square.getArea());
	}
}
