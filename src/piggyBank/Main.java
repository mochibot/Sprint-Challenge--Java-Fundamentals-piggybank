package piggyBank;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Coin> piggyBank = new ArrayList<>();
		piggyBank.add(new Quarter());
		piggyBank.add(new Dime());
		piggyBank.add(new Dollar(5));
		piggyBank.add(new Nickel(3));
		piggyBank.add(new Dime(7));
		piggyBank.add(new Dollar());
		piggyBank.add(new Penny(10));

		piggyBank.forEach(coin -> coin.printContent());

		double total = 0;
		for (int i = 0; i < piggyBank.size(); i++)
		{
			total += piggyBank.get(i).getTotal();
		}
		DecimalFormat fp = new DecimalFormat("$###,###.00");
		System.out.println("The piggy bank holds " + fp.format(total));
	}
}