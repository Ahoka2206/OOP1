public class Student1{
   private String id;
   private String name;
   private String course;
   private int year;

   public Student1(){
		id="2";
		name="Shiela";
		course="bsit";
		year =2;
   }

   public Student1(String i, String n, String c, int y){
	   id = i;
	   name=n;
	   course=c;
	   year=y;

   }

	public void setId(String id){
		this.id=id;
	}

	public void setName(String name){
		if(name.length() >=2)
			this.name=name;
		else
			this.name="John Doe";
	}

	public void setCourse(String course){
		this.course=course;
	}

	public void setYear(int year){
		if (year >=1 && year<=5)
			this.year =year;
		else
			this.year=1;
	}

	public String getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String getCourse(){
		return course;
	}

	public int getYear(){
		return year;
	}

	public String toString(){
		return getId()+" "+getName()+" "+getCourse()+"-"+getYear();
	}


	public boolean equals(Object o){
		boolean check =false;
		if(o instanceof Student){
			Student temp =(Student) o;
			if(this.getId().equals(temp.getId())==true && this.getName().equals(temp.getName())==true && this.getCourse().equals(temp.getCourse())==true && this.getYear()==temp.getYear())


			check = true;
		}
		return check;
	}

   public void display(){
	System.out.println("ID: "+id);
       System.out.println("Name: "+name);
       System.out.println("Course & Year: "+course+"-"+year);
	}

	//public int display(){}

	public static void main(String [] args){

		Student1 s1 = new Student1();

		s1.display();

		Student1 s2 = new Student1("3","mark","bscs",4);

		s2.display();

	}
}