package Exercise;

import java.util.Scanner;

public class BT_AppReadNumberIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đổi: ");

        int scd = scanner.nextInt();
        if (scd >= 0 && scd < 10 ){
            switch (scd) {
                case 0:
                    System.out.println("zero");
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
            }
        }
        String five = "fif";
        String four = "for";
        String three = "thir";
        String two = "twen";
        if (scd > 10 && scd < 20){
            for (int i = 13; i < 20; i ++){
                System.out.println();
            }
        }
    }
}
