package chapter03;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public static int countOfGoods;

	public Goods() {
		countOfGoods++;
	}

	public Goods(String name, int price, int countStock, int countSold) {
		super();
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			price = 0;
		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public void showInfo() {
		System.out.println("상품이름 : " + name + ", 상품가격 : " + price);
	}

	public int calcDiscountPrice(double rate) {
		return (int) (price * rate);
	}

}
