package solid.iterator.composite.builder;

public class Developer extends Employee{
	public Developer (GeneralBuilder build)
	{
		super(build);
	}
	public void add(Employee employee) {
		//this is leaf node so this method is not applicable to this class.
	}

	public Employee getChild(int i) {
		//this is leaf node so this method is not applicable to this class.
		return null;
	}

	public void remove(Employee employee) {
		//this is leaf node so this method is not applicable to this class.
	}

	public void   accept( VisitorBonus v ) {
		v.visitBonus( this );
	}
	
	public void print() {
		System.out.println("------Developer-------");
		super.print();
	}

	public static class EmployeeBuilder extends GeneralBuilder{

		public EmployeeBuilder(String name, int salary) {
			super(name, salary);
			// TODO Auto-generated constructor stub
		}

		public Developer build() {
			Developer  employee =  new Developer (this);
			return employee;
		}
	}
}

