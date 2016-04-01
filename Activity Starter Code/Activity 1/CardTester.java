/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card a = new Card("Jack", "Spades", 10 );
		Card b = new Card("Four", "Hearts", 4 );
		Card c = new Card("ace", "Clubs", 10 );
		
		a.suit();
		a.rank();
		a.pointValue();
		a.matches(b);
		a.toString();
		
		b.suit();
		b.rank();
		b.pointValue();
		b.matches(c);
		b.toString();
		
		c.suit();
		c.rank();
		c.pointValue();
		c.matches(a);
		c.toString();
	}
}
