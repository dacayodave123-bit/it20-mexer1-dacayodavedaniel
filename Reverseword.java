 import java.util.Scanner;
import java.util.Stack;

public class StackWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

     
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

     
        word = word.toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

       
        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

   
        System.out.println("Reversed word: " + reversed);

       
        if (word.equals(reversed.toString())) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

        scanner.close();
    }
}
            
