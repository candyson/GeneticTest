package pedro;

import geneticsResources.Trait;
import main.Chooser;

public class CHOOSER_Pedro extends Chooser{

	
	@Override
	protected byte calculate(double[] data, Trait[] values) {
		
		for(int i=0; i<data.length; i++){
			tempResult+=data[i]*values[i].getRange();
			clip();
		}
		result = Double.valueOf(tempResult).byteValue();
		return result;
	}
}
