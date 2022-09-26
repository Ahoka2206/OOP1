import java.util.Scanner;

public class Activity {
	public static void main(String[] args){
		int array [];
		int n;
		int sum = 0;
		float average = 0;

		Scanner input = new Scanner(System.in);
		//System.out.print("How many numbers to input: ");
		n  = input.nextInt();

		array = new int[n];

		for(int i = 0; i < n; i++){
			array[i] = input.nextInt();
		}

		for(int i = 0; i < n; i++){
			sum += array[i];
		}

		average = (float) sum/ n;
		System.out.println("Sum is: "+ sum);
		System.out.printf("Average is: %.2f\n\n", average);
		
		input.close();
	}
}

