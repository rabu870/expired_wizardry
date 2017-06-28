package com.company;

import java.util.Scanner;

public class Main {
    public static void yesno(String yn, String yes, String no){
        if(yn.equals("yes") || yn.equals("Yes")){
            System.out.println(yes);
        }
        else {
            System.out.println(no);
        }
    }
    public static void main(String[] args) {
        //misc vars:
        String answer;
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Welcome to Eli and Jack's text adventure, you idiot!\nPlease answer yes/no to yes or no questions and the question number for multiple answer questions. (For instance: Q: Buy a sword, 1. Buy a potion, 2. A: If you want to buy a sword, enter 1.)\nWe'd like to ask you a few questions. First, what's your full name? (First and last)");
        String name = consoleInput.nextLine();
        String[] parts = name.split(" ");
        String fname = parts[0];
        String lname = parts[1];
        System.out.println("Hello " + fname);
        System.out.print("Enter your age (in years): ");
        float age = consoleInput.nextFloat();
        if(age > 130){
            System.out.println("Are you sure?");
            answer = consoleInput.next();
            yesno(answer, "You are " + age + " years old", "Too bad for you.\n\nYou are " + age + " years old");
        }
        else if(age <= 0){
            System.out.println("You are from the future.");
        }
        else{
            System.out.println("You are " + age + " years old.");
        }
        System.out.print("Enter your credit card number: ");
        long credit = consoleInput.nextLong();
        int length = String.valueOf(credit).length();
        while (length < 14 || length > 16){
            System.out.print("Tsk, tsk! That is not your credit card number.\nTry again: ");
            credit = consoleInput.nextLong();
            length = String.valueOf(credit).length();
        }
        System.out.println("Correct! Let's begin!");
        try {
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println((char)27 + "[31;0mAn unauthorized source would like to use your credit card. Would you like to allow this transaction?");
        answer = consoleInput.next();
        System.out.println("Great! Access granted! $500,000 has been taken from your account. Would you like to allow another transaction?");
        answer = consoleInput.next();
        System.out.println("Great! Access granted again! $1.2e+52 has been taken from your credit account! Your bank expects you to pay it back within a month!");
        System.out.println((char)27 + "[0;0mLet's continue! ");
    }
}
