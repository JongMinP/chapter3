package exception;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {

		try {
			test();
		} catch (IOException | MyException e) {
			e.printStackTrace();
		}
	}

	public static void test() throws IOException, MyException { // 예외 회피 밖에서 처리해라

		MyClass myclass = new MyClass();

		myclass.danger();

	}

}
