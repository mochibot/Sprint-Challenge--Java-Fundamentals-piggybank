package piggyBank;

class Penny extends Coin
{
	public Penny ()
	{
		super(0.01, 1);
	}

	public Penny (int number)    
	{
		super(0.01, number);
	}

	public void printContent()
	{
		String unit = this.getNumber() > 1 ? " Pennies" : " Penny";
		System.out.println(this.getNumber() + unit);
	}
}