package geneticsResources;

import java.util.ArrayList;

public class Gene {
	
	private String name;
	private int ID = 0; // unique integer identifier
	private ArrayList<Trait> traits; // allows easy ability to add multiple traits to one gene
	
	public Gene(){
		name = "";
	}
	
	public Gene(String name){
		this.name = name;
	}
	
	public void setID(int newID){
		ID = newID;
	}
	
	public int getID(){
		return ID;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public String getName(){
		return name;
	}
	
	public void addTrait(Trait t){
		if (traits == null) traits = new ArrayList<Trait>();
		traits.add(t);
	}
	
	public Trait getTrait(int i){
		return traits.get(i);
	}
	
	public Trait[] getTrait(){
		return (Trait[]) traits.toArray();
	}
	
	public int getNumberOfTraits(){
		return traits.size();
	}
}
