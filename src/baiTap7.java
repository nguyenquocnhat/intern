import java.util.Scanner;

public class baiTap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 20; i++) {
            System.out.println(n + " * " + i + " = " +i*n);
        }
    }
}
