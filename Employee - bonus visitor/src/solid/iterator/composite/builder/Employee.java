package solid.iterator.composite.builder;

public abstract class Employee{

	private String name;
	private double salary;
	private String academic;
	private double bonus;

	public abstract void add(Employee employee);
	public abstract void remove(Employee employee);
	public abstract Employee getChild(int i);
	public abstract void   accept( VisitorBonus v );
	
	public Employee (GeneralBuilder build)
	{
		this.academic = build.academic;
		this.name = build.name;
		this.salary = build.salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getAcadmic() {
		return academic;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}
	
	public void print() {
		System.out.println("Name ="+getName());
		System.out.println("Salary ="+getSalary());
		System.out.println("Academic ="+getAcadmic());
		System.out.println("Bonus ="+getBonus());
		System.out.println("-------------");
	}
	
	public abstract static class GeneralBuilder extends Builder{
		public GeneralBuilder (String name, int salary) {
			super(name, salary);
		}

		abstract public Employee build();
	}
	
}

