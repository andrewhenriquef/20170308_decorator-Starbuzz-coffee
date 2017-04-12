package sizes;

import application.Beverage;
import application.Size;

public class Big extends Size{
	
	Beverage beverage;
	
	public Big(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription() + ", Tamanho Grande";
	}

	public double cost(){
		return beverage.cost() + 1; 
	}
}
