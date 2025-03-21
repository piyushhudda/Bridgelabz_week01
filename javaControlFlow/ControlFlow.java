 1
import java.util.Scanner;
public class Controlflow{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int num = s.nextInt();
if(num%5 == 0){
System.out.println(&quot;the number &quot; + num + &quot; is divisible by 5 &quot;);
}
else{
System.out.println(&quot;the number &quot; + num + &quot; is not divisible by 5 &quot;);
}
s.close();
}
}


2
import java .util.Scanner;
public class Controlflow{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int num1 = s.nextInt();
int num2 = s.nextInt();
int num3 = s.nextInt();
if (num1&lt;num2 &amp;&amp; num1&lt;num3){
System.out.println(&quot; Yes the first number the smallest&quot;);
}
else{
System.out.println(&quot; No the first number is not the smallest&quot;);
}

boolean check = (num1&lt;num2 &amp;&amp; num1&lt;num3);
System.out.println(check);
s.close();
}
}


3
import java.util.Scanner;
public class Controlflow{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int num1 = s.nextInt();
int num2 = s.nextInt();
int num3 = s.nextInt();
boolean check1 = (num1&gt;num2 &amp;&amp; num1&gt;num3);
System.out.println(&quot;Is the first number the largest: &quot; + check1);
boolean check2 = (num2&gt;num1 &amp;&amp; num2&gt;num3);
System.out.println(&quot;Is the second number the largest: &quot; + check2);
boolean check3 = (num3&gt;num1 &amp;&amp; num3&gt;num2);
System.out.println(&quot;Is the third number the largest: &quot; + check3);
s.close();
}
}


4
import java.util.Scanner;
public class Controlflow{
public static void main(String[] args){

Scanner s = new Scanner(System.in);
int num1 = s.nextInt();
if (num1&lt;0) {
System.out.println(&quot;The number &quot; + num1 + &quot; is not a natural number &quot;);
}
else {
int sum = num1 * (num1+1) / 2;
System.out.println(&quot;The sum of &quot; + num1 + &quot; natural numbers is &quot; + sum);
}
s.close();
}
}


 5
import java.util.Scanner;
public class Controlflow{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int age = s.nextInt();
if(age&gt;=18){
System.out.println(&quot;The person&#39;s age is &quot; + age + &quot; and can vote &quot;);
}
else{
System.out.println(&quot;The person&#39;s age is &quot; + age + &quot; and cannot vote &quot;);
}
s.close();
}
}


6
import java.util.Scanner;
public class Controlflow{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int num = s.nextInt();
if (num&gt;0){
System.out.println(&quot;Positive&quot;);
}
if (num==0){
System.out.println(&quot;Zero&quot;);
}
if (num&lt;0){
System.out.println(&quot;Negative&quot;);
}
s.close();
}
}


 7
import java .util.Scanner;
public class Controlflow{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int num1 = s.nextInt();
int num2 = s.nextInt();
if ((num1 == 3 || num1 == 4 || num1 == 5 || num1 == 6) &amp;&amp; num2 &lt; 31 ){
System.out.println(&quot; Its a spring Season &quot;);
}
else if (num2 &gt; 31 || num2 &lt; 0 ) {

System.out.println(&quot; Error &quot;);
}
else{
System.out.println(&quot; Its not a spring Season &quot;);
}
s.close();
}
}


8
import java .util.Scanner;
public class Controlflow{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int num1 = s.nextInt();
while ( num1 != 0 ) {
System.out.println(num1);
num1 = num1-1;
}
s.close();
}
}


9
import java .util.Scanner;
public class Controlflow{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int num1 = s.nextInt();

for (int i = num1 ; i &gt; 0 ; i-- ) {
System.out.println(i);
}
s.close();
}
}


10
import java .util.Scanner;
public class Controlflow{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
double num = s.nextDouble();
double total = 0.0;
while (num != 0) {
total = total + num;
System.out.println(&quot;Enter the number: &quot;);
num = s.nextDouble();
}
s.close();
System.out.println(total);
}
}


11
import java .util.Scanner;
public class Controlflow{
public static void main(String[] args){
Scanner s = new Scanner(System.in);

double num = s.nextDouble();
double total = 0.0;
while (num != 0) {
total = total + num;
System.out.println(&quot;Enter the number: &quot;);
num = s.nextDouble();
if(num &lt; 0){
break;
}
}
s.close();
System.out.println(total);
}
}


12
import java .util.Scanner;
public class Controlflow{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
double num = s.nextDouble();
double result = num*(num+1)/2;
double total = 0.0;
while (num!=0) {
total = total+num;
num = num - 1;
}
if (result==total){
System.out.println(&quot;RIGHT &quot; + total);
}

else {
System.out.println(&quot;Not Correct&quot;);
}
}
}


