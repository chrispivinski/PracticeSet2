package base;
///Chris Pivinski

///Thanks for the letting me resubmit.  I really appreciate it.

public class MyInteger {	
	private static int iValue;
	
	public MyInteger(int iValue) {
		super();
		MyInteger.iValue = iValue;
	}

	public static int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		MyInteger.iValue = iValue;
	}
	
	//Calculates if given integer is even
	public static boolean isEven()
	{
		return getiValue() % 2 == 0;
	}
	
	public static boolean isEven(int iValue) {
		return isEven();
	}
	
	public static boolean isEven(MyInteger myInt) {
		return isEven();
	}
	
	//Calculates if given integer is odd
	public static boolean isOdd()
	{
		return getiValue() % 2 != 0;
	}
	
	public static boolean isOdd(int iValue) {
		return isOdd();
	}
	
	public static boolean isOdd(MyInteger myInt) {
		return isOdd();
	}
	//Calculates if given integer is prime
	public static boolean isPrime()
	{
		for (int divisor = 2; divisor <= getiValue() / 2; divisor++) {
			if (getiValue() % divisor == 0) {
				return false; 
			}
		}
		return true;
	}
	
	public static boolean isPrime(int iValue) {
		return isPrime();
	}
	
	public static boolean isPrime(MyInteger myInt) {
		return isPrime();
	}
	
	public boolean equals(int iValue, int iValues) {
		if (iValue == iValues) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean equals(MyInteger myInt, MyInteger iValues) {
		if (myInt == iValues) {
			return true;
		}
		else {
			return false;
		}
	}
}
	


