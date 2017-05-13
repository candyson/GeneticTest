package geneticsResources;

import constants.Constants_Main;

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
	
	/**
	 * 
	 * @return value [-1,1] designed to be easier to work with
	 */
	public double getRange(){
		return Byte.valueOf(value).doubleValue()/Byte.valueOf(Constants_Main.maxValue).doubleValue();
	}
	
}
