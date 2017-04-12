package sizes;

import application.Beverage;
import application.Size;

public class Medium extends Size {

	Beverage beverage;
	
	public Medium(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + ", Tamanho Médio";
	}
	
	public double cost(){
		return beverage.cost() + 0.50;
	}
	
	
}
