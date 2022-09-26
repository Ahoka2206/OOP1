public class Square extends Shape{
	private int sides;

	//contructors
	public Square(){}

	public Square(String name, int sides){
		super(name);
		this.sides = sides;
	}

	//setter
	public void setSides(int sides) {
		this.sides = sides;
	}
	//getter
	public int getSides() {
		return sides;
	}

	public boolean equals(final Object r) {
		if (r instanceof Square) {
			final Square oui = (Square) r;
				if (this.getSides() == oui.getSides())
					return true;
			}
			return false;
	}

	public String toString() {
		return super.toString() + " " + getSides();
	}

	public double getArea(){
		double areaCompute = getSides() * getSides();
		return areaCompute;
	}
}