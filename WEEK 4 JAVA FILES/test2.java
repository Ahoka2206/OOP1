class test2{
	private int x;
	private int y;

	public test2(){}
	public test2(int x, int y){
		this.x = x;
		this.y = y;
	}

	public static void main(String args[]){
		test2 p1 = new test2(1, 2);
		test2 p2 = new test2(1, 2);
		System.out.println(p1.equals(p2));
	}
}