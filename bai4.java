package Baicogiao;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Tính tổng từ 1 đến n");      
        System.out.println("n = 0 để dừng chương trình");       
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập n= ");        
            int n = sc.nextInt();
            if (n==0) break;            
            int tong = 0;
            for(int i=0; i<=n; i++) 
                tong += i;            
            System.out.println("Tổng từ 1 đến " + n + " là: " + tong);            
        } 
    }
}
