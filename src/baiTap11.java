import java.util.Scanner;

public class baiTap11 {
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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.print("Trung bình của mảng là: " + (sum * 1.0 / n));
    }
}
