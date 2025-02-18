import java.util.Scanner;

public class Bai4 {
        public static void main(String[] args) {
            int n = 50; // Bạn có thể thay đổi giá trị này để kiểm tra với các giá trị khác nhau
            System.out.println("Các số nguyên tố nhỏ hơn " + n + " là: ");
            for (int i = 2; i < n; i++) {
                if (Snt(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        public static boolean Snt(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
}
