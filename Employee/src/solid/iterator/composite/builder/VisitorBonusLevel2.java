package solid.iterator.composite.builder;

public class VisitorBonusLevel2 implements VisitorBonus{
    public void visitBonus(Developer developer)
    {
    	developer.AddBonus(200);
    }
    public void visitBonus(Manager manager)
    {
    	manager.AddBonus(2000);
    }
}