13
import java .util.Scanner;
public class Controlflow{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
double num = s.nextDouble();
double result = num*(num+1)/2;
double total = 0.0;
for (int i = 0; i &lt;= num; i++){
total = total + i ;
}
if (result==total){
System.out.println(&quot;RIGHT &quot; + total);
}
else {
System.out.println(&quot;Not Correct&quot;);
}
}
}


14
import java .util.Scanner;
public class Controlflow{

public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int fact = 1;
while(n!=0){
fact = fact * n;
n = n - 1;
}
System.out.println(fact);
}
}


 15
import java .util.Scanner;
public class Controlflow{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int fact = 1;
for (int i = n; i &gt; 0; i--){
fact = fact * i;
}
System.out.println(fact);
}
}


16
import java .util.Scanner;
public class Controlflow{

public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n = s.nextInt();
for (int i = 1 ; i &lt; n; i++){
if(i%2==0){
System.out.println( i + &quot; Even &quot;);
}
else {
System.out.println( i + &quot; Odd &quot;);
}
}
}
}


 17
import java.util.Scanner;
public class Controlflow {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter employee&#39;s salary: &quot;);
double salary = scanner.nextDouble();
System.out.print(&quot;Enter employee&#39;s years of service: &quot;);
int yearsOfService = scanner.nextInt();
if (yearsOfService &gt; 5) {
double bonusAmount = salary * 0.05; // 5% bonus
System.out.printf(&quot;Bonus amount: %.2f%n&quot;, bonusAmount);
} else {
System.out.println(&quot;Employee is not eligible for a bonus.&quot;);
}
scanner.close();

}
}

18
import java.util.Scanner;
public class Controlflow{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(&quot;Enter a number: &quot;);
        int number = scanner.nextInt();
        System.out.println(&quot;Multiplication table of &quot; + number + &quot; from 6 to 9:&quot;);
        for (int i = 6; i &lt;= 9; i++) {
            System.out.printf(&quot;%d * %d = %d%n&quot;, number, i, number * i);
        }
        scanner.close();
    }
}

// LEVEL - 2

 1
         import java.util.Scanner;

 public class OddEvenNumbers {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print(&quot;Enter a natural number: &quot;);
         int number = scanner.nextInt();

         if (number &lt; 1) {
             System.out.println(&quot;Please enter a natural number greater than 0.&quot;);
         } else {
             for (int i = 1; i &lt;= number; i++) {
                 if (i % 2 == 0) {
                     System.out.println(i + &quot; is an even number.&quot;);
                 } else {
                     System.out.println(i + &quot; is an odd number.&quot;);
                 }
             }
         }
         scanner.close();
     }
 }

