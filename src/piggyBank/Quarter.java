package piggyBank;

class Quarter extends Coin
{
	public Quarter ()
	{
		super(0.25, 1);
	}

	public Quarter (int number)    
	{
		super(0.25, number);
	}

	public void printContent()
	{
		String unit = this.getNumber() > 1 ? " Quarters" : " Quarter";
		System.out.println(this.getNumber() + unit);
	}
}