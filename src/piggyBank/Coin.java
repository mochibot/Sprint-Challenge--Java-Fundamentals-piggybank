package piggyBank;

abstract class Coin
{
	private double value;
	private int number;

	public Coin (double value, int number)
	{
		this.value = value;
		this.number = number;
	}

	public abstract void printContent();

	public double getValue()
	{
		return value;
	}

	public int getNumber()
	{
		return number;
	}

	public double getTotal()
	{
		return value * number;
	}
}