2
        import java.util.Scanner;

 public class EmployeeBonus {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print(&quot;Enter the salary: &quot;);
         double salary = scanner.nextDouble();
         System.out.print(&quot;Enter years of service: &quot;);
         int yearsOfService = scanner.nextInt();

         double bonus = 0;
         if (yearsOfService &gt; 5) {
             bonus = salary * 0.05;
         }
         System.out.println(&quot;Bonus amount: &quot; + bonus);
         scanner.close();
     }
 }

 3
         import java.util.Scanner;

 public class MultiplicationTable {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print(&quot;Enter a number: &quot;);
         int number = scanner.nextInt();

         for (int i = 6; i &lt;= 9; i++) {
             System.out.println(number + &quot; * &quot; + i + &quot; = &quot; + (number * i));
         }
         scanner.close();
     }
 }

 4
         import java.util.Scanner;

 public class FizzBuzz {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print(&quot;Enter a positive integer: &quot;);
         int number = scanner.nextInt();

         if (number &gt; 0) {
             for (int i = 1; i &lt;= number; i++) {
                 if (i % 3 == 0 &amp;&amp; i % 5 == 0) {
                     System.out.println(&quot;FizzBuzz&quot;);
                 } else if (i % 3 == 0) {
                     System.out.println(&quot;Fizz&quot;);
                 } else if (i % 5 == 0) {
                     System.out.println(&quot;Buzz&quot;);
                 } else {
                     System.out.println(i);
                 }
             }
         } else {
             System.out.println(&quot;Please enter a positive integer.&quot;);
         }
         scanner.close();
     }
 }

 5
         import java.util.Scanner;

 public class FizzBuzzWhile {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print(&quot;Enter a positive integer: &quot;);
         int number = scanner.nextInt();

         if (number &gt; 0) {
             int i = 1;
             while (i &lt;= number) {
                 if (i % 3 == 0 &amp;&amp; i % 5 == 0) {
                     System.out.println(&quot;FizzBuzz&quot;);

                 } else if (i % 3 == 0) {
                     System.out.println(&quot;Fizz&quot;);
                 } else if (i % 5 == 0) {
                     System.out.println(&quot;Buzz&quot;);
                 } else {
                     System.out.println(i);
                 }
                 i++;
             }
         } else {
             System.out.println(&quot;Please enter a positive integer.&quot;);
         }
         scanner.close();
     }
 }

 6
         import java.util.Scanner;

 public class YoungestTallestFriend {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print(&quot;Enter age of Amar: &quot;);
         int ageAmar = scanner.nextInt();
         System.out.print(&quot;Enter height of Amar: &quot;);
         double heightAmar = scanner.nextDouble();

         System.out.print(&quot;Enter age of Akbar: &quot;);
         int ageAkbar = scanner.nextInt();
         System.out.print(&quot;Enter height of Akbar: &quot;);
         double heightAkbar = scanner.nextDouble();

         System.out.print(&quot;Enter age of Anthony: &quot;);
         int ageAnthony = scanner.nextInt();
         System.out.print(&quot;Enter height of Anthony: &quot;);
         double heightAnthony = scanner.nextDouble();

// Finding youngest friend
         int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
         String youngestFriend = (youngestAge == ageAmar) ? &quot;Amar&quot; : (youngestAge == ageAkbar) ?
                 &quot;Akbar&quot; : &quot;Anthony&quot;;

// Finding tallest friend
         double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
         String tallestFriend = (tallestHeight == heightAmar) ? &quot;Amar&quot; : (tallestHeight == heightAkbar) ?
                 &quot;Akbar&quot; : &quot;Anthony&quot;;

         System.out.println(&quot;Youngest friend: &quot; + youngestFriend + &quot; (Age: &quot; + youngestAge + &quot;)&quot;);
         System.out.println(&quot;Tallest friend: &quot; + tallestFriend + &quot; (Height: &quot; + tallestHeight + &quot;)&quot;);

         scanner.close();
     }
 }

 7
         import java.util.Scanner;

 public class FactorsOfNumber {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print(&quot;Enter a positive integer: &quot;);
         int number = scanner.nextInt();

         if (number &gt; 0) {
             System.out.println(&quot;Factors of &quot; + number + &quot; are:&quot;);
             for (int i = 1; i &lt; number; i++) {

                 if (number % i == 0) {
                     System.out.println(i);
                 }
             }
         } else {
             System.out.println(&quot;Please enter a positive integer.&quot;);
         }
         scanner.close();
     }
 }

 8
         import java.util.Scanner;

 public class FactorsOfNumberWhile {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print(&quot;Enter a positive integer: &quot;);
         int number = scanner.nextInt();

         if (number &gt; 0) {
             int i = 1;
             System.out.println(&quot;Factors of &quot; + number + &quot; are:&quot;);
             while (i &lt; number) {
                 if (number % i == 0) {
                     System.out.println(i);
                 }
                 i++;
             }
         } else {
             System.out.println(&quot;Please enter a positive integer.&quot;);
         }
         scanner.close();

     }
 }

 9
         import java.util.Scanner;

 public class PowerOfNumberWhile {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print(&quot;Enter the base number (positive integer): &quot;);
         int number = scanner.nextInt();
         System.out.print(&quot;Enter the power (positive integer): &quot;);
         int power = scanner.nextInt();

         if (number &gt; 0 &amp;&amp; power &gt;= 0) {
             int result = 1;
             int counter = 0;

             while (counter &lt; power) {
                 result *= number;
                 counter++;
             }
             System.out.println(number + &quot; raised to the power of &quot; + power + &quot; is: &quot; + result);
         } else {
             System.out.println(&quot;Please enter positive integers.&quot;);
         }
         scanner.close();
     }
 }

