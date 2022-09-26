public class Test{
	public static void main (String [] args){
		Set s1 = new Set();
		Set s2 = new Set();
		Set intersection = null;
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s2.add(10);
		s2.add(2);
		s2.add(20);
		//intersection = s1.intersection(s2);
		//intersection.display();
		System.out.println(s1.isDisjoint(s2));
	}
}