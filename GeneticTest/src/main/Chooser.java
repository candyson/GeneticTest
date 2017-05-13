package main;

import geneticsResources.Gene;
import geneticsResources.Trait;

/**
 * 
 * @author jackson
 * 
 * base class for nueral networks
 */
public abstract class Chooser {
	
	protected Gene g;
	protected byte result = 0;
	protected double bounds = 100;
	protected double tempResult = 0;
	
	public Chooser(){
		
	}
	
	protected void initialize(Gene g){
		this.g = g;
	}
	
	protected void run(double[] data){
		calculate(data, g.getTrait());
	}
	
	protected abstract byte calculate(double[] data, Trait[] values);
	
	protected byte get(){
		return result;
	}
	
	protected void setBounds(double bounds){
		this.bounds = bounds;
	}
	
	protected void clip(){
		if(tempResult > bounds){
			tempResult = bounds;
		} else if(tempResult < -bounds){
			tempResult = -bounds;
		}
	}
}
