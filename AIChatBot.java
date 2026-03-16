import java.util.Scanner;

public class AIChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ChatBot: Hello! I am your AI assistant.");

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if (input.contains("hello") || input.contains("hi")) {
                System.out.println("ChatBot: Hello! How can I help you?");
            }

            else if (input.contains("name")) {
                System.out.println("ChatBot: I am a Java AI Chatbot.");
            }

            else if (input.contains("how are you")) {
                System.out.println("ChatBot: I am doing great!");
            }

            else if (input.contains("bye")) {
                System.out.println("ChatBot: Goodbye!");
                break;
            }

            else {
                System.out.println("ChatBot: Sorry, I didn't understand.");
            }
        }

        sc.close();
    }
}