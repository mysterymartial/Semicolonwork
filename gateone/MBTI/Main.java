import java.util.Scanner;
public class Main{

	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	System.out.println("what is your name");
	String name = sc.next();
	System.out.printf("Welcome  %s to my maya bricks test ", name);
	Mbti quiz = new Mbti();
	 String [] question = quiz.questions();
	for(String move : question){
		String response = sc.nextLine();
		System.out.println(move);
}

}

}

		
	
	

	