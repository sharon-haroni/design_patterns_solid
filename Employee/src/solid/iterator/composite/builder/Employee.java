package solid.iterator.composite.builder;

public abstract class Employee{

	private String name;
	private double salary;
	private String academic;

	public abstract void   accept( VisitorBonus v );
	
	public void add(Employee employee) {
	}

	public Employee getChild(int i) {
		return null;
	}

	public void remove(Employee employee) {
	}

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

	public void AddBonus(double bonus) {
		this.salary += bonus;
	}

	public void print() {
		System.out.println("Name ="+getName());
		System.out.println("Salary ="+getSalary());
		System.out.println("Academic ="+getAcadmic());
		System.out.println("-------------");
	}

	public abstract static class GeneralBuilder extends Builder{
		public GeneralBuilder (String name, int salary) {
			super(name, salary);
		}

		abstract public Employee build();
	}

}

