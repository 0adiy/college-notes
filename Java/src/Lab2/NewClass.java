package Lab2;

/*
Complete the following program without modifying the main():
public class NewClass {
   	...
	...
    public static void main(String[] arg){
        System.out.println("MAIN()");
        new NewClass();
        new NewClass();
    }    
}
The Output should be:
Welcome to Programming in Java
MAIN()
Welcome to Java
Welcome to Java
 */

public class NewClass {

    public NewClass() {
        System.out.println("Welcome to Java");
    }

    public static void main(String[] arg) {
        System.out.println("MAIN()");
        new NewClass();
        new NewClass();
    }
}