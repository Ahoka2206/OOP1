public class Test{
	public static void main (String [] args) {
		CommissionEmployee c = new CommissionEmployee ("Yule Josef Ato","Cebu City",23,"Accenture",40000.0f, 550, 0.10f);
		CommissionEmployee c2 = new CommissionEmployee ("Yule Josef Ato","Cebu City",23,"Accenture",40000.0f, 550, 0.10f);
		c.display();
		System.out.println(c.equals(c2));
	}
}