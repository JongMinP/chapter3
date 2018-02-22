package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("./hello.txt");
			int data = fis.read();

			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		} finally {
			try {
				if (fis != null) // nullpointerException 방지
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
