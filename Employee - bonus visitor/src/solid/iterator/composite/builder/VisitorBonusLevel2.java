package solid.iterator.composite.builder;

public class VisitorBonusLevel2 implements VisitorBonus{
    public void visitBonus(Developer developer)
    {
    	developer.setBonus(200);
    }
    public void visitBonus(Manager manager)
    {
    	manager.setBonus(2000);
    }
}

