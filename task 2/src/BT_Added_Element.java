import java.util.Arrays;
import java.util.Scanner;

public class BT_Added_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {4, 5, 6, 7};
        System.out.println("Import X : ");
        int X = sc.nextInt();
        System.out.println("Import index : ");
        int index = sc.nextInt();

        int count = 0;


        for (int i = count; i > index; i--)
            a[i] = a[i - 1]; // Dịch các phần tử sang phải 1 vị trí
            a[index] = X; // Thêm x vào vị trí vt
            count++; // Tăng số phần tử lên 1

        System.out.println(Arrays.toString(a));

    }
}
