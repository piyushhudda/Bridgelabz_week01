1
import java.util.Scanner;

public class StringLengthWithoutLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        int length = findLengthWithoutBuiltIn(input);
        int builtInLength = input.length();

        System.out.println("Length of the string without using length(): " + length);
        System.out.println("Length of the string with built-in length(): " + builtInLength);
    }

    public static int findLengthWithoutBuiltIn(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When the index exceeds the string length
        }
        return count;
    }
}
2
        import java.util.Scanner;

public class TextSplitComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] customSplit = splitTextIntoWords(input);
        String[] builtInSplit = input.split(" ");

        boolean arraysEqual = compareStringArrays(customSplit, builtInSplit);

        System.out.println("Custom split result: ");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("Built-in split result: ");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("Are both methods equal? " + arraysEqual);
    }

    public static String[] splitTextIntoWords(String text) {
        int spaceCount = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int wordCount = 0;
        int wordStart = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordCount++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }
        words[wordCount] = text.substring(wordStart);

        return words;
    }

    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) return false;

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }
}
3
        import java.util.Scanner;

public class SplitTextIntoWordsWithLengths {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[][] wordAndLength = getWordsAndTheirLengths(input);

        System.out.printf("%-15s %-10s%n", "Word", "Length");
        for (String[] entry : wordAndLength) {
            System.out.printf("%-15s %-10s%n", entry[0], entry[1]);
        }
    }

    public static String[][] getWordsAndTheirLengths(String text) {
        String[] words = splitTextIntoWords(text);
        String[][] wordAndLength = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordAndLength[i][0] = words[i];
            wordAndLength[i][1] = String.valueOf(findLengthWithoutBuiltIn(words[i]));
        }

        return wordAndLength;
    }

    public static int findLengthWithoutBuiltIn(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When the index exceeds the string length
        }
        return count;
    }

    public static String[] splitTextIntoWords(String text) {
        int spaceCount = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int wordCount = 0;
        int wordStart = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordCount++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }
        words[wordCount] = text.substring(wordStart);

        return words;
    }
}
4
        import java.util.Scanner;

public class ShortestLongestStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = splitTextIntoWords(input);
        int[] minMax = findShortestAndLongest(words);

        System.out.println("Shortest word: " + words[minMax[0]]);
        System.out.println("Longest word: " + words[minMax[1]]);
    }

    public static String[] splitTextIntoWords(String text) {
        int spaceCount = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int wordCount = 0;
        int wordStart = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordCount++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }
        words[wordCount] = text.substring(wordStart);

        return words;
    }

    public static int[] findShortestAndLongest(String[] words) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < words.length; i++) {
            if (findLengthWithoutBuiltIn(words[i]) < findLengthWithoutBuiltIn(words[shortestIndex])) {
                shortestIndex = i;
            }
            if (findLengthWithoutBuiltIn(words[i]) > findLengthWithoutBuiltIn(words[longestIndex])) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static int findLengthWithoutBuiltIn(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) { }
        return count;
    }
}
5
        import java.util.Scanner;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] counts = findVowelsAndConsonants(input);
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
    }

    public static int[] findVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
6
        import java.util.Scanner;

public class VowelAndConsonantTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] results = findCharacterTypes(input);

        System.out.printf("%-10s %-10s%n", "Character", "Type");
        for (String[] result : results) {
            System.out.printf("%-10s %-10s%n", result[0], result[1]);
        }
    }

    public static String[][] findCharacterTypes(String text) {
        String[][] results = new String[findLengthWithoutBuiltIn(text)][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = getCharacterType(ch);
            results[index++] = new String[]{String.valueOf(ch), type};
        }

        return results;
    }

    public static String getCharacterType(char ch) {
        if (Character.isLetter(ch)) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static int findLengthWithoutBuiltIn(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) { }
        return count;
    }
}
7
        import java.util.Scanner;

