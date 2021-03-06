package condiments;

import application.Beverage;
import application.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator{
	
	Beverage beverage;
	
	public SteamedMilk(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + ", Leite Fervido";
	}
	
	public double cost(){
		return beverage.cost() + 0.10;
	}
}
