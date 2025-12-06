//25164150


public class Veloz6 {
    public static void main(String[]args){
        int maxNaturals = 100;

        long sumOfSquares = 0;
        long sum = 0;

        for(int i = 1; i <= maxNaturals; i++) {
            sumOfSquares += i * i;
            sum+= i;
        }

        long squareOfSum = sum * sum;
        long difference = squareOfSum - sumOfSquares;

        System.out.println("Difference = " + difference);



    }

    
}
//square of the sum - sum of the squares for first 100 natural numbers