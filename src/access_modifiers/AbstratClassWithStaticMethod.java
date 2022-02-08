package access_modifiers;

abstract class Party {
    static void doParty()
    {
        System.out.println("Lets have some fun!!");
    }
}

public class AbstratClassWithStaticMethod {

	public static void main(String[] args) 
	    {
	        Party.doParty();
	    }
}
