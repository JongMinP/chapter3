package chapter03;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.setName("canon");
		camera.setPrice(40000);
		camera.setCountStock(50);
		camera.setCountSold(100);

		// System.out.println("상품이름: " + camera.getName());
		camera.showInfo();
		System.out.println(camera.calcDiscountPrice(0.5));

		Goods camera1 = new Goods();
		Goods camera2 = new Goods();
		Goods camera3 = new Goods();

		System.out.println(Goods.countOfGoods);

		Goods goods = new Goods("asdas", 1, 1, 1);
		
	}

}
