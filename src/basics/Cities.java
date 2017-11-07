package basics;

public class Cities {
	public static void main(String[] args) {
		//declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dalas"};
		System.out.println(cities[0]);
		
		//declare the array
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "Whatever";
		states[3] = "Shut up";
		states[4] = "I don't care if you live or die.";
		
		for(int i = 0; i <= 4; i++) {
			System.out.println(states[i]);
		}
	}

}
