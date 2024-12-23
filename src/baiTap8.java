import java.util.Scanner;

public class baiTap8 {

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên n(n < 1000): ");
            n = sc.nextInt();
        }while (n >= 1000);
        for (int i = 0; i <= n; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
