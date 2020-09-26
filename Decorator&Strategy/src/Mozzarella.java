public class Mozzarella extends ToppingDecorator{
	public Mozzarella(Pizza newPizza) {		
		super(newPizza);		
		System.out.println("Adding Dough");	
		System.out.println("Adding Moz");
	}		
	public String getDescription(){		
		return tempPizza.getDescription() + ", mozzarella";		
	}	
	public double getCost(){		
		System.out.println("Cost of Moz: " + Prices.Mozzarella);
		return tempPizza.getCost() + Prices.Mozzarella;	
	}	
	

}