public class TrimSpaces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to trim: ");
        String input = scanner.nextLine();

        int[] trimIndexes = trimLeadingAndTrailingSpaces(input);
        String trimmedString = substringUsingCharAt(input, trimIndexes[0], trimIndexes[1]);

        String builtInTrimmed = input.trim();

        System.out.println("Trimmed using charAt: \"" + trimmedString + "\"");
        System.out.println("Trimmed using built-in trim: \"" + builtInTrimmed + "\"");
        System.out.println("Are both trimmed strings equal? " + trimmedString.equals(builtInTrimmed));
    }

    public static int[] trimLeadingAndTrailingSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; // end + 1 because charAt is exclusive at the end
    }

    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }
}
8
        import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        int[] ages = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Taking age input for 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        String[][] eligibility = checkVotingEligibility(ages);
        displayEligibility(eligibility);
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = String.valueOf(ages[i]);
            eligibility[i][1] = ages[i] >= 18 ? "Can Vote" : "Cannot Vote";
        }

        return eligibility;
    }

    public static void displayEligibility(String[][] eligibility) {
        System.out.printf("%-10s %-15s%n", "Age", "Eligibility");
        for (String[] entry : eligibility) {
            System.out.printf("%-10s %-15s%n", entry[0], entry[1]);
        }
    }
}
9
        import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int numberOfGames = scanner.nextInt();

        String[][] results = new String[numberOfGames][3]; // Store game results
        int playerWins = 0;
        int computerWins = 0;

        // Play games
        for (int i = 0; i < numberOfGames; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String playerChoice = scanner.next();

            String computerChoice = getComputerChoice();
            String winner = determineWinner(playerChoice, computerChoice);

            results[i][0] = playerChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }

        displayResults(results, playerWins, computerWins, numberOfGames);
    }

    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random rand = new Random();
        return choices[rand.nextInt(choices.length)];
    }

    public static String determineWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Draw";
        }
        if ((player.equals("rock") && computer.equals("scissors")) ||
                (player.equals("paper") && computer.equals("rock")) ||
                (player.equals("scissors") && computer.equals("paper"))) {
            return "Player";
        }
        return "Computer";
    }

    public static void displayResults(String[][] results, int playerWins, int computerWins, int totalGames) {
        System.out.printf("%-10s %-10s %-10s%n", "Player", "Computer", "Winner");
        for (String[] result : results) {
            System.out.printf("%-10s %-10s %-10s%n", result[0], result[1], result[2]);
        }

        System.out.printf("Player Win Percentage: %.2f%%\n", (playerWins * 100.0 / totalGames));
        System.out.printf("Computer Win Percentage: %.2f%%\n", (computerWins * 100.0 / totalGames));
    }
}
10
        import java.util.Random;
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        int numberOfStudents = 10;
        int[][] scores = generateRandomScores(numberOfStudents);
        double[][] results = calculateGrades(scores);
        displayScoreCard(results);
    }

    public static int[][] generateRandomScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(101); // Physics
            scores[i][1] = rand.nextInt(101); // Chemistry
            scores[i][2] = rand.nextInt(101); // Math
        }

        return scores;
    }

    public static double[][] calculateGrades(int[][] scores) {
        double[][] results = new double[scores.length][5]; // Total, Average, Percentage, Grade, Rounded Average

        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double percentage = (total / 300) * 100;
            String grade = getGrade(percentage);
            results[i][0] = total;
            results[i][1] = total / 3;
            results[i][2] = percentage;
            results[i][3] = grade.charAt(0); // Storing the grade as a char
        }

        return results;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 85) return "A+";
        else if (percentage >= 70) return "A";
        else if (percentage >= 55) return "B";
        else if (percentage >= 40) return "C";
        else return "F";
    }

    public static void displayScoreCard(double[][] results) {
        System.out.printf("%-8s %-8s %-10s %-8s\n", "Total", "Avg", "Percentage", "Grade");
        for (double[] result : results) {
            System.out.printf("%-8.2f %-8.2f %-10.2f %-8s\n", result[0], result[1], result[2], (char) result[3]);
        }
    }
}

// LEVEL - 2

1
        import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String firstString = scanner.next();
        System.out.print("Enter second string: ");
        String secondString = scanner.next();

        boolean charComparison = compareStringsUsingCharAt(firstString, secondString);
        boolean builtInComparison = firstString.equals(secondString);

        System.out.println("Comparison using charAt method: " + charComparison);
        System.out.println("Comparison using built-in equals method: " + builtInComparison);
    }

    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
2
        import java.util.Scanner;

