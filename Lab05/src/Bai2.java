import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Nhập vào số học sinh: ");
        n = sc.nextInt();
        String[] hocLuc = new String[n];
        double[] diem = new double[n];
        String[] hoTen = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào họ tên học sinh thứ %d: ",(i+1));
            hoTen[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập điểm của học sinh thứ %d: ",(i+1));
            diem[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            if(diem[i] >= 9){
                hocLuc[i] = "Xuất sắc";
            } else if (7.5 <= diem[i] && diem[i] < 9) {
                hocLuc[i] = "Giỏi";
            } else if (diem[i] >= 6.5 && diem[i] < 7.5) {
                hocLuc[i] = "Khá";
            } else if (diem[i] >= 5 && diem[i] < 6.5) {
                hocLuc[i] = "Trung bình";
            }else {
                hocLuc[i] = "Yếu";
            }
        }
        System.out.println("Danh sách học sinh và học lực: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Họ tên: "+ hoTen[i]+ "\nĐiểm: " +diem[i]+"\nHọc lực: " +hocLuc[i]);
            System.out.println("--------------------------");
        }
    }
}
