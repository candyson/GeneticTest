package geneticsResources;

import java.util.ArrayList;

public class Organism {

	private String name = "";
	private int ID = 0;
	private ArrayList<Gene> genes;
	
	public Organism(){
		genes = new ArrayList<Gene>();
		
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setID(int newID){
		ID = newID;
	}
	
	public int getID(){
		return ID;
	}
	
	public void addGene(Gene g){
		genes.add(g);
	}
	
	public Gene getGene(int i){
		return genes.get(i);
	}
	
	public int getNumberOfGenes(){
		return genes.size();
	}
}