public class SubstringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();

        String customSubstring = createSubstringUsingCharAt(text, startIndex, endIndex);
        String builtInSubstring = text.substring(startIndex, endIndex);

        boolean areSame = customSubstring.equals(builtInSubstring);
        System.out.println("Custom substring: " + customSubstring);
        System.out.println("Built-in substring: " + builtInSubstring);
        System.out.println("Are both substrings equal? " + areSame);
    }

    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }
}
3
        import java.util.Scanner;

public class CharacterArrayComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char[] customArray = getCharactersUsingCharAt(text);
        char[] builtInArray = text.toCharArray();

        boolean areEqual = compareCharacterArrays(customArray, builtInArray);
        System.out.println("Are both character arrays equal? " + areEqual);
    }

    public static char[] getCharactersUsingCharAt(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    public static boolean compareCharacterArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
4
public class NullPointerDemo {

    public static void main(String[] args) {
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        handleNullPointerException();
    }

    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length()); // This will throw NullPointerException
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }
}
5
        import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        try {
            generateStringIndexOutOfBoundsException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }

        handleStringIndexOutOfBoundsException(text);
    }

    public static void generateStringIndexOutOfBoundsException(String text) {
        System.out.println(text.charAt(text.length())); // This will throw StringIndexOutOfBoundsException
    }

    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            System.out.println(text.charAt(text.length())); // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
6
        import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        try {
            generateIllegalArgumentException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        handleIllegalArgumentException(text);
    }

    public static void generateIllegalArgumentException(String text) {
        String sub = text.substring(2, 1); // This will throw IllegalArgumentException
    }

    public static void handleIllegalArgumentException(String text) {
        try {
            String sub = text.substring(2, 1); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        }
    }
}
7
        import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numeric text: ");
        String input = scanner.nextLine();

        try {
            generateNumberFormatException(input);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        handleNumberFormatException(input);
    }

    public static void generateNumberFormatException(String text) {
        int number = Integer.parseInt(text); // This will throw NumberFormatException if text is not a valid number
    }

    public static void handleNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text); // This will throw NumberFormatException if text is not a valid number
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e.getMessage());
        }
    }
}
8
        import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];

        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        try {
            generateArrayIndexOutOfBoundsException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        handleArrayIndexOutOfBoundsException(names);
    }

    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        System.out.println(names[names.length]); // This will throw ArrayIndexOutOfBoundsException
    }

    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            System.out.println(names[names.length]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
9
        import java.util.Scanner;

public class UppercaseComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String customUppercase = convertToUppercaseUsingCharAt(text);
        String builtInUppercase = text.toUpperCase();

        boolean areEqual = customUppercase.equals(builtInUppercase);
        System.out.println("Custom uppercase: " + customUppercase);
        System.out.println("Built-in uppercase: " + builtInUppercase);
        System.out.println("Are both uppercase strings equal? " + areEqual);
    }

    public static String convertToUppercaseUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32)); // Convert to uppercase
            } else {
                result.append(ch); // Keep the same
            }
        }
        return result.toString();
    }
}
10
        import java.util.Scanner;

public class LowercaseComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String customLowercase = convertToLowercaseUsingCharAt(text);
        String builtInLowercase = text.toLowerCase();

        boolean areEqual = customLowercase.equals(builtInLowercase);
        System.out.println("Custom lowercase: " + customLowercase);
        System.out.println("Built-in lowercase: " + builtInLowercase);
        System.out.println("Are both lowercase strings equal? " + areEqual);
    }

    public static String convertToLowercaseUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32)); // Convert to lowercase
            } else {
                result.append(ch); // Keep the same
            }
        }
        return result.toString();
    }
}

// LEVEL - 3

