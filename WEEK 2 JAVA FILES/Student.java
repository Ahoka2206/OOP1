public class Student{
   private String id;
   private String name;
   private String course;
   private int year;
   private Birthday birthday;

   public Student(){
		id="2";
		name="Shiela";
		course="bsit";
		year =2;
		birthday = new Birthday();
   }

   public Student(String i, String n, String c, int y, Birthday birthday){
	   id = i;
	   name=n;
	   course=c;
	   year=y;
	   this.birthday = birthday;
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

	public void setBirthday(Birthday birtday){
		this.birthday = birthday;
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

	public Birthday getBirthday(){
		return birthday;
	}

	public String toString(){
		return getId()+" "+getName()+" "+getCourse()+"-"+getYear()+"\n"+getBirthday();
	}


	public boolean equals(Object o){
		boolean check =false;
		if(o instanceof Student){
			Student temp =(Student) o;
			if(this.getId().equals(temp.getId())==true && this.getName().equals(temp.getName())==true && this.getCourse().equals(temp.getCourse())==true &&
				this.getYear()==temp.getYear() && this.getBirthday().equals(temp.getBirthday()))
			check = true;
		}
		return check;
	}

   public void display(){
	System.out.println("ID: "+id);
       System.out.println("Name: "+name);
       System.out.println("Course & Year: "+course+"-"+year);
       //month-day-year
       System.out.println("Birth date:"+birthday.getMonth()+"-"+birthday.getDay()+"-"+birthday.getYear());
	}

	//public int display(){}

	public static void main(String [] args){

		Student s1 = new Student();  // 2 Sheila bsit-2
									//  1/1/1900


		//Birthday bday= new Birthday();
		Student s2 = new Student("3","mark","bscs",4, new Birthday(23,1,2015));  //3 mark bscs-4
																				//  1/1/2015

		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s1.equals(s2));

		s1.display();

	}
}