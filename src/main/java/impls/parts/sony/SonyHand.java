package impls.parts.sony;


import interfaces.Hand;
import org.springframework.stereotype.Component;

@Component("sonyHand")
public class SonyHand implements Hand {

	@Override
	public void catchSomething() {
		System.out.println("Caught from Sony");
	}

}
