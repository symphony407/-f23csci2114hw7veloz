//233168

import java.util.ArrayList;

public class Veloz1 {
    public static void main(String[] args) {
        int max = 1000;
   
        ArrayList<Integer> Multiples = new ArrayList<Integer>();
        //creating an ArrayList to store multiples of 3 and 5

       
        for (int i = 1; i < max; i++){
            if(i % 3 ==0 || i % 5 ==0){
                Multiples.add(i);
            }
        }
        //summation of multiples
        int sum = 0;
        for (int num : Multiples){
            sum += num;
        }
        System.out.println("The sum of multiples of 3 and 5 below " + max + " is: " + sum);

    }
}


//If we list all the natural numbers below 10
// that are multiples of 3 or 5, we get 3,5,6 and 9. 
// The sum of these multiples is 23