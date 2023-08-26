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
        // binGap(1001435);
    }

    public static int binGap(int N) {
        // Get the binary representation
        String binResult = Integer.toBinaryString(N);
        System.out.println("Binary is " + binResult);
        // First digit will always be 1 in binary
        // Cut any ending zeros since they aren't wrapped in a "1"
        // If the binary string DOES NOT end with "1"
        if (!binResult.endsWith("1")) {
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
        for (String binBlock : binBlocks) {
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
// This needs a handler for array.length < 2

class rotateArray {
    public static void main(String[] args) {
        // Call the function with an int
        arrayRotate(3);
    }

    // Rotate the array method
    public static int[] arrayRotate(int turns) {
        // Create the random number array
        int[] startArray = new int[] { 1, 2, 3 };
        // System.out.println("Before loop, array is:");
        // for (int x : startArray)
        // {
        // System.out.println("Index " + (x - 1) + " = " + startArray[x - 1]);
        // }
        if (startArray.length > 2) {
            // Rotate the array X times
            for (int i = 0; i < turns; i++) {
                System.out.println("Rotation " + (i + 1));
                // Store the last element of the array
                int last = startArray[startArray.length - 1];
                System.out.println("Shifting");
                for (int j = startArray.length - 1; j > 0; j--) {
                    startArray[j] = startArray[j - 1];
                    System.out.println("Index " + j + " = " + startArray[j]);
                }
                startArray[0] = last;
                System.out.println("Index 0" + " = " + startArray[0]);
            }
            return startArray;
        } else {
            return startArray;
        }
    }
}

////////////////////
////////// Find the array element WITHOUT a duplicate
////////////////////

class findNonPaired {
    public static void main(String[] args) {
        // Create a test array
        int[] testArray = new int[] { 1, 1, 2, 3, 3, 4, 5, 5, 5 };
        // Call the function with the array
        findSolo(testArray);
    }

    // // Find the loner
    public static int findSolo(int[] array) {
        int loner = 0;
        ;
        // For each int in the array
        for (int i = 0; i < array.length; i++) {
            // Count the number of those ints in the array
            int matches = 0;
            // Check in i for equality with each array element. We should get 2 for every
            // int that has a pair
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

////////////////////
////////// Frog jump
////////// Wants to get from X to or greater than Y, always moving D distance
////////////////////

class frogJump {
    public static void main(String[] args) {
        // Create a test array
        int[] testArray = new int[] { 1, 1, 2, 3, 3, 4, 5, 5, 5 };
        // Call the function with the array
        jumps(60, 100, 25);
    }

    // This version failed pretty bad on efficency...
    public static int jumps(int X, int Y, int D) {
        // while position (X) is less than goal (Y)
        // int position = X;
        // int jumps = 0;
        // while (position < Y)
        // {
        // position = position + D;
        // jumps++;
        // }
        // System.out.println(jumps);
        // return jumps;

        if ((Y - X) % D == 0) {
            System.out.println((Y - X) / D);
            return (Y - X) / D;
        }
        System.out.println((Y - X) / D + 1);
        return (Y - X) / D + 1;
    }
    // More efficent
}

////////////////////
////////// Find the missing int in an array
////////////////////

class missingInt {
    public static void main(String[] args) {
        // Create a test array
        int[] testArray = new int[] {1, 2, 3, 5, 6};
        // Call the function with the array
        findInt(testArray);
    }

    public static int findInt(int[] array) {

        // This solution works but again, is inefficent
        // int missingInt = 0;
        // // Easiest if we create an ArrayList, so no duplicates and has .contains method
        // List<Integer> arrList = new ArrayList<Integer>(array.length);
        // // Populate the ArrayList with array ints
        // for (int i : array) {
        //     arrList.add(i);
        // }
        // // Array List is now populated
        // for (int i = 1; i <= arrList.size() + 1; i++) {
        //     if (!arrList.contains(i)) {
        //         missingInt = i;
        //     }
        // }
        // System.out.println("Missing int is " + missingInt);
        // return missingInt;
        int expectedInt = 1;
        int missingInt = 0;
        Arrays.sort(array);
        if (array.length > 0)
        {
            for (int x : array) {
                if (x == expectedInt) {
                    expectedInt++;
                } else {
                    missingInt = expectedInt;
                }
            }

        }
        else if (array.length == 0)
        {
            missingInt = 1;
        }
        // This handles if the missing int is the FINAL number in the sequence
        if (missingInt == 0)
        {
            missingInt = array[array.length - 1] + 1;
        }
        System.out.print(missingInt);
        return missingInt;
    }
}