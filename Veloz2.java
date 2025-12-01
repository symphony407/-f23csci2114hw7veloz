public class Veloz2 {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Please enter n.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        // ---------- Iterative Fibonacci ----------
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        if (n > 1) fibonacci[1] = 1;

        System.out.println("Iterative Fibonacci:");
        for (int i = 0; i < n; i++) {
            if (i >= 2) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            System.out.println("f[" + i + "] = " + fibonacci[i]);
        }

        // ---------- Recursive Fibonacci ----------
        System.out.println("\nRecursive Fibonacci with tracing:");
        int[] memo = new int[n];
        int result = fibonacciRec(n - 1, memo, "");
        System.out.println("Result: " + result);
    }


    // -------- Correct recursive Fibonacci method --------
    public static int fibonacciRec(int i, int[] arr, String level) {

        System.out.println(level + "f(" + i + ")");

        if (i < 2) {
            return arr[i] = i;
        }

        return arr[i] =
            fibonacciRec(i - 1, arr, level + "  ")
            + fibonacciRec(i - 2, arr, level + "  ");
    }
}


