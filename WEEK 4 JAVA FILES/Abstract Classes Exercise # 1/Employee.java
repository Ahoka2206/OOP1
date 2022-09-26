abstract class Employee extends Person {
    private String companyName;

    public Employee(String name,String address,int age,String companyName) {
       super(name,address,age);
       this.companyName = companyName;
    }

    public Employee() {}

	//setters
    public void setCompanyName(String cname){
        companyName = cname;
    }

	//getters
    public String getCompanyName(){
        return companyName;
    }

   // Override the display method in the Person class
	public void display() {
		System.out.println("Name      : " + super.getName());
		System.out.println("Address   : " + super.getAddress());
		System.out.println("Age       : " + super.getAge());
		System.out.println("Company Name: " + getCompanyName());
	}

    // define earnings as an abstract method with a return type of double
	public abstract double earnings ();

    // override the toString() and equals() methods
	public String toString() {
		return super.toString() + "\nCompany Name: " + getCompanyName();
	}

    public boolean equals(final Object o) {
		if (o instanceof Employee) {
			final Employee emp = (Employee)o;
			if (this.getCompanyName() == emp.getCompanyName()) {
				return true;
			}
		}
		return false;
    }

}
