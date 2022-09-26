import java.util.*;
public class Array{
	public static void main(String agrs[]){
		int scores[] = new int [10];//array 10  0
		int num[]={1,2,3,4,5};//array 5


		//two dimensional array
		int matrix [][] = new int [2][2];


		int matrix2[][]={{1,2},{3,4}};




		int matrix3[][]={{1,2,3},{4},{5,6,7,8},{9,10}};




		for(int x=0; x < matrix3.length ; x++){
			for(int y=0; y < matrix3[x].length; y++)
				System.out.print(matrix3[x][y]+"\t");
			System.out.println("");
		}

		Scanner sc = new Scanner(System.in);
		//int scores[];
		/*scores = new int[10];
		for(int x=0; x < scores.length  ; x++)
			System.out.println(scores[x]);

		for(int x=0; x < scores.length  ; x++)
			scores[x]=sc.nextInt();

		for(int value: num)
			System.out.println(value);


		for(int x=0; x < num.length  ; x++)
			if( num[x] % 2==0)
				System.out.println(num[x]);
		*/
	}
}