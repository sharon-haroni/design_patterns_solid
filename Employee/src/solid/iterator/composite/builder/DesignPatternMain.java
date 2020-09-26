package solid.iterator.composite.builder;

public class DesignPatternMain {

	public static void main(String[] args) {
        VisitorBonusLevel1 level1 = new VisitorBonusLevel1();
        VisitorBonusLevel2 level2 = new VisitorBonusLevel2();
               
		Employee emp1=new Developer.EmployeeBuilder("david", 20000).EmpAcademic("telaviv").build();
		Employee emp2=new Developer.EmployeeBuilder("Moti", 15000).EmpAcademic("Hifa").build();
		Employee manager1=new Manager.EmployeeBuilder("Daniel",25000).build();
		manager1.add(emp1);
		manager1.add(emp2);
		Employee emp3=new Developer.EmployeeBuilder("Michael", 55000).EmpAcademic("MIT").build();
		Employee emp4=new Developer.EmployeeBuilder("Jon", 5000).build();
		Employee generalManager=new Manager.EmployeeBuilder("Mark", 80000).EmpAcademic("NewYork").build();
		generalManager.add(emp3);
		generalManager.add(emp4);
		generalManager.add(manager1);
		
		
		emp1.accept(level1);
		emp2.accept(level1);
		emp3.accept(level1);
		emp4.accept(level2);
		manager1.accept(level2);
		generalManager.accept(level2);
        
		generalManager.print();
	}
}

