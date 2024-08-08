public class Mbti{

	public String [] questions(){

		String [] questions = {"1: (A) expand energy, enjoy groups : (B)conserve energy,enjoy one on one", "2: (A) interpret Literally : (B) Look for meaning and possibilites", "3: (A) logical, thinking, questioning : (B) empathetic, feeling, accomodating", "4: (A) organized,orderly : (B) flexible, adaptable", "5: (A) more outgoing,think out loud : (B) more reserved, think to yourself", "6: pratical, realistic, experiential : (B) imaginative, innovative, theoretical", "7: (A) candid, straight forward, frank : (B) tactful, kind, encouraging", "8: (A) plan, schedule : (B) unplanned, spontaneous", "9: (A) seek many tasks, public activities, interaction with others : (B) seek private, solitary activities with queit to concentrate", "10: (A) standard, usaual,conventional : (B) different, novel, unique", "11: (A) firm, tend to criticize, hold the line : (B) gentle, tend to appereciate, conciliate", "12: regulated, structured : (B) easygoing, live and let live", "13: (A) external, communicative, express yourself : (B) internal, reticent, keep to yourself", "14: (A) focus on here-and-now :(B) look to the future, global perspective,(big picture)", "15: (A) tough-minded,just : (B) tendered-hearred,merciful", "16: (A) preparation, plan aheaed : (B) go with the flow, adapt as you go", "17: (A) active, initiate : (B) reflective, delibrate", "18: (A) facts,things, (what is) : (B) ideas, dreams,(what could be, philosophical)", "19: (A) matter of fact, issue-oriented : (B) sensitive, people-oriented,compassionate", "20: (A) control, govern : (B) latitude, freedom"};

	return questions;

}

	public String [] reponses(String [] reponse){
		String [] answers = new String[reponse.length];

		return answers;

}

	public String getFirstResponse( String [] reponses){
		int counterA = 0;
		int counterB = 0;
		String first = reponses[0];
		String second = reponses[4];
		String third = reponses[8];
		String fourth = reponses[12];
		String fifth = reponses[16];
		String [] newResponses = { first, second, third, fourth, fifth};
		for(int counter = 0; counter < newResponses.length; counter++){
			if(newResponses[counter] == "A"){
				counterA++;
			}else{
	  
				counterB++;
	
		}
		}


		if(counterA > counterB){
			return "E";

		

		}else{
			return "I";
		

	
			

}

}



	public String getSecondResponse( String [] reponses){
		int counterA = 0;
		int counterB = 0;
		String first = reponses[1];
		String second = reponses[5];
		String third = reponses[9];
		String fourth = reponses[13];
		String fifth = reponses[17];
		String [] newResponses = { first, second, third, fourth, fifth};
		for(int counter = 0; counter < newResponses.length; counter++){
			if(newResponses[counter] == "A"){
				counterA++;
			}else{
	  
				counterB++;
	
		}
		}


		if(counterA > counterB){
			return "S";

		

		}else{
			return "N";
		

	
			

}

}

	
	public String getThirdResponse( String [] reponses){
		int counterA = 0;
		int counterB = 0;
		String first = reponses[2];
		String second = reponses[6];
		String third = reponses[10];
		String fourth = reponses[14];
		String fifth = reponses[18];
		String [] newResponses = { first, second, third, fourth, fifth};
		for(int counter = 0; counter < newResponses.length; counter++){
			if(newResponses[counter] == "A"){
				counterA++;
			}else{
	  
				counterB++;
	
		}
		}


		if(counterA > counterB){
			return "T";

		

		}else{
			return "F";
		

	
			

}

}




	public String getFourthResponse( String [] reponses){
		int counterA = 0;
		int counterB = 0;
		String first = reponses[3];
		String second = reponses[7];
		String third = reponses[11];
		String fourth = reponses[15];
		String fifth = reponses[19];
		String [] newResponses = { first, second, third, fourth, fifth};
		for(int counter = 0; counter < newResponses.length; counter++){
			if(newResponses[counter] == "A"){
				counterA++;
			}else{
	  
				counterB++;
	
		}
		}


		if(counterA > counterB){
			return "J";

		

		}else{
			return "P";
		

	
			

}

}



}