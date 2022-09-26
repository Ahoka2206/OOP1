class HourlyEmployee extends Employee {
    private int hoursWorked;  //total number of hours worked
    private double rate;      // rate per hour

	//constructors
	public HourlyEmployee(){}

    public HourlyEmployee(String name,String address,int age,String cName,int hoursWorked,double rate)    {
		super(name, address, age, cName);
		this.hoursWorked = hoursWorked;
		this.rate = rate;
    }

    public HourlyEmployee(String name,String address,int age,String cName)    {
        super(name, address, age, cName);
        hoursWorked = 0;
        rate = 0;
    }

    // provide the setters and getters of your data members
	//setters
	public void setHoursWorked(int hoursWorked){
		this.hoursWorked = hoursWorked;
	}

	public void setRate(double rate){
		this.rate = rate;
	}

	//getter
	public int getHoursWorked(){
		return hoursWorked;
	}

	public double getRate(){
		return rate;
	}
        //earnings is computed by having the product of
        //the total number of hours worked and the rate.
        // but if the number of hours worked exceeds 40,
        // the rate increases to 150% of the current rate.
        // (ex. rate=200; 150% = 300)


	public double earnings (){
		double currearning;
		if (getHoursWorked() > 40)
			currearning = getHoursWorked() * getRate() * 1.5;
		else
			currearning = getHoursWorked() * getRate();

		return currearning;
	}

    // override the toString() and equals() methods
	public String toString() {
		return super.toString() + "\nHours worked: " + getHoursWorked() + "\nRate: " + getRate();
	}

	public boolean equals(final Object o) {
		if (o instanceof HourlyEmployee) {
			final HourlyEmployee hrem = (HourlyEmployee)o;
			if (this.getHoursWorked() == hrem.getHoursWorked() && this.getRate() == hrem.getRate()) {
				return true;
			}
		}
		return false;
    }
}