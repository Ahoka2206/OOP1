public class Circle extends Shape{
	private int radius;

	//contructors
	public Circle(){}

	public Circle(String name, int radius){
		super(name);
		this.radius = radius;
	}

	//setter
	public void setRadius(int radius) {
		this.radius = radius;
	}
	//getter
	public int getRadius() {
		return radius;
	}

	public boolean equals(final Object r) {
		if (r instanceof Circle) {
			final Circle no = (Circle) r;
				if (this.getRadius() == no.getRadius())
					return true;
			}
			return false;
	}

	public String toString() {
		return super.toString() + " " + getRadius();
	}

	public double getArea(){
		double areaCompute = Math.PI * getRadius() * getRadius();
		return areaCompute;
	}
}