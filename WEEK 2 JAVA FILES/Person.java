public class Person{
	private Name pname;
	private int age;
	private char gender;

	public Person (){} //Constructor

	public Person (Name personname, int page, char pgender){
		this.pname = personname;
		this.age = page;
		this.gender = pgender;
	}

	public Person(Name n, char gender){
		this.pname = pname;
		this.gender = gender;
		age = 25;
	}

	//setters
	public void setPersonName(){
		this.pname = pname;
	}

	public void setAge(){
		this.age = age;
	}

	public void setGender(){
		this.gender = gender;
	}

	//getters
	public Name getPersonName(){
		return pname;
	}

	public int getAge(){
		return age;
	}

	public char getGender(){
		return gender;
	}

	public String toString(){
		return "Name:" + pname.getFirstname() + " " + pname.getMiddleInitial() + ". " + pname.getLastname() + "\n" + "Age:" + getAge() + "\n" + "Gender:" + getGender();
	}

/*
	public static void main (String[] args){
			Name name = new Name("John",'S',"Doe");
			Name name2 = new Name("Johns",'S',"Doe");
			Person p = new Person(name ,20, 'M');
			System.out.println(p);
	}
*/
}