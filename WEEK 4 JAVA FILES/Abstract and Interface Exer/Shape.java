abstract class Shape {
	private String name;

	//contructors
	public Shape(){}

	public Shape(String name){
		this.name = name;
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public String getName() {
		return name;
	}

	// override the toString() and equals() methods
	public String toString() {
		return this.name;
    }

	public boolean equals(final Object o) {
	        if (o instanceof Shape) {
	            final Shape you = (Shape) o;
	            if (this.getName() == you.getName())
	                return true;
	        }
	        return false;
    }

	public abstract double getArea();
}