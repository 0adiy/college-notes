package Lab3;

import java.util.Scanner;
import java.util.Vector;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> v1 = new Vector<>();
        Boolean flag = true;

        do {
            System.out.println(
                    "\n===Menu===\n" +
                            "1. Add Names\n" +
                            "2. Search Names.\n" +
                            "3. Delete Names.\n" +
                            "4. View All Names.\n" +
                            "Enter anything else to Exit from the application.");
            int n = sc.nextInt();
            sc.nextLine(); // consumes newline char
            switch (n) {
                case 1:
                    System.out.println("Enter name:");
                    v1.add(sc.nextLine());
                    System.out.println("Name added");
                    break;
                case 2:
                    System.out.println("Enter name to search: ");
                    String key = sc.nextLine();
                    if (v1.contains(key))
                        System.out.println(key + " found");
                    else
                        System.out.println(key + " not found");

                    break;
                case 3:
                    System.out.println("Enter name to delete: ");
                    if (v1.remove(sc.nextLine()))
                        System.out.println("Deleted");
                    else
                        System.out.println("Not found");
                    break;
                case 4:
                    for (Object item : v1) {
                        System.out.println(item.toString());
                    }
                    break;

                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}