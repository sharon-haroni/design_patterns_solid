package solid.iterator.composite.builder;

public class Developer extends Employee{
	public Developer (GeneralBuilder build)
	{
		super(build);
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
		}

		public Developer build() {
			Developer  employee =  new Developer (this);
			return employee;
		}
	}
}

