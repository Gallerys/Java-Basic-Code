import java.util.Scanner;

public class userNamee {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");

        // Read the user's input as a String
        String userName = scanner.nextLine();

        // Display a message using the user's input
        System.out.println("Hello, " + userName + "!");

        // Close the Scanner to free up resources
        scanner.close();
    }
}
