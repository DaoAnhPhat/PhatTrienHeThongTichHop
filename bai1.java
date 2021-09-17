package Baicogiao;
import java.util.Scanner;
public class bai1 {
        public static void main(String args[]) {
                Scanner sc =new Scanner(System.in);
            System.out.println("Nhập tên cần viết hoa:");
            String inpuString =sc.nextLine();
            System.out.println("Tên viết hoa của bạn:"+ inpuString.toUpperCase());
        }
}
