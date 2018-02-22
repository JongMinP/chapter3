package chapter03;

import java.util.Arrays;

public class ArrayUtills {

	// int 배열을 double 배열로 변환
	public static double[] intToDouble(int[] source) {

		if (source == null) {
			return null;
		}

		int length = source.length;
		double[] result = new double[length];

		for (int i = 0; i < length; i++) {
			result[i] = source[i];
		}
		return result;

	}

	// double 배열을 int 배열로 변환
	public static int[] doubleToInt(double[] source) {

		if (source == null) {
			return null;
		}

		int length = source.length;
		int[] result = new int[length];

		for (int i = 0; i < length; i++) {
			result[i] = (int) source[i];
		}

		return result;
	}

	// int 배열 두 개를 연결한 새로운 배열 리턴
	public static int[] concat(int[] s1, int[] s2) {

		int length1 = (s1 == null) ? 0 : s1.length;
		int length2 = (s2 == null) ? 0 : s2.length;

		int[] result = new int[length1 + length2];

		int index = 0;

		for (int i = 0; i < length1; i++) {
			result[index++] = s1[i];
		}
		for (int i = 0; i < length2; i++) {
			result[index++] = s2[i];
		}

		return result;

	}

}
