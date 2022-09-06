package com.assignment.designpatterns.shape;

import com.assignment.designpatterns.area.Area;

public class TriangleShape implements Shape,Area {

	@Override
	public String getShape() {
		return "Shape Name is Triangle";
	}
	
	@Override
	public void calculateArea() {
		System.out.println("calculate area for Triangle");
	}
}
