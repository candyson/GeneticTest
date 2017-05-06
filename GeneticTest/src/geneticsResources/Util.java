package geneticsResources;

public class Util {

	public static Trait identityTrait = new Trait();
	public static Gene identityGene = new Gene();
	public static Organism identityOrganism = new Organism();
	
	public static void CreateIndetity(){
		identityGene.addTrait(identityTrait);
		identityOrganism.addGene(identityGene);
	}
}
