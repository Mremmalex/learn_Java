package main;

import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Your Username");


        String username = myObj.nextLine();

        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        System.out.println("Username is : "+ username);
        System.out.println("Age is : "+ age);
        System.out.println("Salary is : " + salary);

        myObj.close();

    }
}
