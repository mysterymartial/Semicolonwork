import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultiplicationTest{

	@Test
	public void calculatorThatCanMultiplyWithoutTheOperator(){

		//given
		Multiplication calculator= new Multiplication();

		//when
		int multiplicationOutput= calculator.computer(2,3);

		//assert
		assertEquals(6, multiplicationOutput);
		


	



}

	
	@Test
	public void calculatorThatCanMutiplyOneNegativeAndOnePostiveNumber(){

		//given
		Multiplication calculator= new Multiplication();
		//when
		int multiplicationOutput= calculator.computer(2,-3);

		//assert
		assertEquals(-6, multiplicationOutput);





}


}












