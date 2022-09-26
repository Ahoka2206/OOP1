class CommissionEmployee extends Employee {
	private float regularSalary;  //fixed monthly salary
	private int itemSold;	      //total number of items sold
	private float commissionRate;	//rate per item (in decimal form)

	//contructors
	public CommissionEmployee(String name, String address, int age, String cName, float rSal, int isold, float commission) {
		super(name,address,age, cName);
		this.regularSalary = rSal;
		this.itemSold = isold;
		this.commissionRate = commission;
	}

	public CommissionEmployee() {}

	// provide the setters and getters of your data members
	//setters
	public void setRegularSalary(float rSal){
		this.regularSalary = rSal;
	}

	public void setItemSold(int isold){
		this.itemSold = isold;
	}

	public void setCommissionRate(float commission){
		this.commissionRate = commission;
	}

	//getters
	public float getRegularSalary(){
		return regularSalary;
	}

	public int getItemSold(){
		return itemSold;
	}

	public float getCommissionRate(){
		return commissionRate;
	}


		//the total earnings of a commission employee is the sum of
		//the monthly salary plus the commission.
		//commission will be based on the total number of items sold
		//times the commission rate per item.
	public double earnings (){
		double commission = getItemSold() * getCommissionRate();
		double totalcom = getRegularSalary() + commission;
		return totalcom;
	}

	// override the toString() and equals() methods
	public String toString() {
		return super.toString() + "\nRegular salary: " + getRegularSalary() + "\nItem sold: " + getItemSold() + "\nCommission rate: " + getCommissionRate();
	}

	public boolean equals(final Object o) {
		if (o instanceof CommissionEmployee) {
			final CommissionEmployee cemp = (CommissionEmployee)o;
			if (this.getRegularSalary() == cemp.getRegularSalary() && this.getItemSold() == cemp.getItemSold() && this.getCommissionRate() == cemp.getCommissionRate()) {
				return true;
			}
		}
		return false;
    }
}









