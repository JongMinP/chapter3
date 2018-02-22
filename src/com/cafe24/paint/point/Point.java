package com.cafe24.paint.point;

import com.cafe24.i.Drawable;

public class Point implements Drawable{
	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void draw() { // disappear이라는 메서드를 만드는게 아니라 show를 토글형식으로 파라미터 값으로 메서드 디자인

		System.out.println("점[" + x + "," + y + "]을 그렸습니다.");
	}

	public void show(boolean visible) {

		if (visible == true) {
			draw(); // ColorPrint에서 show를 한 번만 오버라이드 해서 재사용 한다. 
			return; // 가독성을 위해 if else를 쓰지 않고 리턴을 한다.
		}
		
		System.out.println("점[" + x + "," + y + "]을 지웠습니다.");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

		

}
