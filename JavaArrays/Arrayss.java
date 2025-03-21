1
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();

            if (ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
        scanner.close();
    }
}
2
        import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (numbers[i] > 0) {
                System.out.println(numbers[i] + " is positive.");
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is even.");
                } else {
                    System.out.println(numbers[i] + " is odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
        scanner.close();
    }
}
3
        import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for multiplication table: ");
        int number = scanner.nextInt();
        int[] multiplicationTable = new int[10];

        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
        scanner.close();
    }
}
4
        import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index >= 10) break;

            System.out.print("Enter a number (0 or negative to stop): ");
            double number = scanner.nextDouble();

            if (number <= 0) break;

            numbers[index++] = number;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("Total sum: " + total);
        scanner.close();
    }
}
5
        import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4];

        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
        scanner.close();
    }
}



6
        import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double meanHeight = sum / heights.length;
        System.out.println("Mean height of the football team: " + meanHeight);
        scanner.close();
    }
}
7
        import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Not a natural number.");
            return;
        }

        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
8
        import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
        int[] factors = new int[10];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index >= factors.length) {
                    int[] temp = new int[factors.length * 2];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
9
        import java.util.Scanner;

public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[] oneDArray = new int[rows * columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneDArray[index++] = matrix[i][j];
            }
        }

        System.out.println("1D Array:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
10
        import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        String[] results = new String[number + 1];

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        for (int i = 1; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
        scanner.close();
    }
}

// LEVEL - 2

1
        import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EMPLOYEE_COUNT = 10;

        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salaries[i] = scanner.nextDouble();
                if (salaries[i] <= 0) {
                    System.out.println("Invalid salary. Please enter a positive number.");
                } else {
                    break;
                }
            }
            while (true) {
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = scanner.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative number.");
                } else {
                    break;
                }
            }

            if (yearsOfService[i] > 5) {
                bonuses[i] = 0.05 * salaries[i];
            } else {
                bonuses[i] = 0.02 * salaries[i];
            }

            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
        scanner.close();
    }
}
2
        import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFriends = 3;
        String[] names = { "Amar", "Akbar", "Anthony" };
        int[] ages = new int[numberOfFriends];
        double[] heights = new double[numberOfFriends];

        for (int i = 0; i < numberOfFriends; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        int youngestIndex = 0;
        double tallestHeight = heights[0];
        int tallestIndex = 0;

        for (int i = 1; i < numberOfFriends; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }

        System.out.println("Youngest friend: " + names[youngestIndex] + " (" + ages[youngestIndex] + " years)");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (" + heights[tallestIndex] + " meters)");
        scanner.close();
    }
}
3
        import java.util.Scanner;

public class DigitsLargestSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number > 0) {
            if (index >= maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        // Finding the largest and second largest numbers
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        scanner.close();
    }

4
        import java.util.Scanner;

    public class ReverseNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Counting digits
            int count = 0;
            int tempNumber = number;

            while (tempNumber > 0) {
                count++;
                tempNumber /= 10;
            }

            int[] digits = new int[count];
            tempNumber = number;

            // Storing digits
            for (int i = 0; i < count; i++) {
                digits[i] = tempNumber % 10;
                tempNumber /= 10;
            }

            // Displaying the reversed number
            System.out.print("Reversed number: ");
            for (int i = 0; i < count; i++) {
                System.out.print(digits[i]);
            }
            System.out.println();

            scanner.close();
        }
    }
5
        import java.util.Scanner;

    public class BMICalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of persons: ");
            int numberOfPersons = scanner.nextInt();

            double[][] personData = new double[numberOfPersons][3]; // index 0: height, 1: weight, 2: BMI
            String[] weightStatus = new String[numberOfPersons];

            for (int i = 0; i < numberOfPersons; i++) {
                double height, weight;

                while (true) {
                    System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                    weight = scanner.nextDouble();
                    if (weight <= 0) {
                        System.out.println("Invalid weight. Please enter a positive number.");
                    } else {
                        break;
                    }
                }

                while (true) {
                    System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                    height = scanner.nextDouble();
                    if (height <= 0) {
                        System.out.println("Invalid height. Please enter a positive number.");
                    } else {
                        break;
                    }
                }

                personData[i][0] = height;
                personData[i][1] = weight;
                personData[i][2] = weight / (height * height); // BMI calculation

                // Determine weight status
                if (personData[i][2] < 18.5) {
                    weightStatus[i] = "Underweight";
                } else if (personData[i][2] < 24.9) {
                    weightStatus[i] = "Normal";
                } else if (personData[i][2] < 29.9) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obesity";
                }
            }

            // Display results
            System.out.println("Height\tWeight\tBMI\tStatus");
            for (int i = 0; i < numberOfPersons; i++) {
                System.out.printf("%.2f\t%.2f\t%.2f\t%s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
            }
            scanner.close();
        }
    }
6
        import java.util.Scanner;

    public class StudentMarksGrading {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of students: ");
            int numberOfStudents = scanner.nextInt();

            double[][] marks = new double[numberOfStudents][3]; // Mark storage for physics, chemistry, and maths
            double[] percentages = new double[numberOfStudents];
            String[] grades = new String[numberOfStudents];

            for (int i = 0; i < numberOfStudents; i++) {
                for (int j = 0; j < 3; j++) {
                    while (true) {
                        String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                        System.out.print("Enter marks for " + subject + " for student " + (i + 1) + ": ");
                        marks[i][j] = scanner.nextDouble();
                        if (marks[i][j] < 0) {
                            System.out.println("Invalid marks. Please enter positive values.");
                        } else {
                            break;
                        }
                    }
                }
            }

            // Calculate percentages and grades
            for (int i = 0; i < numberOfStudents; i++) {
                double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
                percentages[i] = (totalMarks / 300) * 100;

                if (percentages[i] >= 90) {
                    grades[i] = "A";
                } else if (percentages[i] >= 80) {
                    grades[i] = "B";
                } else if (percentages[i] >= 70) {
                    grades[i] = "C";
                } else if (percentages[i] >= 60) {
                    grades[i] = "D";
                } else {
                    grades[i] = "F";
                }
            }

            // Display results
            System.out.println("Marks\tPercentage\tGrade");
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.printf("%.2f %.2f %.2f\t%.2f\t%s%n", marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
            }
            scanner.close();
        }
    }
7
        import java.util.Scanner;

    public class DigitFrequency {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int[] digits = new int[10];
            int currentDigit;

            // Store frequency of each digit
            while (number > 0) {
                currentDigit = number % 10;
                digits[currentDigit]++;
                number /= 10;
            }

            // Display frequency of each digit
            System.out.println("Digit Frequency:");
            for (int i = 0; i < digits.length; i++) {
                System.out.println(i + ": " + digits[i]);
            }
            scanner.close();
        }
    }
