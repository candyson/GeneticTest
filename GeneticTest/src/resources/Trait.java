package resources;

public class Trait {

	private byte value;
	
	public Trait(){
		value = 0;
	}
	
	public Trait(byte value){
		this.value = value;
	}
	
	public void setValue(byte value){
		this.value = value;
	}
	
	public byte getValue(){
		return value;
	}
	
}
