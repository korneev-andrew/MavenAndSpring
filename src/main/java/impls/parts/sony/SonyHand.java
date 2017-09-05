package impls.parts.sony;


import interfaces.Hand;

public class SonyHand implements Hand {

	@Override
	public void catchSomething() {
		System.out.println("Caught from Sony");
	}

}
