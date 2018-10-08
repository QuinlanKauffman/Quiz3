package pkgCore;

import org.junit.Test;
import pkgEnum.*;

public class Quiz3Test {

	@Test
	public void test1()
	{
		Deck d = new Deck();
		d.DrawSpecific(eSuit.CLUBS, eRank.TWO);
		System.out.println(d.getRemaining(eSuit.CLUBS));
		System.out.println(d.getRemaining(eRank.TWO));
	}
	
	
	@Test
	public void test2()
	{
		Deck d = new Deck();
		d.DrawSpecific(eSuit.CLUBS, eRank.TWO);
		System.out.println(d.getRemaining(eSuit.CLUBS));
	}
}
