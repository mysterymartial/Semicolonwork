public class Senderapp{

  

	public static int sender(int amount){
	
	int userinput=0;
		int pay= amount*500;

		 pay+=5000;		
		int pay1= amount*250;
		
		 pay1+=5000;
			
	        int pay2= amount*200;
		 pay2+=5000;
		int pay3= amount*160;
		pay3+=5000;

	

  

		if(amount>=70){

			return pay;
			
	} 




		else if(amount>=69 && amount<=60){
	
			return pay1;

	}



		else if(amount>=50 ){
			return pay2;

	}


		else {
			
			return pay3;
			
	}





}



}


	





















			













	




















