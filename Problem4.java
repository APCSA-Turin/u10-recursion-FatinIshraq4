public class Problem4 {
    public static void main(String [] args) {
        recursiveMethod(0);
    }

    public static void recursiveMethod(int n) {
        System.out.println("Called, n = " + n);
        if (n > 2) {
            recursiveMethod(n + 1);
        }
        System.out.println("Ended, n = " + n);
    }
}
