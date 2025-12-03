//The prime factors of 13195 are 5,7,13 and 29.
//What is the largest prime factor of the number 600851475143?

public class Veloz3 {
    public static void main(String[] args){
        Long number = 600851475143L;
        Long largestPrimeFactor = 0L;

        //Divide by 2 repeatedly
        while (number % 2 == 0) {
            largestPrimeFactor = 2L;
            number = number / 2;
        }
        
        // Now divide by odd numbers starting from 3
        for (Long i = 3L; i * i <= number; i += 2) {
            while (number % i == 0) {
                largestPrimeFactor = i;
                number = number / i;
            }
        }
        
        // If number is still > 1, then it's a prime factor
        if (number > 1) {
            largestPrimeFactor = number;
        }
        
        System.out.println("Largest prime factor: " + largestPrimeFactor);
    }
    
}
