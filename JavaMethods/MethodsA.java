1

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();


        double interest = calculateSimpleInterest(principal, rate, time);


        System.out.println("The Simple Interest is " + interest + " for Principal " + principal +
                ", Rate of Interest " + rate + " and Time " + time + " years");

        scanner.close();
    }


    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}

2
        import java.util.Scanner;

public class Handshakes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();


        int maxHandshakes = calculateHandshakes(numberOfStudents);


        System.out.println("Maximum number of possible handshakes: " + maxHandshakes);

        scanner.close();
    }


    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}

3
        import java.util.Scanner;

public class Handshakes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();


        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;


        System.out.println("Maximum number of possible handshakes: " +
                maxHandshakes);

        scanner.close();
    }
}

4
        import java.util.Scanner;

public class AthleteRounds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter side1 of the triangle (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2 of the triangle (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3 of the triangle (in meters): ");
        double side3 = scanner.nextDouble();


        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete needs to complete " + rounds + " rounds to complete a 5 km run.");

        scanner.close();
    }

    public static double calculateRounds(double side1, double side2, double side3) {

        double perimeter = side1 + side2 + side3;

        double distanceInMeters = 5000;

        return distanceInMeters / perimeter;
    }
}

5
        import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        int result = checkNumber(number);

        if (result == -1) {
            System.out.println("The number is negative.");
        } else if (result == 1) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }

    public static int checkNumber(int number) {
        if (number < 0) {
            return -1;
        } else if (number > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

6
public class SpringSeason {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Error: Please provide month and day as command line arguments.");
            System.out.println("Example: java SpringSeason 3 21");
            return; // Exit the program
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);


        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    public static boolean isSpringSeason(int month, int day) {

        if (month == 3 && day >= 20 && day <= 31) return true;
        if (month == 4 && day >= 1 && day <= 30) return true;
        if (month == 5 && day >= 1 && day <= 31) return true;
        if (month == 6 && day >= 1 && day <= 20) return true;
        return false;
    }
}

7
        import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();


        int sum = sumOfNaturalNumbers(n);

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        scanner.close();
    }

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

8
        import java.util.Scanner;

public class SmallestLargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();


        int[] result = findSmallestAndLargest(number1, number2, number3);

        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        scanner.close();
    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }
}

9
        import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();


        int[] result = findRemainderAndQuotient(dividend, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        scanner.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
}

10
        import java.util.Scanner;

public class ChocolateDistribution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();


        int[] distribution = findChocolatesDistribution(numberOfChocolates, numberOfChildren);

        System.out.println("Number of chocolates each child gets: " + distribution[0]);
        System.out.println("Number of remaining chocolates: " + distribution[1]);

        scanner.close();
    }

    public static int[] findChocolatesDistribution(int numberOfChocolates, int numberOfChildren) {

        return findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
    }


    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int chocolatesPerChild = number / divisor;
        int remainingChocolates = number % divisor;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }
}

11
        import java.util.Scanner;

public class WindChillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in mph: ");
        double windSpeed = scanner.nextDouble();


        double windChill = calculateWindChill(temperature, windSpeed);


        System.out.println("The wind chill temperature is: " + windChill);

        scanner.close();
    }


    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}

12
        import java.util.Scanner;

public class TrigonometricFunctions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an angle in degrees: ");
        double angleInDegrees = scanner.nextDouble();


        double[] results = calculateTrigonometricFunctions(angleInDegrees);


        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        scanner.close();
    }


    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {

        double angleInRadians = Math.toRadians(angleInDegrees);


        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);

        return new double[]{sine, cosine, tangent};
    }
}

// LEVEL - 2

