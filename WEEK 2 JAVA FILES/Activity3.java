public class Activity3 {
	public static void unique(int array[], int input[]){
		int index = 0;
		int flag;
		  for(int i = 0; i < input.length; i++){
		  	flag = 0;
			  for(int j = 0; j < array.length; j++){
				  if(input[i] == array[j]){
					  flag = 1;
					  break;
				  }
			   }
		       if(flag != 1){
		           array[index] = input[i];
		            index++;
		       }
		  }

		  for(int s = 0; s < array.length; s++){
		     System.out.println(array[s]);
		  }
    }

	public static void main(String[] args){
		int array[] = new int[5];
		int input[] ={1, 2, 3, 1 , 2, 3 , 6, 7};
		unique(array, input);

		//int array[] = new int[5];
		//int input[] ={1, 2, 3, 1 , 2, 3 , 1, 2};
		//unique(array, input);
	}

}