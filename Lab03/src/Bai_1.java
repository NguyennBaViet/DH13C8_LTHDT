import java.util.Scanner;

public class Bai_1 {
    public void hocLuc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập điểm của sinh viên: ");
        float diem = sc.nextFloat();
        if(diem >= 9 && diem <= 10){
            System.out.println("Học lực xuất sắc");
        }else if(diem >= 8){
            System.out.println("Học lực giỏi");
        }else if(diem >= 6.5){
            System.out.println("Học lực khá");
        }else if(diem >= 5){
            System.out.println("Học lực trung bình");
        }else if(diem >= 3.5){
            System.out.println("Học lực yếu");
        }else if (diem <3.5){
            System.out.println("Học lực kém");
        }else{
            System.out.println("Số điểm không hợp lệ!!! \n Vui lòng nhập điểm từ 0 -> 10 !!!");
        }
    }
}
