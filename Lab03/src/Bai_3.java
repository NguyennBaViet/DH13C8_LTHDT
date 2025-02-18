import java.util.Scanner;

public class Bai_3 {
    public void tinhTienDien() {
        float Tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện tiêu thụ: ");
        int tieuThu = sc.nextInt();
        if(tieuThu >= 0 && tieuThu <= 50){
             Tong = tieuThu * 1678;
        }else if(tieuThu >= 51 && tieuThu <= 100){
            Tong = tieuThu * 1678 + (tieuThu - 50) * 1734;
        }else if(tieuThu >= 101 && tieuThu <= 200){
            Tong = tieuThu * 1678 + 50 * 1734 + (tieuThu - 100) * 2014;
        }else if(tieuThu >= 201 && tieuThu <= 300){
            Tong = tieuThu * 1678 + 50 * 1734 + 100 * 2014 + (tieuThu - 100) * 2536;
        }else if(tieuThu >= 301 && tieuThu <= 400){
            Tong = tieuThu * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (tieuThu - 100) * 2834;
        }else if(tieuThu >= 401 && tieuThu <= 500){
            Tong = tieuThu * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (tieuThu - 100) * 2927;
        }else {
            System.out.println("Số điện quá cao!!! Chúng tôi chưa cập nhật được...");
        }
        System.out.println("Tổng số tiền bạn cần đóng : "+Tong);
    }
}
