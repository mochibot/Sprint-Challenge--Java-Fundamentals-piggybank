package piggyBank;

class Nickel extends Coin
{
	public Nickel ()
	{
		super(0.05, 1);
	}

	public Nickel (int number)    
	{
		super(0.05, number);
	}

	public void printContent()
	{
		String unit = this.getNumber() > 1 ? " Nickels" : " Nickel";
		System.out.println(this.getNumber() + unit);
	}
}