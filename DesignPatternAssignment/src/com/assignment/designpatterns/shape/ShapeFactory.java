package com.assignment.designpatterns.shape;

public class ShapeFactory {
	public Shape createShape(ShapeEnum shapeName) {
		if (shapeName == null)
			return null;
		switch (shapeName) {
		case CIRCLE:
			return new CircleShape();
		case RECTANGLE:
			return new RectangleShape();
		case TRIANGLE:
			return new TriangleShape();
		default:
			throw new IllegalArgumentException("Unknown Shape " + shapeName);
		}
	}
}
