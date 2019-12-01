package piggyBank;

class Dollar extends Coin
{
	public Dollar ()
	{
		super(1.00, 1);
	}

	public Dollar (int number)    
	{
		super(1.00, number);
	}

	public void printContent()
	{
		System.out.println("$" + this.getNumber());
	}
}