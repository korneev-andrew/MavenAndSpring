package impls.parts.toshiba;


import interfaces.Head;
import org.springframework.stereotype.Component;

@Component("toshibaHead")
public class ToshibaHead implements Head {
	
	public void calc() {
		System.out.println("ToshibaHead calculating");
	}

}
