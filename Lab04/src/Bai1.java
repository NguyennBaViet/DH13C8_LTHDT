import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập số bạn muốn: ");
        n = sc.nextInt();
        boolean ok = true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                ok = false;
                break;
            }
        }
        if(ok == false) {
            System.out.println("Số trên không phải là số nguyên tố");
        }else {
            System.out.println("Số bạn vừa nhập là số nguyên tố");
        }
    }
}
