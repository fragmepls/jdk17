package assignment1;

public class TestVars {

    public void runMe() {
        System.out.println("Hi, this is my entry point in runMe()");
        short a = 5,
                b = 12,
                c;
        //c = a + b; // a + b is an int, so we need to cast it to a short
        System.out.println("Result 0: " + (a+b) ); // this doesn't throw an error because we can print Integers without any problems
        System.out.println("Result 1: " + 100000*(2000000000/500000)); // Result 1 is different from Result 2 because of the order of operations
        System.out.println("Result 2: " + (100000*2000000000)/500000); // Result 1 is the "correct" one because it never exceeds the maximum value of an int
        System.out.println("Result 3: " + (2-2.0) / (5-5.00)); // Result 3 is invalid because we are dividing by 0
        System.out.println("Result 4: " + (2-1.0) / (0.00)); // Result 4 is invalid because we are dividing by 0, but Java interprets it as infinity
        //System.out.println("Result 5: " + c); // Result 5 is invalid because we never assigned a value to c

        /* TO DO: here is where you add your code for other tasks! */
        // 4a
        char c1 = 'a'; // stored as 'a'
        int i = c1; // stored as 97, since 'a' is 97 in ASCII
        // 4b
        int i2 = 1; // an int value with a 32-bit maximum length
        short s = Integer.valueOf(i2).shortValue(); // converting the int to a short value with a 16-bit maximum length
        // 4c
        short s2 = 1; // a short value with a 16-bit maximum length
        int i3 = s2; // converting the short to an int value with a 32-bit maximum length
        // 4d
        //int i4 = 200000000000000000000; // an int value that exceeds the 32-bit maximum length
        // 4e
        double d = 200000000000000000000d; // a double value with a 64-bit maximum length, the d at the end specifies that it is a double
    }

}
