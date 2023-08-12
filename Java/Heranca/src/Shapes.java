
public class Shapes {

	public static void main(String[] args) {

		Triangle t1 = new Triangle("Filled", 4.0, 4.0);
		Triangle t2 = new Triangle("Outlined", 8.0, 12.0);
		Retangle t3 = new Retangle(12.0,12.0);
		ColorTriangle t4 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);
		ColorTriangle t5 = new ColorTriangle("Blue", "filled", 2.0, 2.0);
		
		
		
		// t1.setWidth(4.0);
		// t1.setHeight(4.0);
		// t1.style = "filled";
		// metodo antigo
		// t2.setWidth(8.0);
		// t2.setHeight(12.0);
		// t2.style = "outlined";

		System.out.println("Info para t1: ");
		t1.showStyle();
		t1.showDim();
		t4.showColor();
		
		System.out.println("Area is: " + t1.area());

		System.out.println();

		System.out.println("Info para t2: ");
		t2.showStyle();
		t2.showDim();
		t5.showColor();
		System.out.println("Area is: " + t2.area());

		System.out.println();

		System.out.println("Info para t3: ");
		t3.isSquare();
		t3.showDim();
		System.out.println("Area is: " + t3.area());

	}

}
