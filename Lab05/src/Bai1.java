import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int m[] = new int[n];
        for(int i = 0; i<n; i++){
            System.out.printf("Nhập phần tử thứ m[%d] của mảng: ",(i+1));
            m[i] = sc.nextInt();
        }
        System.out.println("Dãy vừa nhập là: ");
        for(int i = 0; i<n; i++){
            System.out.print(m[i]+" ");
        }
        Arrays.sort(m);
        System.out.println("\nDãy sau khi đã sắp xếp là: ");
        for(int i = 0; i<n; i++){
            System.out.print(m[i]+" ");
        }
        System.out.println("\nSố nhỏ nhất là: "+m[0]);
        int sum = 0;
        int count =0;
        for(int i = 0; i<n; i++){
            if(m[i] % 3 == 0){
                sum += m[i];
                count++;
            }
        }
        if(count > 0 ){
            System.out.println("\nTrung bình cộng các số chia hết cho 3 là: "+sum/count);
        }else{
            System.out.println("Không có số nào chia hết cho 3");
        }
    }
}
