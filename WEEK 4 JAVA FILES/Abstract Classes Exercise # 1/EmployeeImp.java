public class EmployeeImp implements EmployeeInterface{
	private int count;
	private Employee [] array;

	//constructors
	public EmployeeImp (){}

	public EmployeeImp (int size){
		array = new Employee [size];
	}

	public boolean add(Employee e){
		if(this.count < array.length){
			array[count] = e;
			count++;
			return true;
		}
		return false;
	}

	public int search(String name){
		for(int i = 0; i < count; i++){
			if(array[i].getName() == name)
				return i;
		}
		return 0;
	}

	//WA PA NI
	public void display(){
		for(int i = 0; i < count; i++){
			System.out.println(array[i] + "\nEarnings:" + array[i].earnings());
			System.out.println();
		}
	}

	public boolean isFull(){
		if (count == size)
			return true;

		return false;
	}

	public boolean isEmpty(){
		return count == 0;
	}

	public void displayCountEmployee(){
		int hour = 0, coms = 0;
		for(int i = 0; i < count; i++){
			if( array[i] instanceof HourlyEmployee)//gamit ana para unsa sya type
				hour++;
			else if(array[i] instanceof CommissionEmployee )
				coms++;
		}

		System.out.println("Number of Hourly Employee: " + hour);
		System.out.println("Number of Commission Employee: " + coms);
    }

	public Employee delete(String name){
		int ctr = 0;
		for(int i = 0; i < count; i++){
			 if(array[i].getName() == name){
			 	 for(int k = i; k < count - 1; k++){// -1 kay if di molapas sya
					 array[k] = array[k + 1];
				 }
			 	 count--;//nakuhaan ang count kay ni delete
			 	 System.out.println("Deleted employee\n"+ array[i]);// ang sud sa array na kana na index ang iprint
			     return array[i];
			}else {
				ctr++;//name not found, increment
			}
		}
		if (ctr != 0)//if nisud syas else na statement
			System.out.println("No such record."+ name + "\n");
		return null;
	}
}