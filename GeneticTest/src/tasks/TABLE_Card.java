package tasks;

import java.util.ArrayList;

import constants.Constants_Cards;

public class TABLE_Card {
	
	private static ArrayList<BASE_Card> deck = new ArrayList<BASE_Card>();
	private static final int suits = Constants_Cards.numberOfSuits;
	private static final int values = Constants_Cards.numberOfCardsPerSuit ;
	private static final String suit1 = Constants_Cards.suit1;
	private static final String suit2 = Constants_Cards.suit2;
	private static final String suit3 = Constants_Cards.suit3;
	private static final String suit4 = Constants_Cards.suit4;
	private static boolean isInit = false; 
	
	public static BASE_Card Lookup(int ID){
		if(isInit == false){
			deck.add(0, new BASE_Card(0, "Ace Of "  + suit1));
			deck.add(1, new BASE_Card(1, "2 Of " + suit1));
			deck.add(2, new BASE_Card(2, "3 Of " + suit1));
			deck.add(3, new BASE_Card(3, "4 Of " + suit1));
			deck.add(4, new BASE_Card(4, "5 Of " + suit1));
			deck.add(5, new BASE_Card(5, "6 Of " + suit1));
			deck.add(6, new BASE_Card(6, "7 Of " + suit1));
			deck.add(7, new BASE_Card(7, "8 Of " + suit1));
			deck.add(8, new BASE_Card(8, "9 Of " + suit1));
			deck.add(9, new BASE_Card(9, "10 Of " + suit1));
			deck.add(10, new BASE_Card(10, "Jack Of " + suit1));
			deck.add(11, new BASE_Card(11, "Queen Of " + suit1));
			deck.add(12, new BASE_Card(12, "King Of " + suit1));
			deck.add(13, new BASE_Card(13, "Ace Of " + suit2));
			deck.add(14, new BASE_Card(14, "2 Of " + suit2));
			deck.add(15, new BASE_Card(15, "3 Of " + suit2));
			deck.add(16, new BASE_Card(16, "4 Of " + suit2));
			deck.add(17, new BASE_Card(17, "5 Of " + suit2));
			deck.add(18, new BASE_Card(18, "6 Of " + suit2));
			deck.add(19, new BASE_Card(19, "7 Of " + suit2));
			deck.add(20, new BASE_Card(20, "8 Of " + suit2));
			deck.add(21, new BASE_Card(21, "9 Of " + suit2));
			deck.add(22, new BASE_Card(22, "10 Of " + suit2));
			deck.add(23, new BASE_Card(23, "Jack Of " + suit2));
			deck.add(24, new BASE_Card(24, "Queen Of " + suit2));
			deck.add(25, new BASE_Card(25, "King Of " + suit2));
			deck.add(26, new BASE_Card(26, "Ace Of " + suit3));
			deck.add(27, new BASE_Card(27, "2 Of " + suit3));
			deck.add(28, new BASE_Card(28, "3 Of " + suit3));
			deck.add(29, new BASE_Card(29, "4 Of " + suit3));
			deck.add(30, new BASE_Card(30, "5 Of " + suit3));
			deck.add(31, new BASE_Card(31, "6 Of " + suit3));
			deck.add(32, new BASE_Card(32, "7 Of " + suit3));
			deck.add(33, new BASE_Card(33, "8 Of " + suit3));
			deck.add(34, new BASE_Card(34, "9 Of " + suit3));
			deck.add(35, new BASE_Card(35, "10 Of " + suit3));
			deck.add(36, new BASE_Card(36, "Jack Of " + suit3));
			deck.add(37, new BASE_Card(37, "Queen Of " + suit3));
			deck.add(38, new BASE_Card(38, "King Of " + suit3));
			deck.add(39, new BASE_Card(39, "Ace Of " + suit4));
			deck.add(40, new BASE_Card(40, "2 Of " + suit4));
			deck.add(41, new BASE_Card(41, "3 Of " + suit4));
			deck.add(42, new BASE_Card(42, "4 Of " + suit4));
			deck.add(43, new BASE_Card(43, "5 Of " + suit4));
			deck.add(44, new BASE_Card(44, "6 Of " + suit4));
			deck.add(45, new BASE_Card(45, "7 Of " + suit4));
			deck.add(46, new BASE_Card(46, "8 Of " + suit4));
			deck.add(47, new BASE_Card(47, "9 Of " + suit4));
			deck.add(48, new BASE_Card(48, "10 Of " + suit4));
			deck.add(49, new BASE_Card(49, "Jack Of " + suit4));
			deck.add(50, new BASE_Card(50, "Queen Of " + suit4));
			deck.add(51, new BASE_Card(51, "King Of " + suit4));
			isInit = true;
		}
		for(BASE_Card b:deck){
			if(b.getID() == ID){
				return b;
			}
		}
		if(ID > suits*values -1){
			System.out.println("Error: Card Lookup Failed! ID out of bounds. TABLE_Card:35");
		} else {
			System.out.println("Error: Card Lookup Failed! Unknown Error. TABLE_Card:37");
		}
		return null;
	}
}
