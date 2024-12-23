import java.util.Scanner;

public class baiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên(0 -> 9): ");
        int n = sc.nextInt();
        switch (n) {
            case 0: System.out.println("Không"); break;
            case 1: System.out.println("Một"); break;
            case 2: System.out.println("Hai"); break;
            case 4: System.out.println("Bốn"); break;
            case 5: System.out.println("Năm"); break;
            case 6: System.out.println("Sáu"); break;
            case 7: System.out.println("Bảy"); break;
            case 8: System.out.println("Tám"); break;
            case 9: System.out.println("Chín"); break;
            default:
                System.out.println("Chỉ nhập từ 0 đến 9");
                break;
        }
    }
}
