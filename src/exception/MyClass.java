package exception;

import java.io.IOException;

public class MyClass {

	public void danger() throws IOException, MyException {
		System.out.println("somecode1");
		System.out.println("somecode2");

		if (2 == 2) {
//			throw new MyException();
			throw new MyException("예외발생");
		}

		if (1 == 1) {
			throw new IOException();
		}
	}

}
