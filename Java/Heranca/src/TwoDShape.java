
public class TwoDShape {

	private double width;
	private double height;

	public TwoDShape(double w, double h) {
		width = w;
		height = h;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double w) {
	width = w;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = h;
	}

	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}

}
