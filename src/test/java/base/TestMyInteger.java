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
		example.equals(sampleInteger, 544);
		example.equals(sampleInteger, 54);
		
		assertEquals(val1.isOdd(), false);
		assertEquals(val1.isEven(), true);
		assertEquals(val1.isPrime(), false);

		MyInteger.isOdd(sampleInteger);
		MyInteger.isPrime(sampleInteger);
		MyInteger.isEven(sampleInteger);
		
		MyInteger.equals(val2, val3);
		MyInteger.equals(val3, val3);
		
		MyInteger myInt = new MyInteger(6);
		boolean b = MyInteger.isPrime(myInt);
		boolean c = MyInteger.isOdd(myInt);
		boolean d = MyInteger.isEven(myInt);
		
		
		assertEquals(MyInteger.isEven(myInt), bExpectedisEven);
		assertEquals(MyInteger.isOdd(myInt), bExpectedisOdd);
		assertEquals(MyInteger.isPrime(myInt), bExpectedisPrime);

		assertEquals(b, false);
		assertEquals(c, false);
		assertEquals(d, true); 
		
		MyInteger myInt1 = new MyInteger(5);
		boolean e = MyInteger.isPrime(myInt1);
		boolean f = MyInteger.isOdd(myInt1);
		boolean g = MyInteger.isEven(myInt1);
		
		assertEquals(MyInteger.isEven(myInt1), bExpectedisEven1);
		assertEquals(MyInteger.isOdd(myInt1), bExpectedisOdd1);
		assertEquals(MyInteger.isPrime(myInt1), bExpectedisPrime1);
		
		assertEquals(e, true);
		assertEquals(f, true);
		assertEquals(g, false);
		
		MyInteger myInt2 = new MyInteger(84648221);
		boolean h = MyInteger.isPrime(myInt2);
		boolean i = MyInteger.isOdd(myInt2);
		boolean j = MyInteger.isEven(myInt2);
		
		assertEquals(MyInteger.isEven(myInt2), bExpectedisEven2);
		assertEquals(MyInteger.isOdd(myInt2), bExpectedisOdd2);
		assertEquals(MyInteger.isPrime(myInt2), bExpectedisPrime2);
	
		assertEquals(h, false);
		assertEquals(i, true);
		assertEquals(j, false);


		
	}

}
