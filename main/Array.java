package main;
import java.util.Arrays;
public class Array{

    public static void main(String[] args) {
        String[] users = { "jenifer", "goodlock", "kalu", "esther" };

        // System.out.println(users[2]); 

        //changing the value of an array 
        //
        users[2] = "blessing";        
        System.out.println(Arrays.toString(users)); 

        //getting array length
        System.out.println(users.length);


        //looping through an array
        //
        for (int i = 0; i < users.length; i++){

            System.out.println(users[i]+"\n");
        }
        
        // looping with foreach 
        
        for (String i : users) {

            System.out.println(i);  
        }

        // multi dimenssional arries 
        int[][] vector = { { 1, 3, 4, 5 }, { 5, 6, 7, 8, 8 } };
        int x = vector[0][3];
        System.out.println(x);
        
        System.out.println();

        for (int i = 0; i < vector.length; i++) {
            for(int j = 0; j < vector[i].length; j++) {
                System.out.println(vector[i][j]);
            }

        }

    }

}
