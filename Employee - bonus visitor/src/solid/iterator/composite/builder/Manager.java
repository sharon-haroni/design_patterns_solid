package solid.iterator.composite.builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager extends Employee{

	List<Employee> employees = new ArrayList<Employee>();
	private Manager (GeneralBuilder build)
	{
		super(build);
	}

	public void   accept( VisitorBonus v ) {
		v.visitBonus( this );
	}
	public void print() {
		System.out.println("------Manager-------");
		super.print();

		Iterator<Employee> employeeIterator = employees.iterator();
		while(employeeIterator.hasNext()){
			Employee employee = employeeIterator.next();
			employee.print();
		}
	}

	public void add(Employee employee) {
		employees.add(employee);
	}

	public Employee getChild(int i) {
		return employees.get(i);
	}

	public void remove(Employee employee) {
		employees.remove(employee);
	}
	
	public static class EmployeeBuilder extends GeneralBuilder{

		public EmployeeBuilder(String name, int salary) {
			super(name, salary);
		}

		public Employee build() {
			Manager  employee =  new Manager (this);
			return employee;
		}
	}
}

