package com.assignment.designpatterns.shape;

import com.assignment.designpatterns.area.Area;

public class CircleShape implements Shape,Area{

	@Override
	public String getShape()
	{
		return "Shape Name is Circle";
	}
	
	@Override
	public void calculateArea() {
		System.out.println("calculate area for Circle");
	}
}
