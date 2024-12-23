import java.util.Scanner;

public class baiTap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0)
                sum += i;
        }
        System.out.println("Tổng các số chẵn từ 0 - "+ n + " là: " + sum);
    }
}
