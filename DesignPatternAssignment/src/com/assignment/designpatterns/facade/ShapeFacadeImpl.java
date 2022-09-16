package com.assignment.designpatterns.facade;

import com.assignment.designpatterns.area.ShapeAreaContext;
import com.assignment.designpatterns.command.PrintCommand;
import com.assignment.designpatterns.command.PrintGreenShapeCommand;
import com.assignment.designpatterns.command.PrintRedShapeCommand;
import com.assignment.designpatterns.shape.Shape;
import com.assignment.designpatterns.shape.ShapeEnum;
import com.assignment.designpatterns.shape.ShapeFactory;
import com.assignment.designpatterns.shape.TriangleShape;

public class ShapeFacadeImpl implements ShapeFacade {

	@Override
	public void printGreenShape() {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape circleShape = shapeFactory.createShape(ShapeEnum.CIRCLE);
		Shape rectangleShape = shapeFactory.createShape(ShapeEnum.RECTANGLE);
		
		PrintCommand printGreenCircleCommand = new PrintGreenShapeCommand(circleShape);
		PrintCommand printGreenRectangleCommand = new PrintGreenShapeCommand(rectangleShape);

		printGreenCircleCommand.print();
		printGreenRectangleCommand.print();
	}

	@Override
	public void printRedShape() {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape circleShape = shapeFactory.createShape(ShapeEnum.CIRCLE);
		Shape rectangleShape = shapeFactory.createShape(ShapeEnum.RECTANGLE);
		
		PrintCommand printRedCircleCommand = new PrintRedShapeCommand(circleShape);
		PrintCommand printRedRectangleCommand = new PrintRedShapeCommand(rectangleShape);
		printRedCircleCommand.print();
		printRedRectangleCommand.print();
	}
	
	@Override
	public void calculateTriangleArea() {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape triangleShape = shapeFactory.createShape(ShapeEnum.TRIANGLE);
		ShapeAreaContext shapeContext = new ShapeAreaContext((TriangleShape) triangleShape);
		shapeContext.calculateArea();
	
	}

}
