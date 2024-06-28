import java.util.Scanner;
public class Score{

	public static void main(String[]args){

		int number1;
		int number2;
		int number3;
                int number4;
                int number5;
		int number6;
		int number7;
		int number8;
		int number9;
		int number10;
		
												
		int sum;
		int average;

		Scanner sc= new Scanner(System.in);


			System.out.println("ENTER SCORE 1");

				number1= sc.nextInt();

			System.out.println("ENTER SCORE 2");
				number2= sc.nextInt();


			System.out.println("ENTER SCORE 3");
				number3= sc.nextInt();

			System.out.println("ENTER SCORE 4");
				number4= sc.nextInt();

			System.out.println("ENTER SCORE 5");
				number5= sc.nextInt();

			System.out.println("ENTER SCORE 6");
				number6= sc.nextInt();

			System.out.println("ENTER SCORE 7");

				number7= sc.nextInt();

			System.out.println("ENTER SCORE 8");

				number8= sc.nextInt();

			System.out.println("ENTER SCORE 9");

				number9= sc.nextInt();

			System.out.println("ENTER SCORE 10");

				number10= sc.nextInt();


			sum= number1+number2+number3+number4+number5+number6+number7+number8+number9+number10;

			average= sum/10;

			System.out.println("THE SUM OF THE NUMBER IS " + sum);


			System.out.println("THE AVERAGE OF THE NUMBER IS " + average);



			}
					

			}

			