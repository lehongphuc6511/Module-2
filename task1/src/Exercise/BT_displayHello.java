package Exercise;

import java.util.Scanner;

public class BT_displayHello {
    public static void main(String[] args) {
        System.out.println("Your name: ");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hello: " + name);
    }
}