1
public static void footballTeamStats() {
    System.out.println("\n--- 1. Football Team Stats ---");
    int[] heights = generateRandomHeights(11, 150, 250); // 11 players, 150-250 cm
    System.out.println("Player Heights: " + Arrays.toString(heights));

    int sum = sumOfArray(heights);
    double mean = calculateMean(heights);
    int shortest = findShortest(heights);
    int tallest = findTallest(heights);

    System.out.println("Sum of heights: " + sum);
    System.out.println("Mean height: " + mean);
    System.out.println("Shortest height: " + shortest);
    System.out.println("Tallest height: " + tallest);
}

public static int[] generateRandomHeights(int size, int min, int max) {
    int[] array = new int[size];
    Random random = new Random();
    for (int i = 0; i < size; i++) {
        array[i] = random.nextInt(max - min + 1) + min;
    }
    return array;
}

2
public static int sumOfArray(int[] array) {
    int sum = 0;
    for (int value : array) {
        sum += value;
    }
    return sum;
}

public static double calculateMean(int[] array) {
    if (array.length == 0) return 0;
    return (double) sumOfArray(array) / array.length;
}

public static int findShortest(int[] array) {
    if (array.length == 0) return Integer.MAX_VALUE;
    int min = array[0];
    for (int value : array) {
        if (value < min) {
            min = value;
        }
    }
    return min;
}

public static int findTallest(int[] array) {
    if (array.length == 0) return Integer.MIN_VALUE;
    int max = array[0];
    for (int value : array) {
        if (value > max) {
            max = value;
        }
    }
    return max;
}

public static void numberCheckerTask1() {
    System.out.println("\n--- 2. Number Checker Task 1 ---");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    System.out.println("Count of digits: " + NumberChecker.countDigits(number));
    int[] digits = NumberChecker.storeDigits(number);
    System.out.println("Digits array: " + Arrays.toString(digits));
    System.out.println("Is duck number: " + NumberChecker.isDuckNumber(digits));
    System.out.println("Is Armstrong number: " + NumberChecker.isArmstrongNumber(digits));
    int[] largestAndSecondLargest = NumberChecker.findLargestAndSecondLargest(digits);
    System.out.println("Largest and Second Largest: " + Arrays.toString(largestAndSecondLargest));
    int[] smallestAndSecondSmallest = NumberChecker.findSmallestAndSecondSmallest(digits);
    System.out.println("Smallest and Second Smallest: " + Arrays.toString(smallestAndSecondSmallest));
}

public static void numberCheckerTask2() {
    System.out.println("\n--- 3. Number Checker Task 2 ---");

    2
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    int[] digits = NumberChecker.storeDigits(number);
    System.out.println("Sum of digits: " + NumberChecker.sumOfDigits(digits));
    System.out.println("Sum of squares of digits: " + NumberChecker.sumOfSquaresOfDigits(digits));
    System.out.println("Is Harshad number: " + NumberChecker.isHarshadNumber(number, digits));
    int[][] digitFrequency = NumberChecker.findDigitFrequency(number);
    System.out.println("Digit Frequency: " + Arrays.deepToString(digitFrequency));
}

public static void numberCheckerTask3() {
    System.out.println("\n--- 4. Number Checker Task 3 ---");

    3
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    int[] digits = NumberChecker.storeDigits(number);
    int[] reversedDigits = NumberChecker.reverseDigits(digits);
    System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));
    System.out.println("Are arrays equal: " + Arrays.equals(digits, reversedDigits));
    System.out.println("Is palindrome: " + NumberChecker.isPalindrome(digits));
    System.out.println("Is duck number: " + NumberChecker.isDuckNumber(digits));
}

public static void numberCheckerTask4() {
    System.out.println("\n--- 5. Number Checker Task 4 ---");

    4
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    System.out.println("Is prime: " + NumberChecker.isPrime(number));
    System.out.println("Is neon: " + NumberChecker.isNeon(number));
    System.out.println("Is spy: " + NumberChecker.isSpy(number));
    System.out.println("Is automorphic: " + NumberChecker.isAutomorphic(number));
    System.out.println("Is buzz: " + NumberChecker.isBuzz(number));
}

