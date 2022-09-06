package com.assignment.designpatterns.area;

public class ShapeAreaContext {
	private Area area;

	public ShapeAreaContext(Area area) {
		this.area = area;
	}

	public void calculateArea() {
		area.calculateArea();
	}
}
