
public class Triangle extends TwoDShape {
	
	String style;
	
	
	
	public Triangle(String s, double w, double h) {
		super(w, h);
		style = s;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is: " + style);
	}
	

}
