public interface EmployeeInterface{
	int size = 20;
	public boolean add(Employee e);
	public int search(String name);
	public void display();
	public boolean isFull();
	public boolean isEmpty();
	public void displayCountEmployee();
	public Employee delete(String name);
}