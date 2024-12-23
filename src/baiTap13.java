import java.util.Scanner;

public class baiTap13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên n(n > 0): ");
            n = sc.nextInt();
        }while (n <= 0);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i+1) + ": ");
            a[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Phần tử bé nhất mảng là: " + min);
    }
}
