public class Sample{
	private int x;
	private int y;
	private static int count = 1;

	public Sample (){
		++count;
	}

	public void display(){
		System.out.println(count);
	}

	public static void main (String [] args){
		Sample p1 = new Sample();
		Sample p2 = new Sample();
		Sample p3 = new Sample();
		System.out.println(count);
	}
}