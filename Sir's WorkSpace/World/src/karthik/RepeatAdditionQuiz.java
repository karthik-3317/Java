package karthik;

import java.util.Scanner;

 public class RepeatAdditionQuiz {
 public static void main(String[] args) {
 int number1 = (int)(Math.random() * 100);
 int number2 = (int)(Math.random() * 10);

 // Create a Scanner
 Scanner sc = new Scanner(System.in);

 System.out.print(
 "What is " + number1 + " - " + number2 + "? ");
 int answer = sc.nextInt();

 while (number1 - number2 != answer) {
 System.out.print("Wrong answer. Try again. What is "
+ number1 + " - " + number2 + "? ");
 answer = sc.nextInt();
 }
 System.out.println("You got it!");
 }
 }