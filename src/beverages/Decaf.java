package beverages;

import application.Beverage;

public class Decaf extends Beverage{
	
	public Decaf(){
		description = "Descafeinado";
	}
	
	public double cost(){
		return 1.05;
	}
}
