package main;

import resources.*;

public class Main {
	static Gene gene;
	static Trait color, speed, health;
	static Organism organism, organismB, organismC;
	
	public static void main(String[] args) {
		Util.CreateIndetity();
		gene = new Gene();
		gene.setID(6);
		gene.setName("test");
		
		gene.addTrait(color = new Trait((byte)5));
		gene.addTrait(speed = new Trait((byte)4));
		gene.addTrait(health = new Trait((byte)3));
		
		System.out.println("Name: " + gene.getName() + " ID:" + gene.getID());
		System.out.println(gene.getTrait(0).getValue() + " " + gene.getTrait(1).getValue() + " " + gene.getTrait(2).getValue());
		
		organism = new Organism();
		organismB = new Organism();
		organism.addGene(gene);
		organismB.addGene(gene);
		organism.addGene(gene);
		organismB.addGene(gene);
		
		organismC = Breeder.CalcOffspring(organism, organismB);
		
		System.out.println(FitnessTest.CalcFitness(FitnessTest.task.test, organismC));
		
	}

}
