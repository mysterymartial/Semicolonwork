//we doing a unit test using a method
//note this can also serve as doucmentation so make your varriable name self explanatory
//@Test is an annotation
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class Calculatortest{
	@Test 
	public void TheCalculatorCanAddTwoPostiveNumbers(){

		//given: the requirement needed to use the functinality,input
			Calculator calc= new Calculator();
		//when: this talk about the method we test for, processing,
			int result= calc.add(2,3);
		//assert or check: the result,output
			assertEquals(5,result);

	// to run use thisjavac -cp "junit-platform-console-standalone-1.10.2.jar" Calculatortest.java Calculator.java//



}

	@Test
	public void TheCalculatorCanSAddTwoNegativeNumbers(){
	//given
		Calculator calc= new Calculator();
	//when
		int result= calc.add(-2,-3);
	//assert
		assertEquals(-5,result);

}



	@Test
	public void TheCalculatorCanSubtractTwoPostiveNumbers(){

	//given
		Calculator calc= new Calculator();
	//when
		int result= calc.subtract(2-3);
	//assert
		assertEquals(1,result);

}


	@Test
	public void TheCalculatorCanSubtractTwoNegativeNumbers(){

	//given
		Calculator calc= new Calculator();
	//when
		int result= calc.subtract(-2,-3);
	//assert
		assertEquals(5,result);

}


	@Test
	public void TheCalculatorCanDivideTwoPostiveNumbers(){
	
	//given
		Calculator calc= new Calculator();
	
	//when
		int result= calc.divide(4/2);

	//assert
		assertEquals(2,result);

}


	@Test
	public void TheCalculatorCanMultiplyTwoPostiveNumbers(){

	//given
		Calculator calc= new Calculator();

	//when
		int result= calc.Multiply(2*2);

	//assert
		assertEquals(4,result);

}

	@Test
	public void TheCalculatorCanDivideANumberByZero(){
	
	//given

		Calculator calc= new Calculator();

	//assert
		//assertThrows(ArithemeticException:Class,()->calc.divide(4,0));

}
				





 






 


}