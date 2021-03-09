package main;

public class Main {

    public static void main(String[] args) {
       System.out.println("this is my first java"); 
       System.out.println(caller(2,3));
    }

    public static int caller(int _prm1, int _prm2) {
        return (_prm1 + _prm2);
    }
}


