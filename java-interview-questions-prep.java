import java.util.*;

////////////////////
////////// Calculate the binary gap
////////////////////

// Transform an int arguement into its binary form
// return the largest number of adjacent 0s, between 1s, in the binary result

class binGapClass {
    public static void main(String[] args) {
        System.out.println("Main method started");
        // Call the function with an int
        //binGap(1001435);
    }

    public static int binGap(int N)
    {
        // Get the binary representation
        String binResult = Integer.toBinaryString(N);
        System.out.println("Binary is " + binResult);
        // First digit will always be 1 in binary
        // Cut any ending zeros since they aren't wrapped in a "1"
        // If the binary string DOES NOT end with "1"
        if (!binResult.endsWith("1"))
        {
            // Grab the position (index) of the last 1 in the binary string
            final int i = binResult.lastIndexOf("1");
            // binResult now becomes a substring, start to the final 1 only
            binResult = binResult.substring(0, i);
        }
        // Count the longest string of consecutive 0s
        // Populate an empty result
        int result = 0;
        // Split the binary string into chunks of 0s, seperated by 1s
        String[] binBlocks = binResult.split("1");
        for (String binBlock : binBlocks)
        {
            if (binBlock.length() > result) {
                result = binBlock.length();
            }
        }
        System.out.println("Result is " + result);
        return result;   
    }
}

////////////////////
////////// Print the Fibonacci sequence
////////////////////

// Numbers that are the sum of the two numbers before them

class fibonacciClass {
    public static void main(String[] args) {
        System.out.println("Main method started");
        // Call the function with an int
        fibonacci(200);
    }

    public static void fibonacci(int max)
    {
        int a = 0;
        int b = 1;
        while (a <= max)
        {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

