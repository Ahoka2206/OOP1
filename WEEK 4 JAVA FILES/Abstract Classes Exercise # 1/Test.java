public class Test{
	public static void main (String [] args) {
EmployeeImp  e = new EmployeeImp (1);
System.out.println(e.delete("Aya Sanchez"));
HourlyEmployee h1 = new HourlyEmployee("Yule Josef Ato","Cebu City",23,"Accenture",40, 550.98);
HourlyEmployee h2 = new HourlyEmployee("Linc Josef Ato","Talisay City",28,"Alliance",41, 600.00);
CommissionEmployee c1 = new CommissionEmployee ("Matt Torcende","Butuan City",27,"Systemscore",40000.0f, 550, 0.10f);
e.add(h1);
e.add(c1);
e.displayCountEmployee();
	}
}