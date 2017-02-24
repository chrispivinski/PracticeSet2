package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	
		
		MyInteger val1 = new MyInteger(6);
		boolean bExpectedisEven = true;
		boolean bExpectedisOdd = false;
		boolean bExpectedisPrime = false;
		
		
		MyInteger val2 = new MyInteger(7);
		boolean bExpectedisEven1 = false;
		boolean bExpectedisOdd1 = true;
		boolean bExpectedisPrime1 = true;
		
		
		MyInteger val3 = new MyInteger(84648221);
		boolean bExpectedisEven2 = false;
		boolean bExpectedisOdd2 = true;
		boolean bExpectedisPrime2 = false;	//turns out this random large number I mashed
										  	//in is divisible by 7, 347, 34849, 12092603...
		
		int sampleInteger = 54;
		MyInteger example = new MyInteger(sampleInteger);
		example.setiValue(sampleInteger);
		
		
		equals(val1.equals(val1));
		equals(val2.equals(val2));
		equals(val3.equals(val3));
	
		
		assertEquals(val1.isEven(), bExpectedisEven);
		assertEquals(val2.isEven(), bExpectedisEven1);
		assertEquals(val3.isEven(), bExpectedisEven2);

		
		assertEquals(val1.isOdd(), bExpectedisOdd);
		assertEquals(val2.isOdd(), bExpectedisOdd1);
		assertEquals(val3.isOdd(), bExpectedisOdd2);

		
		assertEquals(val1.isPrime(), bExpectedisPrime);
		assertEquals(val2.isPrime(), bExpectedisPrime1);
		assertEquals(val3.isPrime(), bExpectedisPrime2);


		
	}

}
