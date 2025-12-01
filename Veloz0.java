import java.util.ArrayList;

public class Veloz0 {
    public static void main(String[] args) {
        int max = 516000;
        double count = Math.sqrt(max);

        ArrayList<Integer> Oddsquares = new ArrayList<Integer>();

        for (int n = 1; n <= count; n+=2){
            int square = n*n;
            Oddsquares.add(square);
                
            }
            //System.out.println(i*i);
            System.out.println(Oddsquares);
            
        }

        }
    

