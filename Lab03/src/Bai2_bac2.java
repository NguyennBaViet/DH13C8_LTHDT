import java.util.Scanner;

public class Bai2_bac2 {
    public void tinhCanBacHai() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập số a: ");
        int a = sc.nextInt();
        System.out.println("Vui lòng nhập số b: ");
        int b = sc.nextInt();
        System.out.println("Vui lòng nhập số c: ");
        int c = sc.nextInt();
        if(a == 0){
            System.out.println("Giá trị của phương trình = "+(-c/b));
        }else{
            float detal = Math.abs(a-b);
            if(detal <0 ){
                System.out.println("Phương trình vô nghiệm");
            }else if(detal == 0){
                System.out.println("Phương trình có nghiệm kép = "+(-b/(2*a)));
            }else{
                System.out.println("Phương trình có 2 nghiệm phân biệt");
                float x1 = (float) ((-b + Math.sqrt(detal))/(2*a));
                float x2 = (float) ((-b - Math.sqrt(detal))/(2*a));
                System.out.println(x1+" và "+x2);
            }
        }
    }
}
