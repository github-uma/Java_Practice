package abstraction;

public abstract class ParentAirCraft {

	public void engine()
	{
		System.out.println("Follow engine guidelines");
	}
	
	public void safetyGuidelines()
	{
		System.out.println("Safety guidelines");
	}
	
	public abstract void bodyColor();
}
