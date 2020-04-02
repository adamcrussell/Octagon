
public class Main {

	public static void main(String[] args) {
		Octagon o = new Octagon(5);
		System.out.println("Area: " + o.getArea());
		System.out.println("Perimeter: " + o.getPerimeter());
		Octagon oClone = (Octagon) o.clone();
		System.out.println("Area of Clone: " + oClone.getArea());
		System.out.println("Perimeter of Clone: " + oClone.getPerimeter());
	}


}
