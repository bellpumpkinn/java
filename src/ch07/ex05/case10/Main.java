package ch07.ex05.case10;
//instanceof
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bumblebee bumblebee = new Bumblebee();
		Prime prime = new Prime();
		List<Autobot> corps = new ArrayList<>();  //corps:군단.
		
		corps.add(bumblebee);
		corps.add(prime);
		
		for(Autobot autobot: corps) {
			autobot.run();
			autobot.fight();
			//autobot.guard(); -> 오토봇 타입이라서 가드 불가.
			
			if(autobot instanceof Bumblebee) ((Bumblebee)autobot).guard();
			if(autobot instanceof Prime) ((Prime)autobot).command();
		}
}
}
