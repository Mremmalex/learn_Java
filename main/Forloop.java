package main;


public class Forloop {
    
    public static void main(String[] args) {
        // for loop 
        // for (int i = 0; i < 5; i++) {
        //  System.out.println(i);
        // }
        //looping over an array 

        String[] cars = { "bmw", "volvo", "ford", "mazda" };

        for (String i : cars) {
           System.out.println(i); 
        }

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

    }

}
