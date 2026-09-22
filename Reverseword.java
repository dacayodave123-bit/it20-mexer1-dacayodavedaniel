 import java.util.Scanner;
import java.util.Stack;

public class StackWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        // Ask the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Convert the word to uppercase
        word = word.toUpperCase();

        // Step 1: Push each character into the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Step 2: Pop characters to reverse the word
        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Step 3: Display the reversed word
        System.out.println("Reversed word: " + reversed);

        // Challenge: Check if the word is a palindrome
        if (word.equals(reversed.toString())) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

        scanner.close();
    }
}
            
