package com.assignment.designpatterns.facade;

import com.assignment.designpatterns.area.ShapeAreaContext;
import com.assignment.designpatterns.command.PrintCommand;
import com.assignment.designpatterns.command.PrintGreenShapeCommand;
import com.assignment.designpatterns.command.PrintRedShapeCommand;
import com.assignment.designpatterns.shape.Shape;
import com.assignment.designpatterns.shape.ShapeFactory;
import com.assignment.designpatterns.shape.TriangleShape;

public class ShapeFacadImpl implements ShapeFacade {

	@Override
	public void printGreenShape() {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape circleShape = shapeFactory.createShape("CIRCLE");
		Shape rectangleShape = shapeFactory.createShape("RECTANGLE");
		
		PrintCommand printGreenCircleCommand = new PrintGreenShapeCommand(circleShape);
		PrintCommand printGreenRectangleCommand = new PrintGreenShapeCommand(rectangleShape);

		printGreenCircleCommand.print();
		printGreenRectangleCommand.print();
	}

	@Override
	public void printRedShape() {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape circleShape = shapeFactory.createShape("CIRCLE");
		Shape rectangleShape = shapeFactory.createShape("RECTANGLE");
		
		PrintCommand printRedCircleCommand = new PrintRedShapeCommand(circleShape);
		PrintCommand printRedRectangleCommand = new PrintRedShapeCommand(rectangleShape);
		printRedCircleCommand.print();
		printRedRectangleCommand.print();
	}
	
	@Override
	public void calculateTriangleArea() {
		ShapeFactory shapeFactory = new ShapeFactory();

		ShapeAreaContext shapeContext = new ShapeAreaContext();
		Shape triangleShape = shapeFactory.createShape("TRIANGLE");
		shapeContext.calculateArea((TriangleShape) triangleShape);
	
	}

}
