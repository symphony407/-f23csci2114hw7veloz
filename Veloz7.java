//104743


public class Veloz7 {
    public static void main(String[]args) {
        System.out.println(findPrime(10001));
    }

    public static long findPrime(int n) {
        int count = 0;
        long number = 1;

        while(count < n) {
            number++;
            if(isPrime(number)) {
                count++;
            }
        }
         return number; 
    }

    public static boolean isPrime(long num) {
        if(num<2) return false;
        if(num % 2 == 0 && num != 2) return false;

        long sqrt = (long) Math.sqrt(num);
        for(long i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

