import java.util.Scanner;

public class baiTap14 {
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
        System.out.println("Đảo ngược mảng lại là");
        for (int i = (n - 1); i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
