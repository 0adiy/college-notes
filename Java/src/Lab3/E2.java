package Lab3;

import java.util.Scanner;

class Person {
    String uname, pswd, hintq, hinta;

    Person(String un, String ps, String hq, String ha) {
        this.uname = un;
        this.pswd = ps;
        this.hintq = hq;
        this.hinta = ha;
    }

    boolean validate(String un, String ps) {
        return this.uname.equals(un) && this.pswd.equals(ps);
    }

    void changePswd(String un, String ps) {
        Scanner sc = new Scanner(System.in);
        if (validate(un, ps)) {
            System.out.println("Enter New Password");
            pswd = sc.nextLine();
            System.out.println("Password CHANGED");
        } else {
            System.out.println("INVALID CREDENTIALS");
        }
    }

    void recoverPswd(String un) {
        Scanner sc = new Scanner(System.in);
        if (uname.equals(un)) {
            System.out.println("Hint question: " + hintq);
            System.out.println("Enter the answer: ");
            String an = sc.nextLine();
            if (an.equals(hinta))
                System.out.println("Password= " + pswd);
            else
                System.out.println("INVALID ANSWER");
        } else
            System.out.println("INVALID USER");
    }
}

public class E2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Person p = null;
        while (true) {
            System.out.println("MENU");
            System.out.println("1 Register New User");
            System.out.println("2 Login");
            System.out.println("3 Change Password");
            System.out.println("4 Recover Password");
            System.out.println("5 to Exit");
            int n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    System.out.println("NEW USER REGISTRATION");
                    System.out.println("Enter Username:");
                    String un = sc.nextLine();
                    System.out.println("Enter Password:");
                    String ps = sc.nextLine();
                    System.out.println("Enter Hint Question:");
                    String hq = sc.nextLine();
                    System.out.println("Enter Hint Answer:");
                    String ha = sc.nextLine();
                    p = new Person(un, ps, hq, ha);
                    System.out.println("NEW USER REGISTRATION SUCCESSFUL");
                    break;
                case 2:
                    System.out.println("Enter User Name:");
                    un = sc.nextLine();
                    System.out.println("Enter Password");
                    ps = sc.nextLine();
                    if (p.validate(un, ps))
                        System.out.println("WELCOME " + un);
                    else
                        System.out.println("INVALID CREDENTIALS");
                    break;
                case 3:
                    System.out.println("Enter User Name:");
                    un = sc.nextLine();
                    System.out.println("Enter Password");
                    ps = sc.nextLine();
                    p.changePswd(un, ps);
                    break;
                case 4:
                    System.out.println("Enter User Name:");
                    un = sc.nextLine();
                    p.recoverPswd(un);
                    break;
                default:
                    return;
            }
        }
    }
}