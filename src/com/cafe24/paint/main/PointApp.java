package com.cafe24.paint.main;

import com.cafe24.i.Drawable;
import com.cafe24.paint.point.ColorPoint;
import com.cafe24.paint.point.Point;
import com.cafe24.paint.shape.Circle;
import com.cafe24.paint.shape.Rectangle;
import com.cafe24.paint.shape.Shape;
import com.cafe24.paint.shape.Triangle;

public class PointApp {

	public static void main(String[] args) {
		Point p = new Point();

		p.setX(20);
		p.setY(20);

		draw(p);

		Point p2 = new Point(100, 200);

		p2.show(true);
		p2.show(false);

		Point p3 = new ColorPoint(200, 100, "red");

		draw(p3);
		p3.show(false);
		p3.show(true);

		Shape s = new Rectangle(100, 200);
		draw(s);

		// downcasting - > explicity casting
		Rectangle r = (Rectangle) s;
		r.getHeight();
		// ((Rectangle)s).getWidth();

		// upcasting - > implicity casting
		Circle c = new Circle(10);
		Shape s2 = c; // Circle 에서 Shape로 업캐스팅 (암시적 캐스팅) 자식에서 부모로 갈때

		// 기본 타입은 int double 은 작은타입으로 암시적 캐스팅
		draw(s2);

		// instanceof 클래스 경우
		// 상속관계(부모거나 자식들만 연산할수 있다) 형변환이 가능하냐?
		Shape ss = new Rectangle(10,20);
		System.out.println(ss instanceof Object);
		System.out.println(ss instanceof Shape);
		System.out.println(ss instanceof Rectangle);
		System.out.println(ss instanceof Triangle);
		
		Rectangle rect = new Rectangle(10,20);
		System.out.println(rect instanceof Object);
		System.out.println(rect instanceof Shape);
		System.out.println(rect instanceof Rectangle);
//		System.out.println(rect instanceof Triangle);
		
		
		
		
		
		
		
		
		
		
		// double d = 3.0;
		// int w = (int)d;
		//
		// int qwe = 3;
		// double dd = qwe;
		//
		// float b = 3.0f;
		// int a = (int)b;
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}
}
