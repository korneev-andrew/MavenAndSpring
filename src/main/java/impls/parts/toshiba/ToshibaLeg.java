package impls.parts.toshiba;


import interfaces.Leg;
import org.springframework.stereotype.Component;

@Component("toshibaLeg")
public class ToshibaLeg implements Leg {
	
	public void go() {
		System.out.println("Moving ToshibaLeg");
	}

}
