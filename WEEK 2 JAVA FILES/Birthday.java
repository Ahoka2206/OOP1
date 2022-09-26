public class Birthday{
	//define the attributes of birthday
	//encapsulate the fields
	//override toString and equals of class Object
	private int month;
	private int day;
	private int year;


	public Birthday(){
		month=1;
		day=1;
		year=1900;
	}


	public Birthday(int month, int day, int year){
		setMonth(month);
		setDay(day);
		setYear(year);
	}


	//setters
	public void setMonth(int month){
		if(month >=1 && month <=12)
			this.month = month;
		else
			this.month=1;
	}
	public void setDay(int day){
		//31 - 1,3,5,7,8,10,12
		//30 - 4,6,9,11
		//29 - 2
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(day >=1 && day <=31)
					this.day = day;
				else
					this.day=1;
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				if(day >=1 && day <=30)
					this.day = day;
				else
					this.day=1;
				break;
			case 2:
				if(day >=1 && day <=29)
					this.day = day;
				else
					this.day=1;
				break;


		}

	}
	public void setYear(int year){
		if(year >0)
			this.year = year;
		else
			this.year=1900;
	}


	//getters
	public int getMonth(){
		return month;
	}

	public int getDay(){
			return day;
	}

	public int getYear(){
			return year;
	}

	public String toString(){
		//month/day/year
		return getMonth()+"/"+getDay()+"/"+getYear();
	}

	public boolean equals(Object obj){
		if (obj instanceof Birthday){
			Birthday b = (Birthday) obj;
			if(this.getMonth() == b.getMonth() && this.getDay() == b.getDay() && this.getYear() == b.getYear())
				return true;
		}
		return false;
	}


	public static void main(String [] args){
		Birthday bday = new Birthday(13,90,-1);
		System.out.println(bday); //  0/0/0
	}
}