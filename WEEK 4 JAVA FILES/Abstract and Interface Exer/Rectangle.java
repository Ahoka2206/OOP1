public class Rectangle extends Shape{
	private int length;
	private int width;

	//contructors
	public Rectangle(){}

	public Rectangle(String name, int length, int width){
		super(name);
		this.length = length;
		this.width = width;
	}

	//setter
	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	//getter
	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public boolean equals(final Object r) {
		if (r instanceof Rectangle) {
			final Rectangle yes = (Rectangle) r;
				if (this.getLength() == yes.getLength() && this.getWidth() == yes.getWidth())
					return true;
			}
			return false;
	}

	public String toString() {
		return super.toString() + " " + getLength() + " " + getWidth();
	}

    public double getArea(){
		double areaCompute = this.length * this.width;
		return areaCompute;
	}
}