package area;

public class Area {
	private double length, width, area;
	
	public Area(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public void ResultArea() {
		area = width * length;
	}
	
	public void print() {
		ResultArea();
		System.out.println("The Area of a Rectangle is: " +area);
	}
}
