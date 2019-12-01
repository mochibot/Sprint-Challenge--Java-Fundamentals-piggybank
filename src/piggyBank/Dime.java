package piggyBank;

class Dime extends Coin
{
	public Dime ()
	{
		super(0.1, 1);
	}

	//Java Does not support default parameters
	public Dime (int number)    
	{
		super(0.1, number);
	}

	public void printContent()
	{
		String unit = this.getNumber() > 1 ? " Dimes" : " Dime";
		System.out.println(this.getNumber() + unit);
	}
}