
public class Retangle extends TwoDShape{
	
	public Retangle(double w, double h) {
		super(w, h);

	}

	boolean isSquare() {
		
		if(getWidth() == getHeight()) 
		System.out.println("Retangle is square");
		return false;
				
	}
	double area() {
		return getWidth() * getHeight();
	}

}
