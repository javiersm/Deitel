package Tema7;

public class DeckOfCardsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); // place Cards in random order
		

		for ( int i = 1; i <= 52; i++ )
		{
		// deal and display a Card
		System.out.printf( "%-19s", myDeckOfCards.dealCard() );
		if ( i % 4 == 0 ) // output a newline after every fourth card
		System.out.println();
		} // end for
		
		
	}

}
