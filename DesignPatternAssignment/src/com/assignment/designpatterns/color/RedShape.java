package com.assignment.designpatterns.color;

import com.assignment.designpatterns.shape.Shape;

public class RedShape extends ShapeDecorator {
	public RedShape(Shape shape) {
		super(shape);
	}

	public String getShape() {
		return super.getShape() + " With color Red";
	}
}
