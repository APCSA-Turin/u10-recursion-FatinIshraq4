public class mains {
   
    private static int counter;
    public static void main(String[] args) {
        int n=40;
        long startTime = System.nanoTime();
        int fibRec = fibonacci(n);
        long endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;


        startTime = System.nanoTime();
        int fibIter = fibIterative(n);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;
        System.out.println("Fibonacci(" + n + ")");

        System.out.println("Recursive: " + fibRec + " | Time: " + recursiveTime / 1e6 + " ms");
        System.out.println("Iterative: " + fibIter + " | Time: " + iterativeTime / 1e6 + " ms");

}

    private static int fibIterative(int x) {
        counter++;
        if (x<2) {return x;}
        int x1=0; int x2=1;
        for (int i=0; i<x-1; i++) {
            int t = x1+x2;
            x1=x2;
            x2=t;
        }
        return x2;
    }

    
    
        private static int fibonacci(int x) {
            counter++;
            if (x == 1) {
                return 0;
            }
            if (x == 2) {
                return 1;
            }
            // double recursive method call
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    
    
    }
    


