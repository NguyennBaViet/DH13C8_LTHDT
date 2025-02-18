import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        int chieuDai = sc.nextInt();
        System.out.println("Nhap chieu rong: ");
        int chieuRong = sc.nextInt();
        System.out.println("Chieu dai la: "+chieuDai);
        System.out.println("Chieu rong la: "+chieuRong);

        float chuVi = 0;
        chuVi =(float) (chieuDai+chieuRong)*2;
        System.out.println(chuVi);
        float dienTich = 0;
        dienTich =(float) chieuDai*chieuRong;
        System.out.println(dienTich);
        int min = Math.min(chieuDai,chieuRong);
        System.out.println(min);
        int max = Math.max(chieuDai,chieuRong);
        System.out.println(max);
    }
}