public static void numberCheckerTask5() {
    System.out.println("\n--- 6. Number Checker Task 5 ---");

    5
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    int[] factors = NumberChecker.findFactors(number);
    System.out.println("Factors: " + Arrays.toString(factors));
    System.out.println("Greatest factor: " + NumberChecker.findGreatestFactor(factors));
    System.out.println("Sum of factors: " + NumberChecker.findSumOfFactors(factors));
    System.out.println("Product of factors: " + NumberChecker.findProductOfFactors(factors));
    System.out.println("Product of cube of factors: " + NumberChecker.findProductOfCubeOfFactors(factors));
    System.out.println("Is perfect: " + NumberChecker.isPerfectNumber(number, factors));
    System.out.println("Is abundant: " + NumberChecker.isAbundantNumber(number, factors));
    System.out.println("Is deficient: " + NumberChecker.isDeficientNumber(number, factors));
    System.out.println("Is strong: " + NumberChecker.isStrongNumber(number));
}

public static void otpGeneration() {
    System.out.println("\n--- 7. OTP Generation ---");


    7
    String[] otps = new String[10];
    for (int i = 0; i < 10; i++) {
        otps[i] = OTPGenerator.generateOTP(6);
    }
    System.out.println("Generated OTPs: " + Arrays.toString(otps));
    System.out.println("Are OTPs unique: " + OTPGenerator.areUnique(otps));
}

public static void calendarDisplay() {
    System.out.println("\n--- 8. Calendar Display ---");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter month (1-12): ");
    int month = scanner.nextInt();
    System.out.print("Enter year: ");
    int year = scanner.nextInt();
    CalendarDisplay.displayCalendar(month, year);
}

public static void euclideanDistanceAndLineEquation() {
    System.out.println("\n--- 9. Euclidean Distance and Line Equation ---");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter x1: ");
    double x1 = scanner.nextDouble();
    System.out.print("Enter y1: ");
    double y1 = scanner.nextDouble();
    System.out.print("Enter x2: ");
    double x2 = scanner.nextDouble();
    System.out.print("Enter y2: ");
    double y2 = scanner.nextDouble();

    double distance = Geometry.euclideanDistance(x1, y1, x2, y2);
    double[] lineEquation = Geometry.lineEquation(x1, y1, x2, y2);

    System.out.println("Euclidean Distance: " + distance);
    System.out.println("Line Equation: y = " + lineEquation[0] + "x + " + lineEquation[1]);
}

public static void collinearPoints() {


    10
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter x1: ");
    double x1 = scanner.nextDouble();
    System.out.print("Enter y1: ");
    double y1 = scanner.nextDouble();
    System.out.print("Enter x2: ");
    double x2 = scanner.nextDouble();
    System.out.print("Enter y2: ");
    double y2 = scanner.nextDouble();
    System.out.print("Enter x3: ");
    double x3 = scanner.nextDouble();
    System.out.print("Enter y3: ");
    double y3 = scanner.nextDouble();

    boolean collinearBySlope = Geometry.areCollinearBySlope(x1, y1, x2, y2, x3, y3);
    boolean collinearByArea = Geometry.areCollinearByArea(x1, y1, x2, y2, x3, y3);

    System.out.println("Collinear by Slope: " + collinearBySlope);
    System.out.println("Collinear by Area: " + collinearByArea);
}

public static void employeeBonus() {


    11
    double[][] employeeData = EmployeeBonus.generateEmployeeData(10);
    double[][] bonusData = EmployeeBonus.calculateBonus(employeeData);
    EmployeeBonus.displayBonusDetails(employeeData, bonusData);
}

public static void studentScorecard() {


    12
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of students: ");
    int numStudents = scanner.nextInt();

    double[][] studentData = StudentScorecard.generateStudentData(numStudents);
    double[][] resultData = StudentScorecard.calculateResults(studentData);
    StudentScorecard.displayScorecard(studentData, resultData);
}

