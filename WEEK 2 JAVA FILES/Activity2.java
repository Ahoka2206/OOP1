public class Activity2 {
	public static void create(int array[], int n){
		array = new int[n];
		for(int i = 0; i < n; i++){
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args){
		int array[] = null;
		create(array, 5);

		//int numbers[] = null;
		//create(numbers, 10);
	}
}