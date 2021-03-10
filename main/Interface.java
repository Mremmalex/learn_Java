package main;


public class Interface {

    public static void main(String[] args) {
        System.out.println("working more on java");

        PPerson person = new PPerson();
        person.DisplayName("jenifer");
        int id = person.CheckID(45);
        System.out.println(id);

    }

}


interface Users {

    public void DisplayName(String name);

    public int CheckID(int id);
}


class PPerson implements Users{
       
    public void DisplayName(String name) {
        System.out.println(name);
    }

    public int CheckID(int id){
        return id++;
    }
}
