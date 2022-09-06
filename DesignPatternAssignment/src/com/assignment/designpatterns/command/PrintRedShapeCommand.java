package com.assignment.designpatterns.command;

import com.assignment.designpatterns.color.RedShape;
import com.assignment.designpatterns.shape.Shape;

public class PrintRedShapeCommand implements PrintCommand {
	Shape shape;

	public PrintRedShapeCommand(Shape shape) {
		this.shape=shape;
	}

	@Override
	public void print() {
		System.out.println(new RedShape(shape).getShape());
	}
}