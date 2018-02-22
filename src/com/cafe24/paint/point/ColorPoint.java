package com.cafe24.paint.point;

public class ColorPoint extends Point {
	private String color;

	
	public ColorPoint() {}
	
	public ColorPoint(int x,int y,String color) {
		super(x,y);
//		setX(x);
//		setY(y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	@Override
	public void draw() {
		System.out.println("점[" + getX() + "," + getY() + ",color= " + color  + "]을 그렸습니다.");
	}

	public void setColor(String color) {
		this.color = color;
	}

}
