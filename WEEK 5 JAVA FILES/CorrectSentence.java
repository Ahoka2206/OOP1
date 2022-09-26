import java.util.*;

public class CorrectSentence{
	private String sentence;

	public CorrectSentence(){}

	public String correctS(String sentence){
		StringBuffer sb1 = new StringBuffer(sentence);

		for(int i = 0; i < sb1.length() - 1; i++){
			if((sb1.charAt(i) == '.' || sb1.charAt(i) == '?' ||  sb1.charAt(i) == '!' || sb1.charAt(i) == '-') && sb1.charAt(i + 1) == ' ') {
				if(sb1.charAt(sb1.length() - 1) == ' ')
					sb1.setLength(sb1.length() - 1);
					sb1.setCharAt(i + 2, Character.toUpperCase(sb1.charAt(i + 2)) );
				}

			if((sb1.charAt(i) == '.' || sb1.charAt(i) == '?' ||  sb1.charAt(i) == '!' || sb1.charAt(i) == '-') && sb1.charAt(i + 1) != ' '){
				if(sb1.charAt(sb1.length() - 1) == ' ')
					sb1.setLength(sb1.length()-1);
					sb1.setCharAt(i + 1, Character.toUpperCase(sb1.charAt(i + 1)) );
				}
			sb1.setCharAt(0, Character.toUpperCase(sb1.charAt(0)) );
		}
		String result = sb1.toString();
   		return result;
	}

    public static void main(String[] args){
		CorrectSentence s = new CorrectSentence();
		String sentence;

		Scanner input = new Scanner(System.in);
		sentence = input.nextLine();
		System.out.println(s.correctS(sentence));

    }

}