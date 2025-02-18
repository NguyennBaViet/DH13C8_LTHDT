import java.util.Scanner;

public class Bai2_bac1 {
    public  void tinhCanBacMot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập số a: ");
        int a = sc.nextInt();
        System.out.println("Vui lòng nhập số b: ");
        int b = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else if (b != 0) {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Phương trình có nghiệm " + (-b / a));
        }
    }
}