public static void matrixOperations() {

    13
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter rows for matrix 1: ");
    int rows1 = scanner.nextInt();
    System.out.print("Enter cols for matrix 1: ");
    int cols1 = scanner.nextInt();
    double[][] matrix1 = MatrixOperations.generateRandomMatrix(rows1, cols1);

    System.out.print("Enter rows for matrix 2: ");
    int rows2 = scanner.nextInt();
    System.out.print("Enter cols for matrix 2: ");
    int cols2 = scanner.nextInt();
    double[][] matrix2 = MatrixOperations.generateRandomMatrix(rows2, cols2);

    System.out.println("Matrix 1:");
    MatrixOperations.displayMatrix(matrix1);
    System.out.println("Matrix 2:");
    MatrixOperations.displayMatrix(matrix2);

    if (cols1 == rows2) {
        double[][] product = MatrixOperations.multiplyMatrices(matrix1, matrix2);
        System.out.println("Product:");
        MatrixOperations.displayMatrix(product);
    } else {
        System.out.println("Matrices cannot be multiplied.");
    }

    if (rows1 == rows2 && cols1 == cols2) {
        double[][] sum = MatrixOperations.addMatrices(matrix1, matrix2);
        System.out.println("Sum:");
        MatrixOperations.displayMatrix(sum);

        double[][] difference = MatrixOperations.subtractMatrices(matrix1, matrix2);
        System.out.println("Difference:");
        MatrixOperations.displayMatrix(difference);
    } else {
        System.out.println("Matrices cannot be added or subtracted.");
    }

    double[][] transpose1 = MatrixOperations.transposeMatrix(matrix1);
    System.out.println("Transpose of Matrix 1:");
    MatrixOperations.displayMatrix(transpose1);

    if (rows1 == cols1) {
        if (rows1 == 2) {
            double det = MatrixOperations.determinant2x2(matrix1);
            System.out.println("Determinant (2x2): " + det);
            double[][] inverse = MatrixOperations.inverse2x2(matrix1);
            System.out.println("Inverse (2x2):");
            MatrixOperations.displayMatrix(inverse);
        } else if (rows1 == 3) {
            double det = MatrixOperations.determinant3x3(matrix1);
            System.out.println("Determinant (3x3): " + det);
            double[][] inverse = MatrixOperations.inverse3x3(matrix1);
            System.out.println("Inverse (3x3):");
            MatrixOperations.displayMatrix(inverse);
        }
    } else {
        System.out.println("Determinant and inverse are only defined for square matrices.");
    }
}
}

class NumberChecker {
    // 2. NumberChecker Utility Class - Task 1
    public static int countDigits(int number) {
        int count = 0;
        number = Math.abs(number);
        if (number == 0) {
            return 1;
        }
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int[] digits) {
        int n = digits.length;
        int sum = 0;
        int originalNumber = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
            originalNumber = originalNumber * 10 + digit;
        }
        return sum == originalNumber;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            }
        }
    }
}

