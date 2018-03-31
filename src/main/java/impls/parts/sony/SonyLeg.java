package impls.parts.sony;


import interfaces.Leg;
import org.springframework.stereotype.Component;

@Component("sonyLeg")
public class SonyLeg implements Leg {

	@Override
	public void go() {
		System.out.println("Moving SonyLeg");
	}

}
