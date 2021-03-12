package main;


public class Enum {
    public static void main(String[] args) {
        Level myLevel = Level.MEDIUM;

        switch(myLevel){
            case LOW:
                System.out.println("LOW level");
                break;
            case MEDIUM:
                System.out.println("MEDIUM level");
                break;
            case HIGH:
                System.out.println("HIGH level");
                break;
        }
    }
}
enum Level {
    LOW,
    MEDIUM,
    HIGH
}
