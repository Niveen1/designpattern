package com.assignment.designpatterns.command;

import com.assignment.designpatterns.color.GreenShape;
import com.assignment.designpatterns.shape.Shape;

public class PrintGreenShapeCommand implements PrintCommand {
	Shape shape;

	public PrintGreenShapeCommand(Shape shape) {
		this.shape=shape;
	}

	@Override
	public void print() {
		System.out.println(new GreenShape(shape).getShape());
	}
}