public class Test{
	public static void main (String [] args){
		Shape vec[] = {new Circle("Circle",3), new Rectangle("Rectangle",4,5), new Square("Square",4), new Circle("Circle",8)};

		for(int index = 0; index < vec.length; index ++){
  		  System.out.println(vec[index]);
	}
}