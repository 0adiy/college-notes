//  every class file needs to be inside a package mentioned  in the first line 
// (folder path, like com.package.sub for com/package.sub)
package Intro;

import java.util.Scanner;

// imports are placed here

// Classes (or interfaces) here
// Generally only one class per file, with same filename
public class FirstIOProgram {
    public static void main(String[] args) {
        outputExample();
        inputExample();
    }

    public static void outputExample() {
        // Standard output to console
        // System is a class with static members
        // .out is accessing a feild (static variable) which has println and print
        // functions
        // print function has no '\n' at the end
        System.out.print("hello");

        // println func has extra '\n' at the end
        System.out.println(" ji");
    }

    public static void inputExample() {
        // Creating new scanner variable which scans (reads) standard input (console)
        // var here takes automatically the type set on right
        // new operator is used to create obj in heap and return a reference
        var scanner = new Scanner(System.in);

        // same can be written as
        // Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        // reading next line
        String s = scanner.nextLine();

        // Must close scanner after usage
        scanner.close();

        // printing result with string concatnation
        System.out.println("Hello " + s);
    }
}