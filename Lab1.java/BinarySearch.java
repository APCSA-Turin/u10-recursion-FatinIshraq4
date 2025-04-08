public class BinarySearch {

    private static int counter = -1;
    private static int loopCounter = 0;
    // RECURSIVE IMPLEMENTATION
    public static int recursiveBinarySearch(int[] elements, int lowPosition, int highPosition, int target) {
        counter++;
        if (lowPosition > highPosition) {
            //System.out.println(counter);
            return -1;  // base case: target was not found, return -1
        } else {
            int midPosition = (lowPosition + highPosition) / 2;

            if (elements[midPosition] < target) {
                //Recursive Call 1                           
                return recursiveBinarySearch(elements, midPosition+1, highPosition, target);
            } else if (elements[midPosition] > target) {
                //Recursive Call 2
                return recursiveBinarySearch(elements, lowPosition, midPosition-1, target);
            } else {
                // otherwise, target found, return that index
                //System.out.println(counter);
                return midPosition;
            }
        }
    }

    // ITERATIVE, NON-RECURSIVE IMPLEMENTATION -- FOR COMPARISON
    public static int iterativeNonRecursiveBinarySearch(int[] elements, int target) {
        int lowPosition = 0;
        int highPosition = elements.length - 1;

        while (lowPosition <= highPosition) {
            int midPosition = (lowPosition + highPosition) / 2;

            if (elements[midPosition] < target) {
                loopCounter++;
                lowPosition = midPosition + 1;
            } else if (elements[midPosition] > target) {
                loopCounter++;
                highPosition = midPosition - 1;
            } else {
                // else, target found, return its index
                //System.err.println(loopCounter);
                return midPosition;
            }
        }
        // target was not found, return -1
        //System.err.println(loopCounter);
        return -1;
    }
}



