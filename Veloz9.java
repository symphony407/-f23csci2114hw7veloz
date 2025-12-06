//31875000

public class Veloz9 {
    public static void main (String[]args) {

        for(int a = 1; a < 1000; a++){
            for(int b = a + 1; b < 1000; b++) {
                    int c = 1000 - a - b;

                    if (c > b && a * a + b * b == c * c) {
                        long product = (long) a * b * c;

                        System.out.println("a = " + a);
                        System.out.println("b = " + b);
                        System.out.println("c = " + c);
                        System.out.println("Product = " + product);
                        return;
                    }
                }
            }
        }




    }

    


//A Pythagorean triplet is a set of three natural numbers, 𝑎 <𝑏 <𝑐, for which,
//𝑎2+𝑏2=𝑐2.
//For example, 32 +42 =9 +16 =25 =52.
//There exists exactly one Pythagorean triplet for which 𝑎 +𝑏 +𝑐 =1000.
//Find the product 𝑎⁢𝑏⁢𝑐.