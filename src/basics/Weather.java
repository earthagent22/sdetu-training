package basics;

public class Weather {
	public static void main(String[] args) {
		//this program will suggest what to wear based on weather
		int temperature = 85;
		String sunCondition = "Sunny";
		
		if(temperature > 80) {
			System.out.println("It is pleasant. Wear Shorts and a t-shirt.");
			
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It is cooler.  Perhaps wear a long shirt and jeans.");
			System.out.println("Wear a hat to block the sun");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day, be sure to wear warmer clothes.");
		}
		else {
			System.out.print("looks chilly, bring a sweater.");
			
		}
		System.out.println("The program has ended.");
	}

}
