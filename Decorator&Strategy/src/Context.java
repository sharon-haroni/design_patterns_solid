
public class Context implements Cloneable{
	private Strategy strategy;

	public Context(Strategy strategy){
		this.strategy = strategy;
	}

	public double executeStrategy(){
		return strategy.doSale(getCost());
	}

	public String getDescription() {
		return strategy.getDescription();  
	}

	public double getCost() {
		return strategy.getCost();  
	}
	
	public Context duplicate() {
		return (Context) clone();  
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

}
