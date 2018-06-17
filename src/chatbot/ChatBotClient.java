package chatbot;

import java.util.Scanner;
import chatbot.games.ChatBank;
import chatbot.games.ChatSport;

public class ChatBotClient {

	public static void main(String[] args) {

		String inString = "In", outString = "Out";
		Scanner sc = new Scanner(System.in);

		System.out.println("Hello, how can I help you today?");
		System.out.println("");
		while (true) {
			inString = sc.nextLine().toLowerCase().trim();
			if (inString.equals("hello") || inString.equals("hi")) {
				outString = inString;
				System.out.println(outString);
			} else if (inString.equals("bye")) {
				System.out.println("Goodbye!");
				break;
			} else if (inString.equals("bank")) {
				System.out.println("Initializing bank!...");
				ChatBank bank = new ChatBank();
				bank.start();
			else if (inString.equals("sport")) {
				System.out.println("Initializing sport!...");
				ChatSport sport = new ChatSport();
				sport.start();
			} else {
				outString = "Sorry, I didn't understand";
				System.out.println(outString);
			}
		}
		sc.close();
	}

}
