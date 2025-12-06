////4613732
public class Veloz2 {
    public static void main(String[] args) {
        int limit = 4000000;
        long sum = 0;
        
        int a = 1;   
        int b = 2;  
        
        if (b <= limit && b % 2 == 0) {
            sum += b;
        }
        
        while (true) {
            int next = a + b;
            if (next > limit) {
                break;
            }
            if (next % 2 == 0) {
                sum += next;
            }
            a = b;
            b = next;
        }
        
        System.out.println("Sum of even-valued Fibonacci terms up to " + limit + ": " + sum);
    }
}


