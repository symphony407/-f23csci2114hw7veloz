//Largest Palindrome is 906609=913*993

public class Veloz4 {
    public static void main(String[]args) {
        int largestPalindrome = 0;
        int number1 = 0;
        int number2 = 0;

        //iterating through every three digit integer 100-999
        for (int i = 100; i < 999; i++) {
            for(int j = 100; j < 999; j++) {
                int product = i * j;
            
        
        if(checkPalindrome(product) && product>largestPalindrome) {
            largestPalindrome = product;
            number1 = i;
            number2 = j;
        }
         }
    }
    System.out.println("Largest Palindrome is" + " " + largestPalindrome + "=" + number1 + "*" + number2);
        
    }

    //method to check if the number is a palindrome
private static boolean checkPalindrome(int number) {
    String s = Integer.toString(number);
    String reversed = new StringBuilder(s).reverse().toString();
    return s.equals(reversed);

}
    
}


