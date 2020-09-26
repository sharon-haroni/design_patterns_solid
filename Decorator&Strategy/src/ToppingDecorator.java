abstract class ToppingDecorator implements Pizza, Cloneable {
	protected Pizza tempPizza;		
	public ToppingDecorator(Pizza newPizza){	
		tempPizza = newPizza;	
	}
	public String getDescription() {	
		return tempPizza.getDescription();	
	}
	public double getCost() {	
		return tempPizza.getCost();		
	}
	
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}   
		return clone;
	}
	
	public Pizza duplicate() {
		return (Pizza) clone();
	}
}