package impls.parts.toshiba;


import interfaces.Hand;
import org.springframework.stereotype.Component;

@Component("toshibaHand")
public class ToshibaHand implements Hand {
	
	public void catchSomething() {
		System.out.println("Caught from Toshiba!");
	}

}
