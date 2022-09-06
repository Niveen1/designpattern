package com.assignment.designpatterns.shape;

import com.assignment.designpatterns.area.Area;

public class RectangleShape implements Shape,Area {

	@Override
	public String getShape() {
		return "Shape Name is Rectangle";
	}
	
	@Override
	public void calculateArea() {
		System.out.println("calculate area for Rectangle");
	}
}
