package com.assignment.designpatterns;

import com.assignment.designpatterns.facade.ShapeFacadImpl;
import com.assignment.designpatterns.facade.ShapeFacade;

public class Application {
	public static void main(String[] args) {
		ShapeFacade shapeFacade = new ShapeFacadImpl();
		shapeFacade.printGreenShape();
		shapeFacade.printRedShape();
		shapeFacade.calculateTriangleArea();
	}
}
