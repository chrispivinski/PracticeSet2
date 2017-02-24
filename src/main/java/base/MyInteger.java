package base;
///Chris Pivinski

///Thanks for the help Professor Gibbons, copy and pasting the project into a different
///workspace immediately fixed that bizarre error I was getting

public class MyInteger {

	
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	//Calculates if given integer is even
	public boolean isEven()
	{
		return getiValue() % 2 == 0;
	}
	
	//Calculates if given integer is odd
	public boolean isOdd()
	{
		return getiValue() % 2 != 0;
	}
	//Calculates if given integer is prime
	public boolean isPrime()
	{
		for (int divisor = 2; divisor <= getiValue() / 2; divisor++) {
			if (getiValue() % divisor == 0) {
				return false; 
			}
		}
		return true;
	}

}
