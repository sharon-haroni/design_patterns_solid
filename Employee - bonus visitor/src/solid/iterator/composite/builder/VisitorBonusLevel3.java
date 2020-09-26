package solid.iterator.composite.builder;

public class VisitorBonusLevel3 implements VisitorBonus{
    public void visitBonus(Developer developer)
    {
    	developer.setBonus(300);
    }
    public void visitBonus(Manager manager)
    {
    	manager.setBonus(3000);
    }
}

