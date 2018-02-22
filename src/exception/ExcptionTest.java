package exception;

public class ExcptionTest {

	public static void main(String[] args) {
		int a = 0;
		int result = 0;

		try {
			System.out.println("some code1");
			result = 1000 / a;
			System.out.println("some code2");
			System.out.println("some code3");
			System.out.println("some code4");

		} catch (ArithmeticException e) {
			// 1. 사과
			System.out.println("미안합니다.");
			// 2. 로그 남기기
			System.out.println(e);
			// 3. 정상 종료
			return;
		}

		System.out.println(result);

	}

}
