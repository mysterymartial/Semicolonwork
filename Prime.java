import java.util.Scanner;
public class Prime{
	public static void main(String[]args){
		
		int number;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number of your choice");
		number= sc.nextInt();

	if(number % 2==1)

		System.out.printf(" This number %d is a prime number", number);

	else
		System.out.printf(" This number %d is not a prime number", number);

}

}