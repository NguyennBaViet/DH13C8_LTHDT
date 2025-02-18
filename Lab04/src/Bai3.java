import java.util.Scanner;

public class Bai3 {
    public static int UCLN(int a, int b) {
        for (int temp; b != 0; a = temp) {
            temp = b;
            b = a % b;
        }
        return a;
    }

    public static int BCNN(int a, int b, int gcd) {
        int lcm = Math.max(a, b);
        for (; lcm % a != 0 || lcm % b != 0; lcm++) {
        }
        return lcm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        // Tính UCLN
        int ucln = UCLN(num1, num2);

        // Tính BCNN
        int bcnn = BCNN(num1, num2, ucln);

        System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là " + ucln);
        System.out.println("Bội chung nhỏ nhất của " + num1 + " và " + num2 + " là " + bcnn);
    }
}
