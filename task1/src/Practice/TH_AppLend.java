package Practice;

import java.util.Scanner;

public class TH_AppLend {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Investment amount: ");
        money = input.nextDouble();
        System.out.println("Number of months: ");
        month = input.nextInt();
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * 3;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}
