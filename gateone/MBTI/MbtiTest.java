import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class MbtiTest{

	@Test
	public void checkForE(){
	Mbti quiz = new Mbti();
	String [] sample = {"A","B","B","A","A","A","A","B","A","B","B","B","A","A","B","A","B","A","A","A"};
	String feedback = quiz.getFirstResponse(sample);
	assertEquals("E", feedback);

}

	@Test
	public void checkForI(){
	Mbti quiz = new Mbti();
	String [] sample = {"B","B","B","A","B","A","A","B","B","B","B","B","B","A","B","A","B","A","A","A",};
	String feedback = quiz.getFirstResponse(sample);
	assertEquals("I", feedback);
 }

	@Test
	public void checkForS(){
	Mbti quiz = new Mbti();
	String [] sample = {"B","A","B","A","B","A","A","B","B","A","B","B","B","A","B","A","B","A","A","A",};
	String feedback = quiz.getSecondResponse(sample);
	assertEquals("S", feedback);
}

	@Test
	public void checkForN(){
	Mbti quiz = new Mbti();
	String [] sample = {"B","B","B","A","B","B","A","B","B","B","B","B","B","B","B","A","B","A","A","A",};
	String feedback = quiz.getSecondResponse(sample);
	assertEquals("N", feedback);
}

	@Test
	public void checkForT(){
	Mbti quiz = new Mbti();
	String [] sample = {"B","B","A","A","B","B","A","B","B","B","A","B","B","B","A","A","B","A","A","A",};
	String feedback = quiz.getThirdResponse(sample);
	assertEquals("T", feedback);
}

	@Test
	public void checkForF(){
	Mbti quiz = new Mbti();
	String [] sample = {"B","B","B","A","B","B","B","B","B","B","B","B","B","B","B","A","B","A","A","A",};
	String feedback = quiz.getThirdResponse(sample);
	assertEquals("F", feedback);

}

	@Test
	public void checkForJ(){
	Mbti quiz = new Mbti();
	String [] sample = {"B","B","B","A","B","B","A","A","B","B","B","A","B","B","B","A","B","A","A","A",};
	String feedback = quiz.getFourthResponse(sample);
	assertEquals("J", feedback);
}

	@Test
	public void checkForP(){
	Mbti quiz = new Mbti();
	String [] sample = {"B","B","B","B","B","B","A","B","B","B","B","B","B","B","B","B","B","A","A","A",};
	String feedback = quiz.getFourthResponse(sample);
	assertEquals("P", feedback);
}




	
	

	

}