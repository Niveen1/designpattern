package com.assignment.designpatterns.command;

import com.assignment.designpatterns.color.GreenShape;
import com.assignment.designpatterns.shape.Shape;

public class PrintGreenShapeCommand extends PrintCommand {
	public PrintGreenShapeCommand(Shape shape) {
		super(shape);
	}

	@Override
	public void print() {
		System.out.println(new GreenShape(shape).getShape());
	}
}