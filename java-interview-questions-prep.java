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

    public static void fibonacci(int max) {
        int a = 0;
        int b = 1;
        while (a <= max) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

////////////////////
////////// Calling from an Array in Java
////////////////////

// Initialise empty array, add random numbers to it and call them

class randomNumbers {
    public static void main(String[] args) {
        System.out.println("Main method started");
        // Call the function with an int
        randomNumber(30);
    }

    public static void randomNumber(int max) {
        int randoms[] = new int[max];
        Random rand = new Random();
        for (int i = 0; i < max; i++) {
            randoms[i] = rand.nextInt(100);
            System.out.println(i + " = " + randoms[i]);
        }
    }
}

////////////////////
////////// Rotate an array
////////////////////

// Pass a function an array, and an int of which to rotate them
// move the last value to the front of the array, that many times
// Commented out to avoid compilation errors
// Not yet working - Revisit tomorrow.

class rotateArray {
    public static void main(String[] args) {
        // Call the function with an int
        arrayRotate(3);
    }

    // // Rotate the array method
    public static int[] arrayRotate(int turns) {
        // Create the random number array
        int[] startArray = new int[] {1, 2, 3, 4, 5};
        System.out.println("Before loop, array is:");
        for (int x : startArray)
        {
            System.out.println("Index " + (x - 1) + " = " + startArray[x - 1]);
        }
        
        // Rotate the array X times
        for (int i = 0; i < turns; i++)
        {
            System.out.println("Rotation " + (i+1));
            // Store the last element of the array
            int last = startArray[startArray.length - 1];
            System.out.println("Shifting");
            for (int j = startArray.length -1; j > 0; j--)
            {
                startArray[j] = startArray[j - 1];
                System.out.println("Index " + j + " = " + startArray[j]);
            }
            startArray[0] = last;
            System.out.println("Index 0" + " = " + startArray[0]);
        }
        return startArray;
    }
}


////////////////////
////////// Find the array element WITHOUT a duplicate
////////////////////

class findNonPaired {
    public static void main(String[] args) {
        // Create a test array
        int[] testArray = new int[] {1, 1, 2, 3, 3, 4, 5, 5, 5};
        // Call the function with the array
        findSolo(testArray);
    }

    // // Find the loner
    public static int findSolo(int[] array) {
        int loner = 0;;
        // For each int in the array
        for (int i = 0; i < array.length; i++)
        {
            // Count the number of those ints in the array
            int matches = 0;
            // Check in i for equality with each array element. We should get 2 for every int that has a pair
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    matches++;
                }
            }
            if (matches < 2) {
                loner = array[i];
            }
        }
        System.out.println("Loner is " + loner);
        return loner;
    }
}