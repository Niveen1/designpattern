package com.assignment.designpatterns.color;

import com.assignment.designpatterns.shape.Shape;

public abstract class ShapeDecorator implements Shape {

	private Shape shape;

	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}

	@Override
	public String getShape() {
		return shape.getShape();
	}
}