1
        import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] weightHeight = new double[10][2]; // 10 persons: [0] weight, [1] height

        // Input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weightHeight[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            weightHeight[i][1] = scanner.nextDouble();
        }

        String[][] result = calculateBMI(weightHeight);
        displayResults(result);
    }

    public static String[][] calculateBMI(double[][] weightHeight) {
        String[][] bmiData = new String[10][4];

        for (int i = 0; i < weightHeight.length; i++) {
            double weight = weightHeight[i][0];
            double heightInMeters = weightHeight[i][1] / 100; // convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            String status = "";

            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }

            bmiData[i][0] = String.format("%.2f", weightHeight[i][1]); // height
            bmiData[i][1] = String.format("%.2f", weight); // weight
            bmiData[i][2] = String.format("%.2f", bmi); // bmi
            bmiData[i][3] = status; // status
        }
        return bmiData;
    }

    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-20s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] result : results) {
            System.out.printf("%-10s %-10s %-10s %-20s%n", result[0], result[1], result[2], result[3]);
        }
    }
}
2
        import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(input);
        System.out.println("Unique characters are: ");
        for (char c : uniqueChars) {
            if (c != 0) {
                System.out.print(c + " ");
            }
        }
    }

    public static int findLength(String text) {
        int length = 0;
        while (text.charAt(length) != '\0') {
            length++;
            if (length >= text.length()) break; // avoid ArrayIndexOutOfBoundsException
        }
        return length;
    }

    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[count++] = text.charAt(i);
            }
        }

        return uniqueChars;
    }
}
3
        import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char result = findFirstNonRepeatingCharacter(text);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256]; // ASCII characters

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; // No non-repeating character
    }
}
4
        import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] frequency = findFrequency(text);
        displayFrequency(frequency);
    }

    public static String[][] findFrequency(String text) {
        int[] charCounts = new int[256];

        for (int i = 0; i < text.length(); i++) {
            charCounts[text.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int count : charCounts) {
            if (count > 0) uniqueCount++;
        }

        String[][] frequency = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                frequency[index][0] = Character.toString((char) i);
                frequency[index][1] = Integer.toString(charCounts[i]);
                index++;
            }
        }

        return frequency;
    }

    public static void displayFrequency(String[][] frequency) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        for (String[] freq : frequency) {
            System.out.printf("%-10s %-10s%n", freq[0], freq[1]);
        }
    }
}
5
        import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println("Is palindrome (Iterative check): " + isPalindromeIterative(text));
        System.out.println("Is palindrome (Recursive check): " + isPalindromeRecursive(text, 0, text.length() - 1));
    }

    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
}
6
        import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = scanner.nextLine();
        System.out.print("Enter second string: ");
        String second = scanner.nextLine();

        boolean result = areAnagrams(first, second);
        System.out.println("Are the two strings anagrams? " + result);
    }

    public static boolean areAnagrams(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        int[] charCount = new int[256]; // ASCII characters

        for (int i = 0; i < first.length(); i++) {
            charCount[first.charAt(i)]++;
            charCount[second.charAt(i)]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
7
        import java.util.Scanner;
import java.util.Calendar;

public class CalendarDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        displayCalendar(year, month);
    }

    public static void displayCalendar(int year, int month) {
        String[] monthNames = { "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December" };

        System.out.println("         " + monthNames[month - 1] + " " + year);
        System.out.println(" Su Mo Tu We Th Fr Sa");

        int daysInMonth = getDaysInMonth(year, month);
        int firstDay = getFirstDayOfMonth(year, month);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("   "); // indent for the first day
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static int getDaysInMonth(int year, int month) {
        if (month == 2) {
            return (isLeapYear(year)) ? 29 : 28;
        }
        return (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int year, int month) {
        if (month < 3) {
            month += 12;
            year--;
        }
        return (1 + (13 * (month + 1)) / 5 + year + (year / 4) - (year / 100) + (year / 400)) % 7;
    }
}
8
        import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int playersCount = scanner.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        String[] deck = initializeDeck();
        String[] shuffledDeck = shuffleDeck(deck);
        String[][] playersCards = distributeCards(shuffledDeck, playersCount, cardsPerPlayer);

        printPlayersCards(playersCards);
    }

    public static String[] initializeDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int playersCount, int cardsPerPlayer) {
        int totalCards = playersCount * cardsPerPlayer;
        if (totalCards > deck.length) {
            throw new IllegalArgumentException("Not enough cards in the deck");
        }

        String[][] playersCards = new String[playersCount][cardsPerPlayer];
        for (int i = 0; i < playersCount; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[i * cardsPerPlayer + j];
            }
        }
        return playersCards;
    }

    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + ": ");
            for (String card : playersCards[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}

