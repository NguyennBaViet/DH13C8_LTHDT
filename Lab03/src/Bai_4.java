import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Bài 1");
            System.out.println("2. Bài 2 căn bậc 1");
            System.out.println("3. Bài 2 căn bậc 2");
            System.out.println("4. Bài 3 ");
            System.out.println("5. Thoát");
            Scanner sc = new Scanner(System.in);
            System.out.println("Vui lòng chọn số từ 1 -> 5");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Bai_1 b = new Bai_1();
                    b.hocLuc();
                    break;
                case 2:
                    Bai2_bac1 bac1 = new Bai2_bac1();
                    bac1.tinhCanBacMot();
                    break;
                case 3:
                    Bai2_bac2 bac2 = new Bai2_bac2();
                    bac2.tinhCanBacHai();
                    break;
                case 4:
                    Bai_3 b3 = new Bai_3();
                    b3.tinhTienDien();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng lựa chọn từ 1 -> 5 !!!");
                    break;
            }
        }
    }
}
