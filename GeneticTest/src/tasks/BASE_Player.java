package tasks;

import java.util.ArrayList;

public class BASE_Player {
	
	private String name = "";
	private ArrayList<Integer> hand;
	private int[] selectedCard = new int[2]; // [0] = spot in hand, [1] = value 
	
	BASE_Player(String name){
		this.name = name;
	}
	
	public void addCard(int ID){
		hand.add(ID);
	}
	
	public boolean checkForCard(int ID){
		for(int i:hand){
			if(i == ID){
				selectedCard[0] = hand.indexOf(i);
				selectedCard[1] = i;
				return true;
			}
		}
		return false;
	}
	
	public int[] getSelection(){
		return selectedCard;
	}
	
}
