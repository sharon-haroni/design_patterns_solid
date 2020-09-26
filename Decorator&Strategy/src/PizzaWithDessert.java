
public class PizzaWithDessert extends Prices implements Strategy{
	private Pizza basicPizza;
	PizzaWithDessert(Pizza basicPizza) {
		this.basicPizza = basicPizza;
	}

	public double doSale(double cost) {
		return (cost + Prices.dessert);
	}

	public String getDescription() {
		return basicPizza.getDescription() + " + Dessert";
	}
	
	public double getCost() {
		return basicPizza.getCost();
	}

//	public Object clone() {
//		Object clone = null;
//		try {
//			clone = super.clone();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}   
//		return clone;
//	}

}
