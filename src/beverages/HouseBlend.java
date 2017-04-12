package beverages;

import application.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend(){
		description = "Mistura da Casa";
	}
	
	public double cost(){
		return 0.89;
	}
}
