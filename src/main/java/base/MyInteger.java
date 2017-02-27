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
	public static boolean itsEven() 
	{
		return getiValue() % 2 == 0;
	}
	
	public boolean isEven()
	{
		return itsEven();
	}
	
	public static boolean isEven(int iValue) {
		return itsEven();
	}
	
	public static boolean isEven(MyInteger myInt) {
		return itsEven();
	}
	
	//Calculates if given integer is odd
	public static boolean itsOdd()
	{
		return getiValue() % 2 != 0;
	}
	public boolean isOdd()
	{
		return itsOdd();
	}
	
	public static boolean isOdd(int iValue) {
		return itsOdd();
	}
	
	public static boolean isOdd(MyInteger myInt) {
		return itsOdd();
	}

	//Calculates if given integer is prime
	public static boolean itsPrime()
	{
		for (int divisor = 2; divisor <= getiValue() / 2; divisor++) {
			if (getiValue() % divisor == 0) {
				return false; 
			}
		}
		return true;
	}
	
	public boolean isPrime()
	{
		return itsPrime();
	}
	
	public static boolean isPrime(int iValue) {
		return itsPrime();
	}
	
	public static boolean isPrime(MyInteger myInt) {
		return itsPrime();
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
	


