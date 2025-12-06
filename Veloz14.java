//837799
public class Veloz14 {
    
        private static final int LIMIT = 1_000_000;
        private static final int[] cache = new int[LIMIT + 1];

    public static void main(String[]args) {

        int maxStart = 1;
        int maxLength = 1;

        cache [1] = 1;

        for(int i = 2; i < LIMIT; i++) {
            int length = chainLength(i);

            if(length > maxLength){
                maxLength = length;
                maxStart = i;
            }
    }
        
        System.out.println("The starting number under one million that has the longest chain is: " + maxStart);
        System.out.println("Length of the chain " + maxLength);

    }

        private static int chainLength(long n) {

        if(n <= LIMIT && cache[(int) n] != 0) {
            return cache[(int) n];
        }

        long next;
        if(n % 2 == 0) {
            next = n / 2;
        }else{
            next = 3 * n + 1;
        }
        int length = 1 + chainLength(next);

        if(n <= LIMIT) {
            cache[(int) n] = length;
        }
        return length;
        }
        
    }
    


//The following iterative sequence is defined for the set of positive integers:
//𝑛 →𝑛/2 (𝑛 is even)
//𝑛 →3⁢𝑛 +1 (𝑛 is odd)
//Using the rule above and starting with 13, we generate the following sequence:
//13→40→20→10→5→16→8→4→2→1.
//It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
//Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//Which starting number, under one million, produces the longest chain?
//NOTE: Once the chain starts the terms are allowed to go above one million.