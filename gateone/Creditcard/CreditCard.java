public class CreditCard{

	public static int firstStep(String cardNumbers){
		int total =0;
		int result = 0;
		String sum = "";
		for(int count =cardNumbers.length()-2; count >= 0; count -=2){
			int numbers = Integer.parseInt(String.valueOf(cardNumbers.charAt(count)));
			result = (numbers *2);
			if(numbers >= 10){
				int firstDigit = numbers % 10;
				int secondDigit = numbers / 10;
				result = firstDigit + secondDigit;

	
				 
				total += result;
				
			}



	}		return total;

	}

	}			
				
				
			
		