// LEVEL-3

 1
         import java.util.Scanner;

 public class LeapYear {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print(&quot;Enter a year (year &gt;= 1582): &quot;);
         int year = scanner.nextInt();

         if (year &lt; 1582) {
             System.out.println(&quot;Year should be &gt;= 1582.&quot;);
         } else {
             if ((year % 4 == 0 &amp;&amp; year % 100 != 0) || (year % 400 == 0)) {
                 System.out.println(year + &quot; is a Leap Year.&quot;);
             } else {
                 System.out.println(year + &quot; is not a Leap Year.&quot;);
             }
         }
         scanner.close();
     }
 }

 2
         import java.util.Scanner;

 public class LeapYearSingleIf {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print(&quot;Enter a year (year &gt;= 1582): &quot;);
         int year = scanner.nextInt();

         if (year &gt;= 1582 &amp;&amp; ((year % 4 == 0 &amp;&amp; year % 100 != 0) || (year % 400 == 0))) {
             System.out.println(year + &quot; is a Leap Year.&quot;);
         } else if (year &gt;= 1582) {

             System.out.println(year + &quot; is not a Leap Year.&quot;);
         } else {
             System.out.println(&quot;Year should be &gt;= 1582.&quot;);
         }
         scanner.close();
     }
 }

 3
         import java.util.Scanner;

 public class AverageMarksGrade {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print(&quot;Enter marks for Physics: &quot;);
         double physics = scanner.nextDouble();

         System.out.print(&quot;Enter marks for Chemistry: &quot;);
         double chemistry = scanner.nextDouble();

         System.out.print(&quot;Enter marks for Maths: &quot;);
         double maths = scanner.nextDouble();

         double total = physics + chemistry + maths;
         double average = total / 3;

         String grade;
         if (average &gt;= 90) {
             grade = &quot;A&quot;;
         } else if (average &gt;= 80) {
             grade = &quot;B&quot;;
         } else if (average &gt;= 70) {

             grade = &quot;C&quot;;
         } else if (average &gt;= 60) {
             grade = &quot;D&quot;;
         } else {
             grade = &quot;F&quot;;
         }

         System.out.printf(&quot;Average Marks: %.2f\n&quot;, average);
         System.out.println(&quot;Grade: &quot; + grade);

         scanner.close();
     }
 }

 4
         import java.util.Scanner;

 public class PrimeNumber {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print(&quot;Enter a number greater than 1: &quot;);
         int number = scanner.nextInt();

         boolean isPrime = number &gt; 1; // Assume number is prime unless proven otherwise

         if (number &lt;= 1) {
             isPrime = false;
         } else {
             for (int i = 2; i &lt;= Math.sqrt(number); i++) {
                 if (number % i == 0) {
                     isPrime = false;
                     break;
                 }

             }
         }

         if (isPrime) {
             System.out.println(number + &quot; is a Prime number.&quot;);
         } else {
             System.out.println(number + &quot; is not a Prime number.&quot;);
         }

         scanner.close();
     }
 }

 5
         import java.util.Scanner;

 public class ArmstrongNumber {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print(&quot;Enter a number: &quot;);
         int number = scanner.nextInt();

         int originalNumber = number;
         int sum = 0;

         while (originalNumber != 0) {
             int digit = originalNumber % 10;
             sum += Math.pow(digit, 3); // Cube of the digit
             originalNumber /= 10; // Remove the last digit
         }

         if (sum == number) {
             System.out.println(number + &quot; is an Armstrong number.&quot;);

         } else {
             System.out.println(number + &quot; is not an Armstrong number.&quot;);
         }

         scanner.close();
     }
 }

 6
         import java.util.Scanner;

 public class BMI {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print(&quot;Enter weight in kg: &quot;);
         double weight = scanner.nextDouble();
         System.out.print(&quot;Enter height in cm: &quot;);
         double heightCm = scanner.nextDouble();

         double heightM = heightCm / 100; // Convert cm to meters
         double bmi = weight / (heightM * heightM); // Calculate BMI

         System.out.printf(&quot;Your BMI is: %.2f\n&quot;, bmi);

         String status;
         if (bmi &lt; 18.5) {
             status = &quot;Underweight&quot;;
         } else if (bmi &lt; 24.9) {
             status = &quot;Normal weight&quot;;
         } else if (bmi &lt; 29.9) {
             status = &quot;Overweight&quot;;
         } else {
             status = &quot;Obesity&quot;;

         }
         System.out.println(&quot;Weight status: &quot; + status);

         scanner.close();
     }
 }

 7
         import java.util.Scanner;

 public class Calculator {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print(&quot;Enter first number: &quot;);
         double first = scanner.nextDouble();
         System.out.print(&quot;Enter second number: &quot;);
         double second = scanner.nextDouble();
         System.out.print(&quot;Enter an operator (+, -, *, /): &quot;);
         String op = scanner.next();

         switch (op) {
             case &quot;+&quot;:
                 System.out.println(&quot;Result: &quot; + (first + second));
                 break;
             case &quot;-&quot;:
                 System.out.println(&quot;Result: &quot; + (first - second));
                 break;
             case &quot;*&quot;:
                 System.out.println(&quot;Result: &quot; + (first * second));
                 break;
             case &quot;/&quot;:
                 if (second != 0) {

                     System.out.println(&quot;Result: &quot; + (first / second));
                 } else {
                     System.out.println(&quot;Cannot divide by zero.&quot;);
                 }
                 break;
             default:
                 System.out.println(&quot;Invalid Operator.&quot;);
                 break;
         }

         scanner.close();
     }
 }