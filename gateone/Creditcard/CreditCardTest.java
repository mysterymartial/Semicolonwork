import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CreditCardTest{ 

	@Test
	public void checkFirstAlogorithm(){
	CreditCard card = new CreditCard();
	int result = card.firstStep("4388576018402626");
	assertEquals(37, result);

}

	
	//@Test
	//public void checkSecondAlgorithm(){
	//CreditCard card = new CreditCard();
	//int result = card.secondStep(6,6,0,8,0,7,8,3);
	//assertEquals(38,result);
//}


	//@Test
	//public void checkthridAlgorithm(){
	//CreditCard card = new CreditCard();
	//int result = card.thirdstep(37,35);
	//assertEquals(75,result);
//}
	
}	