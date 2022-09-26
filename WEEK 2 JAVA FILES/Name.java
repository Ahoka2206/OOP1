public class Name{
	private String firstname;
	private char middleinitial;
	private String lastname;

	public Name (){} //Constructor

	public Name (String fname, char mi, String lname){
		this.firstname = fname;
	 	this.middleinitial = mi;
		this.lastname = lname;
	}

	//setters
	public void setFirstname(){
		this.firstname = firstname;
	}

	public void setMiddleInitial(){
		this.middleinitial = middleinitial;
	}

	public void setLastname(){
		this.lastname = lastname;
	}

	//getters
	public String getFirstname(){
		return firstname;
	}

	public char getMiddleInitial(){
		return middleinitial;
	}

	public String getLastname(){
		return lastname;
	}

	public String toString(){
		return "(" + getFirstname() +" " + getMiddleInitial() +". " + getLastname() + ")";
	}

	public boolean equals(Object p){
		boolean ans =false;
		if(p instanceof Name){
			Name temp =(Name) p;
			if(this.getFirstname() == temp.getFirstname() && this.getMiddleInitial() == temp.getMiddleInitial() && this.getLastname() == temp.getLastname())
							ans = true;
			}
		return ans;
	}
/*
	public static void main (String[] args){
		Name name = new Name("John",'S',"Doe");
		Name name2 = new Name("Johns",'S',"Doe");

		System.out.println(name);

		if(name.equals(name2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

	}
*/
}