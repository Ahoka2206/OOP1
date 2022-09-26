public class Line{
	private Point beg;
	private Point end;

	public Line(){}

	public Line(Point beg, Point end){
		this.beg = beg;
		this.end = end;
	}

	public void setBeg(Point beg){
		this.beg = beg;
	}

	public void setEnd(Point end){
		this.end = end;
	}

	public Point getBeg(){
		return beg;
	}

	public Point getEnd(){
		return end;
	}

	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append(beg.toString());
		sb.append(end.toString());
		sb.append("]");
		return sb.toString();
	}

	public boolean equals(Object obj){
		boolean ans = false;
		if(obj instanceof Line){
			Line l = (Line)obj;
			if(this.beg.equals(l.beg) && this.end.equals(l.end))
				ans = true;
		}
		return ans;
	}

	public static void main(String[] args){
		Line l1 = new Line(new Point(), new Point());
		Line l2 = new Line(new Point(2,3), new Point());
		System.out.println(l1);
		System.out.println(l2);
		if(l1.equals(l2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}