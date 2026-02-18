/*
MAIN CLASS - USE CASE 2 Palindrome app
*use case 2: hardcoded Palindrome validation
*description:
*this class demonstrates basic palindrome validation
*At this stage , the application:
 -stores a predefined string
 -compares characters from both ends
 -Determines whether the string is a palindrome
 -displays the result on the console
 *This use case introduces fundamental comparison logic
 *before using advanced data structures.

 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "MADAM";
        String reversed;
        boolean isPalindrome = true;
        for(int i=0; i<input.length()/2; i++) {
            if (input.charAt(1) == input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("Not a palindrome.");
        }
    }
}
