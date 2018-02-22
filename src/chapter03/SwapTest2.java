package chapter03;

public class SwapTest2 {

	public static void main(String[] args) {
		Value i = new Value();
		Value j = new Value();

		i.setValue(10);
		j.setValue(20);

		System.out.println(i.getValue() + "," + j.getValue());
		swap(i, j);
		System.out.println(i.getValue() + "," + j.getValue());
	}

	public static void swap(Value p, Value q) {
		int temp = p.getValue();
		p.setValue(q.getValue());
		q.setValue(temp);
	}
}
