package application;

import beverages.DarkRoast;
import beverages.Espresso;
import condiments.SteamedMilk;
import sizes.*;

public class Starbuzz {

	public static void main(String[] args) {

		Beverage coffee = new Espresso();
		coffee = new Small(coffee);
		printData(coffee);

		Beverage milkCoffee = new DarkRoast();
		milkCoffee = new SteamedMilk(milkCoffee);
		milkCoffee = new Big(milkCoffee);
		printData(milkCoffee);
		
	}

	public static void printData(Beverage beverage){
		System.out.println(beverage.getDescription() + "- R$ " + beverage.cost());
	}
	
}
