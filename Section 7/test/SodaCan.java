public class SodaCan {
	double height;
	double radius;

	public SodaCan(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}

	public double getVolume() {
		return 3.14* (radius*radius)*height;
	}

	public double getSurfaceArea() {
		return (2 * 3.14 * radius * height) + (2 * 3.14 * (radius * radius));
	}


	public static void main (String[] args){
		SodaCan test = new SodaCan(10.0,1.0);
		System.out.println("Test Volume: " + test.getVolume() + " Test Surface Area: " + test.getSurfaceArea() );
		

	}
}
