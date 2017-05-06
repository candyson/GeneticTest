package main;

import java.util.ArrayList;

import resources.*;

public class Breeder {

	private static double defaultMutationRate = Constants.defaultMutationRate;
	private static double defaultGeneParentARate = Constants.defaultGeneParentARate;
	
	public Breeder(){
		
	}
	
	public static Organism CalcOffspring(Organism a, Organism b){
		Organism c = new Organism();
		for(int i=0; i<a.getNumberOfGenes() && i<b.getNumberOfGenes(); i++){
			Gene geneA = a.getGene(i);
			Gene geneB = b.getGene(i);
			Gene g = new Gene();
			for(int j=0; j<geneA.getNumberOfTraits() && j<geneB.getNumberOfTraits(); j++){
				Trait traitA = geneA.getTrait(j);
				Trait traitB = geneB.getTrait(j);
				Trait t = new Trait();
				t.setValue(CalcNewValue(traitA.getValue(), traitB.getValue(), defaultMutationRate));
				g.addTrait(t);
				
			}
			
			c.addGene(g);
		}
		return c;
	}
	
	public static Organism[] chooseSurvivors(Organism[] lastGen){
		Organism[] survivors = new Organism[lastGen.length];
		float[] i = new float[lastGen.length];
		int[] whoSurvived;
		short num = 0;
		for(Organism o:lastGen){
			i[num] = FitnessTest.CalcFitness(FitnessTest.task.test, o);
			num++;
		} 
		whoSurvived = CalcSurvivors(i);
		
		for(int j=0; j<lastGen.length; j++){
			if(whoSurvived[j] == 1){
				survivors[j] = lastGen[j];
			} else {
				survivors[j] = null;
			}
		}
		return survivors;
	}
	
	public static Organism[] fillSlots(Organism[] thisGen){
		Organism[] newGen = new Organism[thisGen.length];
		Organism parentA, parentB;
		int spot = 0;
		
		
		for(Organism o:thisGen){
			double seedA = Math.ceil(thisGen.length * Math.random());
			double seedB = Math.ceil(thisGen.length * Math.random());
			if(o == null){
				while(thisGen[(int)Double.doubleToLongBits(seedA)] == null){
					seedA++;
				}
				while(thisGen[(int)Double.doubleToLongBits(seedB)] == null){
					seedB++;
				}
				parentA = thisGen[(int)Double.doubleToLongBits(seedA)]; 
				parentB = thisGen[(int)Double.doubleToLongBits(seedA)];
				newGen[spot] = CalcOffspring(parentA, parentB);
			} else {
				newGen[spot] = thisGen[spot];
			}
			spot++;
		}
		
		return newGen;
	}
	
	private static byte CalcNewValue(byte a, byte b, double mutChance){
		byte c = 0;
		if(Math.random() < mutChance){
			if(a > 0){
				a = (byte) (67 -a);
			} else if(a < 0){
				a = (byte) (-67 -a);
			}
			
			if(b > 0){
				b = (byte) (57 -b);
			}else if(b < 0){
				b = (byte) (-57 -b);
			}
		}
		if(Math.random() >= defaultGeneParentARate){
			c = a;
		} else {
			c = b;
		}
		return c;
	}
	
	private static int[] CalcSurvivors(float[] i){
		int[] num = new int[i.length];
		
		float sum = 0;
		for(int j=0;j<i.length;j++){
			sum+= i[j];
		}
		for(int j=0;j<i.length;j++){
			float val = i[j]/sum;
			if(val >= 1/i.length){
				num[j] = 1;
			} else {
				num[j] = 0;
			}
		}
		
		return num;
	}
}