// LEVEL - 3

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Programs {

    // Program 1: Factors of a number
    public static int[] findFactors(int num) {
        if (num <= 0) {
            return new int[0]; // Return empty array for non-positive numbers
        }
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double sumOfSquareOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }



    // Program 2: Sum of n natural numbers (recursive vs. formula)
    public static int recursiveSumNaturalNumbers(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + recursiveSumNaturalNumbers(n - 1);
        }
    }

    public static int formulaSumNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }



    // Program 3: Leap Year Checker
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            System.out.println("Leap year calculation is valid for years >= 1582.");
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


 System.out.println("\n--- Program 4, 5, 6: Unit Convertor ---");
        System.out.print("Enter kilometers to convert to miles: ");
        try {
        double km = scanner.nextDouble();
        System.out.println(km + " km = " + UnitConvertor.convertKmToMiles(km) + " miles");
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.next();
    }

        System.out.print("Enter miles to convert to kilometers: ");
        try {
        double miles = scanner.nextDouble();
        System.out.println(miles + " miles = " + UnitConvertor.convertMilesToKm(miles) + " km");
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.next();
    }

        System.out.print("Enter meters to convert to feet: ");
        try {
        double meters = scanner.nextDouble();
        System.out.println(meters + " m = " + UnitConvertor.convertMetersToFeet(meters) + " feet");
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.next();
    }

        System.out.print("Enter feet to convert to meters: ");
        try {
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet = " + UnitConvertor.convertFeetToMeters(feet) + " m");
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.next();
    }

        System.out.print("Enter yards to convert to feet: ");
        try {
        double yards = scanner.nextDouble();
        System.out.println(yards + " yards = " + UnitConvertor.convertYardsToFeet(yards) + " feet");
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.next();
    }

        System.out.print("Enter feet to convert to yards: ");
        try {
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet = " + UnitConvertor.convertFeetToYards(feet) + " yards");
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.next();
    }

        System.out.print("Enter meters to convert to inches: ");
        try {
        double m = scanner.nextDouble();
        System.out.println(m + " m = " + UnitConvertor.convertMetersToInches(m) + " inches");
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.next();
    }

        System.out.print("Enter inches to convert to meters: ");
        try {
        double inches = scanner.nextDouble();
        System.out.println(inches + " inches = " + UnitConvertor.convertInchesToMeters(inches) + " m");
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.next();
    }

        System.out.print("Enter inches to convert to centimeters: ");
        try {
        double inch = scanner.nextDouble();
        System.out.println(inch + " inches = " + UnitConvertor.convertInchesToCentimeters(inch) + " cm");
    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.next();
    }

        System.out.print("Enter Fahrenheit to convert to Celsius: ");
        try {
        double fahrenheit = scanner.nextDouble();
        System.out.println(fahrenheit + " °F = " + UnitConvertor.convertFahrenheitToCelsius(fahrenheit) + " °C");
    } catch (InputMismatchException

    // Program 7: Student Vote Checker
    public static class StudentVoteChecker {
        public boolean canStudentVote(int age) {
            if (age < 0) {
                return false;
            }
            return age >= 18;
        }
    }



    // Program 8: Youngest and Tallest Friends
    public static String findYoungest(int[] ages, String[] names) {
        if (ages.length != names.length || ages.length != 3) {
            return "Invalid input";
        }
        int youngestAge = ages[0];
        String youngestFriend = names[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }
        return youngestFriend;
    }

    public static String findTallest(double[] heights, String[] names) {
        if (heights.length != names.length || heights.length != 3) {
            return "Invalid input";
        }
        double tallestHeight = heights[0];
        String tallestFriend = names[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        return tallestFriend;
    }



    // Program 9: Positive/Negative, Even/Odd, Compare First and Last
    public static String checkPositiveNegative(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static int compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }



    // Program 10: Body Mass Index (BMI) Calculator
    public static double[][] calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            if (heightM > 0) {
                data[i][2] = weight / (heightM * heightM);
            } else {
                data[i][2] = -1; // Indicate invalid height
            }
        }
        return data;
    }

    public static String[] getBMIStatus(double[][] bmiData) {
        String[] status = new String[bmiData.length];
        for (int i = 0; i < bmiData.length; i++) {
            double bmi = bmiData[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal weight";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else if (bmi >= 30 && bmi < 35) {
                status[i] = "Obese (Class I)";
            } else if (bmi >= 35 && bmi < 40) {
                status[i] = "Obese (Class II)";
            } else if (bmi >= 40 && bmi != -1) {
                status[i] = "Obese (Class III)";
            } else {
                status[i] = "Invalid BMI";
            }
        }
        return status;
    }



    // Program 11: Quadratic Equation Roots
    public static double[] findQuadraticRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[0]; // No real roots
        }
    }






