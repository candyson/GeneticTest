package main;

import resources.Organism;

public class FitnessTest {

	public static enum task{
		test;
	}
	
	public static float CalcFitness(task t, Organism o){
		switch (t) {
		case test: return CalcTest(o);
		
		default: return 0;
		}
	}
	
	private static float CalcTest(Organism o){
		return Byte.valueOf(o.getGene(0).getTrait(0).getValue()).floatValue() * 128;
	}
}
