package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int studentAge = 24; //this shows int which is the data type and it is primitive. It shows the label which is studentAge and the value which is 24.
        double studentGPA = 3.45;

        boolean hasPerfectAttendance = true;

        String studentFirstName = "James";
        String studentLastName = "Shoemaker";
        char studentFirstInitial = studentFirstName.charAt(0); //using char allows us to pick a character from the string. Using the studentFirstName with .charAt allows us to specify which index we want to choose for the character.
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update the GPA to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + "now has a GPA of " + studentGPA);


    }
}
