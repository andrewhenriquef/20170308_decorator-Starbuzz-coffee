package condiments;

import application.Beverage;
import application.CondimentDecorator;

public class Soy extends CondimentDecorator{

	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription() + ", Soja";
	}

	public double cost(){
		return beverage.cost() + 0.15;
	}
}
