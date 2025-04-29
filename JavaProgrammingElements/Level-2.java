1. import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(&quot;Enter number1: &quot;);
        int number1 = scanner.nextInt();
        System.out.print(&quot;Enter number2: &quot;);
        int number2 = scanner.nextInt();
        if (number2 == 0) {
            System.out.println(&quot;Cannot divide by zero.&quot;);
        } else {
            int quotient = number1 / number2;
            int remainder = number1 % number2;
            System.out.printf(&quot;The Quotient is %d and Reminder is %d of two numbers %d
            and %d%n&quot;, quotient, remainder, number1, number2); }
        scanner.close();
    }
}
2. import java.util.Scanner;

public class IntOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(&quot;Enter value for a: &quot;);
        int a = scanner.nextInt();
        System.out.print(&quot;Enter value for b: &quot;);
        int b = scanner.nextInt();
        System.out.print(&quot;Enter value for c: &quot;);
        int c = scanner.nextInt();
        System.out.println(&quot;a + b * c = &quot; + (a + b * c));
        System.out.println(&quot;a * b + c = &quot; + (a * b + c));
        if (b != 0) {

            System.out.println(&quot;c + a / b = &quot; + (c + a / b));
            System.out.println(&quot;a % b + c = &quot; + (a % b + c));
        } else {
            System.out.println(&quot;Cannot perform division/modulus with b = 0&quot;);
        }
        scanner.close();
    }
}
3. Similar as 2.
        4. import java.util.Scanner;
public class Temperature{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int temp = s.nextInt();
        s.close();
        System.out.println((temp * 9/5) + 32);
    }
}
5. import java.util.Scanner;
public class TemperatureConversionFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(&quot;Enter temperature in Fahrenheit: &quot;);
        double fahrenheit = scanner.nextDouble();
        double celsiusResult = (fahrenheit - 32.0) * 5.0 / 9.0;
        System.out.printf(&quot;The %.2f fahrenheit is %.2f celsius%n&quot;, fahrenheit,
                celsiusResult);
        scanner.close();
    }
}
6. import java.util.Scanner;
public class TotalIncome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(&quot;Enter salary (INR): &quot;);
        double salary = scanner.nextDouble();
        System.out.print(&quot;Enter bonus (INR): &quot;);
        double bonus = scanner.nextDouble();
        double totalIncome = salary + bonus;
        System.out.printf(&quot;The salary is INR %.2f and bonus is INR %.2f. Hence Total
        Income is INR %.2f%n&quot;, bonus, totalIncome);
        scanner.close();
    }
}
7. import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a+ &quot; &quot; + b);
    }
}
8. same as question 2.
        9. import java.util.Scanner;
public class TriangularParkRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(&quot;Enter side1 (meters): &quot;);
        double side1 = scanner.nextDouble();

        System.out.print(&quot;Enter side2 (meters): &quot;);
        double side2 = scanner.nextDouble();
        System.out.print(&quot;Enter side3 (meters): &quot;);
        double side3 = scanner.nextDouble();
        double perimeter = side1 + side2 + side3;
        double totalDistanceKm = 5.0;
        double totalDistanceMeters = totalDistanceKm * 1000.0;
        double rounds = totalDistanceMeters / perimeter;
        System.out.printf(&quot;The total number of rounds the athlete will run is %.2f to
        complete 5 km%n&quot;, rounds);
        scanner.close();
    }
}
10. import java.util.Scanner;
public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(&quot;Enter the number of chocolates: &quot;);
        int numberOfChocolates = scanner.nextInt();
        System.out.print(&quot;Enter the number of children: &quot;);
        int numberOfChildren = scanner.nextInt();
        if (numberOfChildren == 0) {
            System.out.println(&quot;Cannot divide chocolates among zero children.&quot;);
        } else {
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;
            System.out.printf(&quot;The number of chocolates each child gets is %d and the
            number of remaining chocolates are %d%n&quot;,
            chocolatesPerChild, remainingChocolates);
        }
        scanner.close();
    }
}
11. import java.util.Scanner;

public class Si{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println(&quot;Enter the Principal value: &quot;);
        int p = s.nextInt();
        System.out.println(&quot;Enter the rate value: &quot;);
        int r = s.nextInt();
        System.out.println(&quot;Enter the time: &quot;);
        int t = s.nextInt();
        s.close();
        float si = (p+r+t)/100;
        System.out.println(&quot;Simple Intrest value: &quot; + si );
    }
}
12. import java.util.Scanner;
public class KgToPounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(&quot;Enter weight in kilograms: &quot;);
        double kilograms = scanner.nextDouble();
        double pounds = kilograms * 2.20462;
        System.out.printf(&quot;%.2f kilograms is equal to %.2f pounds%n&quot;, kilograms, pounds);
        scanner.close();
    }
}