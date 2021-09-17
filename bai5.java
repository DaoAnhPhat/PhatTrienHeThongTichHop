package Baicogiao;

import java.util.Scanner;

public class bai5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
        System.out.println("Tính tổng dãy số thực");
        System.out.print("Nhập dãy số muốn tính: ");
        int n = sc.nextInt();
        float [] A = new float[n];
        float tong =0;
        for(int i=0; i<n; ++i) {
            System.out.print("Số thứ " + (int)(i+1) + ": ");
            A[i] = (float) sc.nextFloat();
        }
        for(int i=0; i<n; ++i) 
            tong +=A[i];        
        System.out.println("Tổng của dãy số: "+ (float)tong);

    }
}