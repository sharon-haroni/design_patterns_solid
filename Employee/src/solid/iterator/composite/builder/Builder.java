package solid.iterator.composite.builder;

public abstract class Builder {
	protected String name;
	protected int salary;
	protected String academic;
	public Builder (String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public Builder EmpAcademic(String academic) {
		this.academic = academic;
		return this;
	}
	public abstract Employee build();
}


