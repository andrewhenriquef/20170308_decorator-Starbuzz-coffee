package sizes;

import application.Beverage;
import application.Size;

public class Small extends Size {

	Beverage beverage;
	
	public Small(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription() + ", Tamanho Pequeno";
	}

	public double cost(){
		return beverage.cost();
	}
	
	
}
