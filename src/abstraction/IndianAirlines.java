package abstraction;

public class IndianAirlines extends ParentAirCraft {

	public static void main(String[] args) {

		IndianAirlines ia=new IndianAirlines();
		ia.safetyGuidelines();
		ia.engine();
		ia.bodyColor();
	}

	@Override
	public void bodyColor() {

		System.out.println("Body color is red is implemented in child class");
	}

}
