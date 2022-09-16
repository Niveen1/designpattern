package com.assignment.designpatterns;

import com.assignment.designpatterns.facade.ShapeFacadeImpl;
import com.assignment.designpatterns.facade.ShapeFacade;

public class Application {
	public static void main(String[] args) {
		ShapeFacade shapeFacade = new ShapeFacadeImpl();
		shapeFacade.printGreenShape();
		shapeFacade.printRedShape();
		shapeFacade.calculateTriangleArea();
	}
}
