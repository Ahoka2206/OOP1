import java.util.*;

public class Cylindere {
	//ENCAPSULATION
	private int x;
	private int y;
	private float radius;
	private float height;

	public Cylindere(){}//DEFAULT CONSTRUCTOR

	public Cylindere(int x1, int y1, int radius1, float height){//CONSTRUCTOR
		this.x = x1;
		this.y = y1;
		this.radius = radius1;
		this.height = height;
	}

	//SETTER
		public void setX(int x){
			this.x = x;
		}

		public void setY(int y){
			this.y = y;
		}

		public void setRadius( int radius){
			this.radius = radius;
		}

		public void setHeight(float height){ //SETTER
			this.height = height;
		}

	//GETTER
		public int getX(){
			return x;
		}

		public int getY(){
			return y;
		}

		public float getRadius(){
			return radius;
		}

		public float getHeight(){ //GETTER
			return height;
		}

		public float getAreaCircle(){
				return  (float) ( Math.PI * radius * radius );
			}

			public float getAreaCylinder(){
				return (float) ( ( 2 * Math.PI * getRadius() ) * ( getRadius() + getHeight() ) );
			}

			public float getVolume(){
				return getAreaCircle() * getHeight();
		}

	public String toString(){ //OVERRIDING
		//StringBuffer sb = new StringBuffer();
		String str = String.format("%.02f", getRadius());
		String str2 = String.format("%.02f", getHeight());
		//sb.append("The center of the circle is: (" + this.getX() + "," + this.getY() + ")\nWith a radius of: " + /*this.getRadius()*/ str + " unit \nThe height of the cylinder: " + /*this.getHeight()*/ str2 + " unit\n" );
		//return sb.toString();
		return "The center of the circle is: (" + this.getX() + "," + this.getY() + ")\nWith a radius of: " + /*this.getRadius()*/ str + " unit \nThe height of the cylinder: " + /*this.getHeight()*/ str2 + " unit\n";
	}

	public boolean equals(Object obj){ //OVERRIDING
		boolean ans = false;
		if(obj instanceof Cylindere){
			Cylindere p = (Cylindere) obj;
			if(this.getX() == p.getX() && this.getY() == p.getY() && this.getRadius() == p.getRadius() && this.getHeight() == p.getHeight())
				ans = true;
			}
		return ans;
	}

	public static void main(String[] args){
			//SAMPLE READY
			System.out.print("\nABUEVA_ITEM #2:\n");
			Cylindere c1 = new Cylindere(1, 2, 3, 7);
			float areaCylinder1 = c1.getAreaCylinder();
			float volume1 = c1.getVolume();

			Cylindere c2 = new Cylindere(4, 5, 6, 8);
			float areaCylinder2 = c2.getAreaCylinder();
			float volume2 = c2.getVolume();


			System.out.println("\nFIRST CYLINDER: ");
			System.out.print(c1);
			System.out.printf("\nArea of the Cylinder: %.2f square unit.", areaCylinder1);
			System.out.printf("\nCylinder Volume: %.2f cubic unit.\n\n", volume1);

			System.out.println("SECOND CYLINDER: ");
			System.out.print(c2);
			System.out.printf("\nArea of the Cylinder: %.2f square unit." , areaCylinder2);
			System.out.printf("\nCylinder Volume: %.2f cubic unit.\n", volume2);

			if(c1.equals(c2))
				System.out.println("\nThe two Cylinders are EQUAL\n");
			else
				System.out.println("\nThe two Cylinders are NOT EQUAL\n");
	}
}

