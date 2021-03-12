package main;

import java.time.LocalDate;
import java.time.Month;
import java.sql.Date;

class Person {
   public static void main(String[] args) {
       System.out.println("this is the person Class");

       User user = new User("johnson", "kalu", 24,LocalDate.of(1999, Month.MARCH, 25));
       System.out.println(user.dob);
   } 

   static class User{ 
       String firstname;
       String lastname;
       int age;
       LocalDate dob;

        User(String firstname,String lastname, int age, LocalDate dob) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.dob = dob;
        }

    }

}
