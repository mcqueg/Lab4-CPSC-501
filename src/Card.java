import java.util.Random;

//********************************************************************
//Garrett McCue 	
//
//7/27/20
//
//CPSC-501-Lab4Ex3
//**********************************************************************
public class Card {
	
	// 0=ace, 1=jack, 2-10=2-10, 11=queen, 12=king
	private int rank;

	// 0=clubs, 1=diamonds, 2=hearts, 3=spades
	private int suit;

	// -----------------------------------------------------------------
	// prints out 5 random cards from a deck of playing
	// cards... duplicates are allowed
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {

			System.out.println("Card " + Integer.toString(i + 1) + ": " + new Card());

		}

	}

	// constructor to generate a random card draw
	// rank: 0-12
	// suit : 0-3
	private Card() {
		Random gen = new Random();

		this.rank = gen.nextInt(13);

		this.suit = gen.nextInt(4);

	}

	// converting rank and suit into the string representation
	// of each int for easier readability.

	public String toString() {
		String cardDraw = "";

		switch (this.rank) {
		case 0:
			cardDraw += "Ace";
			break;
		case 1:
			cardDraw += "Jack";
			break;
		case 11:
			cardDraw += "Queen";
			break;
		case 12:
			cardDraw += "King";
			break;
		default:
			cardDraw += Integer.toString(this.rank);
			break;

		}

		switch (this.suit) {
		case 0:
			cardDraw += " of Clubs";
			break;
		case 1:
			cardDraw += " of Diamonds";
			break;
		case 2:
			cardDraw += " of Hearts";
			break;
		default:
			cardDraw += " of Spades";
			break;
		}

		return cardDraw;

	}
}
