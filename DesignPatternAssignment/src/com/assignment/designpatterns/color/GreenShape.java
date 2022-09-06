package com.assignment.designpatterns.color;

import com.assignment.designpatterns.shape.Shape;

public class GreenShape extends ShapeDecorator {

	public GreenShape(Shape shape) {
		super(shape);
	}

	public String getShape() {
		return super.getShape() + " With color Green";
	}
}
