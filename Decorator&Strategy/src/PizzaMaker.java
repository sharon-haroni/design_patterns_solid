public class PizzaMaker {
	public static void main(String[] args){	
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		Context context = new Context(new PizzaWithDrink(basicPizza));
		System.out.println("Description: " + context.getDescription());
		System.out.println("Total Cost including drink: " + context.executeStrategy());
		System.out.println("-----------------------------------------");
		Pizza basicPizza2 = new Mozzarella(basicPizza.duplicate());
		Context context2 = new Context(new PizzaWithDessert(basicPizza2));
		System.out.println("Description: " + context2.getDescription());
		System.out.println("Total Cost including dessert: " + context2.executeStrategy());
		System.out.println("-----------------------------------------");
		Context context3 = context2.duplicate();
		System.out.println("Description: " + context3.getDescription());
		System.out.println("Total Cost including drink: " + context3.executeStrategy());		
	}	
}