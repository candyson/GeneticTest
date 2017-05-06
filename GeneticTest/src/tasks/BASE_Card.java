package tasks;

public class BASE_Card {
	private int ID;
	private String name;
	
	public BASE_Card(int ID, String name){
		this.ID = ID;
		this.name = name;
	}
	
	public int getID(){
		return ID;
	}
	
	public String getName(){
		return name;
	}
}
