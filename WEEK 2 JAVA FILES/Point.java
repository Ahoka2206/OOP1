public class Point{
	private int x;
	private int y;

	public Point(){}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("(" + x + "," + y + ")");
		return sb.toString();
	}

	public boolean equals(Object obj){
		boolean ans = false;
		if(obj instanceof Point){
			Point p = (Point)obj;
			if(this.x==p.x && this.y==p.y)
				ans = true;
		}
		return ans;
	}

	public static void main(String[] args){
		Point p1 = new Point();
		Point p2 = new Point(3,4);
		System.out.println(p1 + " " + p2);
		if(p1.equals(p2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

}

