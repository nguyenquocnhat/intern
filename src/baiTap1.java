import java.util.Scanner;

public class baiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên: ");
        int n = sc.nextInt();
        if(n >= 0){
            System.out.println("Đây là số nguyên dương");
        }
        else{
            System.out.println("Đây là số nguyên âm");
        }
    }
}
