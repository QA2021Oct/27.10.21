package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // question 5:
        /*System.out.println("Enter number units: ");
        int unit = s.nextInt();
        int amount = 0;
                                          //  unit = 150 -
        // unit < 100   -->  0
        if (unit <= 100){
            amount = 0;
        }
        // 100 < unit < 200   --> unit-100 - *5
        else if (unit > 100 && unit <= 200 ){
            amount = (unit-100) * 5;  //
        }
        // unit > 200  --> unit-200  - *10
        else{
            amount = 500 + (unit -200) *10;   // 210 --> 100 = 0. 100 * 5 = 500. 10 * 10
        }

        System.out.println("Total Amount price: " + amount);*/


        // question 4:
        /*System.out.println("enter a number between 100-1000: ");
        int number = s.nextInt();

        int lastNum = number % 10; // 182 % 10 = 2   -->  182/10=18.2
        System.out.println("Last digit of number is: " + lastNum);

        if (lastNum % 3 == 0 ){
            System.out.println("Last digit of number divided by 3 without remnant");
        }else{
            System.out.println("Last digit of number not divided by 3 without remnant");
        }*/

        // question 3:
       /* System.out.println("your temperature?");
        double temp = s.nextDouble();

        if (temp > 38.5 && temp < 40){  // &&
            System.out.println("you have a fever take Akamol");
        }else if(temp < 38.5 && temp > 35){  // &&
            System.out.println("you are OK!");
        }else
        {
            System.out.println("OMG go to the Doctor!");
        }*/

        // Question 2:
        /*String sunday = "Sunday fun day";
        String monday = "Monday good day";
        String tuesday = "tuesday Ki Tov";
        String wednesday = "wednesday is middle day";
        String thursday = "thursday weekend is coming";
        String friday = "friday Kiddush";
        String saturday = "saturday resting";

        System.out.println("Enter a number: ");
        int day = s.nextInt();

        if(day == 1){ //אם
            System.out.println(sunday);
        }
        else if (day == 2){ //אחרת אם
            System.out.println(monday);
        }
        else if (day == 3){ // אם אחאת
            System.out.println(tuesday);
        }
        else if (day ==4){
            System.out.println(wednesday);
        }
        else if (day == 5){
            System.out.println(thursday);
        }
        else if (day == 6){
            System.out.println(friday);
        }
        else if (day == 7){
            System.out.println(saturday);
        }else {  // אחרת
            System.out.println("not valid number");
        }*/

        // question 1:
        /*System.out.println("did you wash your hands?");
        boolean washHands = s.nextBoolean(); // true / false
        System.out.println("did you order your meal?");
        boolean orderMeal = s.nextBoolean();

        if (washHands == true && orderMeal == true){  // || - bad code!
            System.out.println("good eat");
        }else {
            System.out.println("order meal or wash your Hands");
        }*/

        // if inside if - complicated
        /*if(washHands == true){
            if(orderMeal == true){
                System.out.println("Yoffi go to eat!");
            }
            System.out.println("boo go to order meal!");
        }
        else{
            System.out.println("boo go wash your hans And order meal!");
        }
    }*/

         /* // if basic example:
	    int name = 80;
        String myString = "Hello";
        float myFloat = 8.258f;


        System.out.println("Enter a number");
        int number = s.nextInt();

         if (number > 0) {
            System.out.println("Positive number");
            System.out.println("Hey");
        }else {
             System.out.println("number negative");
         }*/

    }
}
