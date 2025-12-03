//232792560

public class Veloz5 {
    public static void main(String[]args) {
       long number = 20;

       while(true) {
        boolean divisible = true;

        for(int i = 1; i <= 20; i++) {
            if(number % i !=0) {
                divisible = false;
                break;
            }
        }
        if(divisible) {
            System.out.println("Smallest multiple:" + number);
            break;
        }
        number += 20;
       }
    
}
}
//the number must contain all the prime factors needed to cover every number from 1-20
//all primes from 1-20: 2,3,5,7,11,13,17,19
//need to find the highest power of each number < 20 and multiply all of them together

