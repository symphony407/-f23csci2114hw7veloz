//142913828922

public class Veloz10 {
    public static void main(String[]args) {

    int max = 2_000_000;
    boolean[] isPrime = new boolean[max];

    for(int i = 2; i < max; i++) {
        isPrime[i] = true;
    }

    for(int p = 2; p * p < max; p++) {
        if(isPrime[p]) {

            for(int multiple = p * p; multiple < max; multiple += p) {
                isPrime[multiple] = false;
            }
        }
    }
    
    long sum = 0;
    for(int i = 2; i < max; i++) {
        if(isPrime[i]) sum += i;
    }

    System.out.println(sum);
    }
    
}

//The sum of the primes below 10 is 2 +3 +5 +7 =17.
//Find the sum of all the primes below two million.
