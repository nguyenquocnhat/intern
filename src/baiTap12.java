import java.util.Scanner;

public class baiTap12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên n(n > 0): ");
            n = sc.nextInt();
        }while (n <= 0);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Nhập vào phần tử thứ " + (i+1) + ": ");
                a[i] = sc.nextInt();
            }while (a[i] < 0);
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Phần tử lớn nhất mảng là :" + max);
    }
}
