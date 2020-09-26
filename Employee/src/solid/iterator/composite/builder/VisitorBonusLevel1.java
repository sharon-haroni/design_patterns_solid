package solid.iterator.composite.builder;

public class VisitorBonusLevel1 implements VisitorBonus{
    public void visitBonus(Developer developer)
    {
    	developer.AddBonus(100);
    }
    public void visitBonus(Manager manager)
    {
    	manager.AddBonus(1000);
    }
}
