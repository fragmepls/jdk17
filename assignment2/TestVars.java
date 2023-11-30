package assignment2;

import java.util.Scanner;
public class TestVars {
    public void runMe() {
        int x = 0, y = 6, z = 10;
        System.out.println("z = " + z);
        z++;
        System.out.println("z = " + z);
        z = 10;
        ++z;
        System.out.println("z = " + z);
        x = ++y;
        System.out.println("x = " + x);
        x = 0;
        y = 6;
        x = y++;
        System.out.println("x = " + x);
        z = 6;
        System.out.println("z: " + ++z); // ++z returns the incremented value
        z = 6;
        System.out.println("z: " + z++); // z++ returns the original value
        x = 0;
        y = 6;
        //System.out.println(y/x); // throws ArithmeticException, division by zero
        x = 14;
        y = 4;
        System.out.println(x/y + " " + x%y); // 3 and remainder 2
        float float_x = 14;
        float float_y = 4;
        System.out.println(float_x/float_y + " " + float_x%float_y); // 3.5 and remainder 2 because % does not count the fractional part of a number
        String myStrangeString = + 1 + - - + - - + + + + + - 1 + " ";
        System.out.println(myStrangeString); // returns 1 + - 1 which is 0 and a space character

        String s1 = "Andrea";
        int       i1 = 2,
                i2 = 1;
        System.out.println("Result: " + s1 + (i1 + i2) ); // parentheses are evaluated first, then concatenation
        System.out.println("Result: " + s1 + i1 + i2); // concatenation is left associative
        System.out.println(i1 + - + i2 + " is the result!"); // returns 2 - 1 which is 1
//        System.out.println(i1 + - + " is the result!"); // returns error because there is no second operand

        int strangeResult = 07 + 010;
        System.out.println("strangeResult has value " + strangeResult); // returns 15 because 07 is octal and 010 is octal
        int strangeSum = 0x7A + 0x10;
        System.out.println("strangeSum has value " + strangeSum); // returns 122 + 16 which is 138, because 0x7A is hexadecimal and 0x10 is hexadecimal

//        int giveMeTroubles = 09; // returns error because 09 is not a valid octal number
//        System.out.println("giveMeTroubles has value " + giveMeTroubles); // variable is not initialized because of the error
//        int giveMeOtherTroubles = 0x9FL; // returns error a long value is provided for an int variable
//        System.out.println("giveMeOtherTroubles has value " + giveMeOtherTroubles); // variable is not initialized because of the error

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("So, you are " + age + " years old");

        System.out.print("Enter your age: ");
        int age2 = sc.nextInt();
        System.out.print("Enter your height (in cm): ");
        int height = sc.nextInt();
        System.out.print("Enter your weight (in kg): ");
        int weight = sc.nextInt();
        System.out.print("Enter your Initials: ");
        String initials = sc.next();
        char firstInitial = initials.charAt(0);
        char secondInitial = initials.charAt(1);
        System.out.print("Enter your address: ");
        String address = sc.next();
        System.out.println("My age variables value is " + age2);
        System.out.println("My height variables value is " + height);
        System.out.println("My weight variables value is " + weight);
        System.out.println("My firstInitial variables value is " + firstInitial);
        System.out.println("My secondInitial variables value is " + secondInitial);
        System.out.println("My address variables value is " + address);
        sc.close();

        int a = 5;
        int b = 10;
        int c = ++a * b--;
        System.out.println("a " + a); // a is 6
        System.out.println("b " + b); // b is 9
        System.out.println("c " + c); // c is 60

        System.out.println("1 + 2 = " + 1 + 2); // returns 1 + 2 = 12 because concatenation is left associative
        System.out.println("1 + 2 = " + (1 + 2)); // returns 1 + 2 = 3 because parentheses are evaluated first

        System.out.println(1 + 2 + " = 1 + 2"); // returns 3 = 1 + 2 because concatenation is left associative
        System.out.println("1 + 2 = " + 1 + 2); // returns 1 + 2 = 12 because concatenation is left associative

    }
}

