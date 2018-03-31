package impls.parts.sony;


import interfaces.Head;
import org.springframework.stereotype.Component;

@Component("sonyHead")
public class SonyHead implements Head {

	@Override
	public void calc() {
		System.out.println("SonyHead calculating");
	}

}
