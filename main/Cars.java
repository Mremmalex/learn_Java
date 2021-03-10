package main;

public class Cars {
    public static void main(String[] args) {
        Motto motto = new Motto();
        motto.honk();
        System.out.println(motto.brand + " " + motto.pprivate());
    }
}

class Vehicle {

    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut");
    }
}

class Motto extends Vehicle {

    private String modelName = "Mustang";

    public String pprivate() {
        return modelName;    
    }

}


