package main;

import java.time.LocalDate;
import java.sql.Date;

class Person {
   public static void main(String[] args) {
       System.out.println("this is the person Class");


       User user = new User("johnson", "kalu", 24);
       System.out.println(user.firstname);
   } 

   static class User{ 
       String firstname;
       String lastname;
       int age;

        User(String firstname,String lastname, int age) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
        }
    }

}
