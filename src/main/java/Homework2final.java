 import java.util.Scanner;

public class Homework2final
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Replace a substring in a given string with other text
        System.out.print("Enter you full names: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter what you want to change in your name: ");
        String substringToReplace = scanner.nextLine();
        System.out.print("Enter with what you wanna change your name: ");
        String replacementText = scanner.nextLine();

        String replacedString = inputString.replace(substringToReplace, replacementText);
        System.out.println("Replaced name: " + replacedString);

        // Compare two strings
        System.out.print("Enter a animal: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter another animal: ");
        String secondString = scanner.nextLine();

        boolean areEqual = firstString.equals(secondString);
        System.out.println("Are they the same: " + areEqual);

        // Counts the word in a string
        System.out.print("Enter a text: ");
        String stringWithWords = scanner.nextLine();

        String[] words = stringWithWords.split("\\s+");
        int wordCount = words.length;
        System.out.println("Your texts word count is: " + wordCount);

        // Merge two or more strings into one
        System.out.print("Enter the first word you want to concatenate: ");
        String firstConcatString = scanner.nextLine();
        System.out.print("Enter the second word you want to concatenate: ");
        String secondConcatString = scanner.nextLine();

        String concatenatedString = firstConcatString + secondConcatString;
        System.out.println("Concatenated word: " + concatenatedString);

        scanner.close();

    }

}
