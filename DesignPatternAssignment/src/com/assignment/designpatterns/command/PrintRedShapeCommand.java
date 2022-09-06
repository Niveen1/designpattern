package com.assignment.designpatterns.command;

import com.assignment.designpatterns.color.RedShape;
import com.assignment.designpatterns.shape.Shape;

public class PrintRedShapeCommand extends PrintCommand {
	public PrintRedShapeCommand(Shape shape) {
		super(shape);
	}

	@Override
	public void print() {
		System.out.println(new RedShape(shape).getShape());
	}
}