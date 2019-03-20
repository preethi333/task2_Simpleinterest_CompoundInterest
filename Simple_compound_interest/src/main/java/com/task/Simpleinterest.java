package com.task;
/**
 * Program to calculate SimpleInterest and 
 * CompoundInterest
 * @author PREETHI
 *
 */
public class Simpleinterest {

	
	float principle,timeperiod,rateofinterest;
	/**constructor for class Simpleinterest
	 * 
	 * @param principle
	 * @param timeperiod
	 * @param rateofinterest
	 */

	public Simpleinterest(float principle,float timeperiod,float rateofinterest){
		 this.principle=principle;
		 this.timeperiod=timeperiod;
		 this.rateofinterest=rateofinterest;
		 
	}
	/**
	 * fun to calculate simpleinterest
	 * @return double of (p*t*r)/100
	 */
	public double Simple_Interset() {
		return (principle*timeperiod*rateofinterest)/100;
	}
	
	/**
	 * fun to calculate compound interest
	 * @return double of p(1+r/100)^t
	 */
	public double Compound_Interset() {
	     return principle*(Math.pow((1+rateofinterest/100), timeperiod));
	}
}
