
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {

	private double side;
	
	public Octagon() {
		this.side = 0;
	}
	
	public Octagon(double s) {
		this.side = s;
	}
	
	public double getSide() {
		return this.side;
	}
	
	public void setSide(double s) {
		this.side = s;
	}
	
	@Override 
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * Math.pow(side, 2);
	}
	
	@Override 
	public double getPerimeter() {
		return 8 * this.side;
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		}
		catch(CloneNotSupportedException cnse) {
			return null;
		}
	}
	
	@Override
	public int compareTo(Octagon o) {
		if(this.getArea() > o.getArea()) {
			return 1;
		}
		else if(this.getArea() < o.getArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
