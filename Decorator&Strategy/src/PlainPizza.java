public class PlainPizza extends Prices implements Pizza, Cloneable {
	public String getDescription() {	
		return "Thin dough";
	}
	public double getCost() {
		System.out.println("Cost of Dough: " + Prices.PlainPizza);	
		return Prices.PlainPizza;	
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