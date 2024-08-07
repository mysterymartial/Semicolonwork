public class Menstrationapp{

	public int [] hostDate( int month, int day, int year){ 
		int [] daysOfMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int []monthOfTheEntry = new int[2];
		final int myArrayLength = daysOfMonth.length;
	
			int firstMonthSize = daysOfMonth[month];
			monthOfTheEntry[0] = firstMonthSize;
			int secondMonthSize = daysOfMonth[month + 1];
			monthOfTheEntry[1] = secondMonthSize;

			return monthOfTheEntry;

}
 	public int [] calendar(int [] daysOfTwoMonth){
		int number = 1;
		int sum = daysOfTwoMonth[0] + daysOfTwoMonth[1];
		int [] totalDays = new int [sum];
		for(int counter =0; counter < totalDays.length; counter++){
			if(counter != daysOfTwoMonth[0]){
		
				totalDays[counter] = number;
				number++;
		}else{
			number = 1;
			
				totalDays[counter] = number;
					number++;
		}

		}
	return totalDays;

}

}			