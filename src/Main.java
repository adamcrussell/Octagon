
public class Main {

	public static void main(String[] args) {
		Octagon o = new Octagon(5);
		System.out.println("Area: " + o.getArea());
		System.out.println("Perimeter: " + o.getPerimeter());
		Octagon oClone = (Octagon) o.clone();
		System.out.println("Area: " + oClone.getArea());
		System.out.println("Perimeter: " + oClone.getPerimeter());
	}


}
