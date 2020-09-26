
public class PizzaWithDrink extends Prices implements Strategy, Cloneable {
	private Pizza basicPizza;
	PizzaWithDrink(Pizza basicPizza) {
		this.basicPizza = basicPizza;
	}
	@Override
	public double doSale(double cost) {
		return (cost + Prices.drink);
	}
	
	public String getDescription() {
		return basicPizza.getDescription() + " + Drink";
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
