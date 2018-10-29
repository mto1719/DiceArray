/**
 * 
 * @author Matthew To
 *
 */
public class DiceArray 
{
public void fillArray(int[] values)
{
	Dice d1 = new Dice();
	Dice d2 = new Dice();
	int [] count = new int[11];
	int roll1 = d1.roll();
	int roll2 = d2.roll();
	int sum = roll1 + roll2;
	for(int i=0; i<1000; i++)
	{
		roll1 = d1.roll();
		roll2 = d2.roll();
		sum = (roll1 + roll2);
	}
	if (sum==2)
	{
		++ values [0];
	}
	if (sum==3)
	{
		++ values [1];
	}
	if (sum==4)
	{
		++ values [2];
	}
	if (sum==5)
	{
		++ values [3];
	}
	if (sum==6)
	{
		++ values [4];
	}
	if (sum==7)
	{
		++ values [5];
	}
	if (sum==8)
	{
		++ values [6];
	}
	if (sum==9)
	{
		++ values [7];
	}
	if (sum==10)
	{
		++ values [8];
	}
	if (sum==11)
	{
		++ values [9];
	}
	if (sum==12)
	{
		++ values [10];
	}
	System.out.println("You rolled " + values[0] + " twos" );
	System.out.println("You rolled " + values[1] + " threes" );
	System.out.println("You rolled " + values[2] + " fours" );
	System.out.println("You rolled " + values[3] + " fives" );
	System.out.println("You rolled " + values[4] + " sixes" );
	System.out.println("You rolled " + values[5] + " sevens" );
	System.out.println("You rolled " + values[6] + " eights" );
	System.out.println("You rolled " + values[7] + " nines" );
	System.out.println("You rolled " + values[8] + " tens" );
	System.out.println("You rolled " + values[9] + " elevens" );
	System.out.println("You rolled " + values[10] + " twelves" );
}
}