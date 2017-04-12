package condiments;

import application.Beverage;
import application.CondimentDecorator;

public class Whip extends CondimentDecorator{

	Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + ", Creme batido";
	}
	
	public double cost(){
		return beverage.cost() + 0.10;
	}

}

