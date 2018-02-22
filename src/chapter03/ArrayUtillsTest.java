package chapter03;

public class ArrayUtillsTest {

	public static void main(String[] args) {

		int[] s1 = { 1, 2, 3 };
		int[] s2 = { 8, 7, 6 };

		double[] s3 = { 1.0, 2.0 };

		int[] s = ArrayUtills.doubleToInt(s3);
		double[] d = ArrayUtills.intToDouble(s1);
		int[] ii = ArrayUtills.concat(s1, s2);
		
		for(int i : ii) {
			System.out.print(i);
		}
		

	}

}
