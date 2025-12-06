//137846528820
import java.math.BigInteger;
public class Veloz15 {
    public static void main(String[]args) {
        int n  = 40;
        int k = 20;

        BigInteger result = binomial(n,k);

        System.out.println("Number of routes:" + result);
    }

    public static BigInteger binomial(int n, int k) {
        return factorial(n).divide( factorial(k).multiply(factorial(n-k)));
    }
    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;

        for(int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
    
}



//Starting in the top left corner of a 2 ×2 grid, and only being able to move to the right and down,
//  there are exactly 6 routes to the bottom right corner.
//How many such routes are there through a 20 ×20 grid?