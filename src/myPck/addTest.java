package myPck;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class addTest {

	/*@Test
	public void Addtest() {
	myClass junit= new myClass();
		int result= junit.add(100,200);
		assertEquals(300,result);
	}*/
	
	
	@Test
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() {
	// Arrange
	int x = 50;
	int y = 40;
	myClass calculator = new myClass();
	// Act
	int result = calculator.add(x, y);
	// Assert
	Assert.assertTrue(result > 0);
	}

	
	@Test
	public void testSum_BothNumbersAreNegative_ShouldReturnNegativeNumber() {
	// Arrange
	int x = -50;
	int y = -40;
	myClass calculator = new myClass();
	// Act
	int result = calculator.add(x, y);
	// Assert
	Assert.assertTrue(result < 0);
	}
	
	
	@Test
	public void testSum_NegativeIsGreater_ShouldReturnNegativeNumber() {
	// Arrange
	int x = -50;
	int y = 40;
	myClass calculator = new myClass();
	// Act
	int result = calculator.add(x, y);
	// Assert
	if(x>y) {
	Assert.assertTrue(result < 0);
	}
	}
	
	@Test
	public void testSum_PositiveIsGreater_ShouldReturnPositiveNumber() {
	// Arrange
	int x = 50;
	int y = -40;
	myClass calculator = new myClass();
	// Act
	int result = calculator.add(x, y);
	// Assert
	if(x>y) {
	Assert.assertTrue(result > 0);
	}
	}
	
	@Test
	public void testSum_SameValueDifferentSigns_ShouldReturnZero() {
	// Arrange
	int x = 50;
	int y = -50;
	myClass calculator = new myClass();
	// Act
	int result = calculator.add(x, y);
	// Assert
	
	Assert.assertEquals(result ,0);
	
	}
	
}
