package Baicogiao;
import java.util.Scanner;
public class bai2 {
	
	    public static void main(String[] args) {
	        int n;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Nhập số cần chuyển sang nguyên tố: ");
	        n=sc.nextInt();
	        if(n>0)
	        {
	            if(kiemtrasonguyento(n)==1)
	            System.out.println(n+" Là số nguyên tố");
	            else
	            System.out.println(n+" Sai số");
	        }
	    }
	    public static int kiemtrasonguyento(int n)
	     {
	    int dem=0;
	    for(int i=1;i<=n;i++)
	    {
	        if(n%i==0)
	        dem++;    
	    }
	    if(dem==2)
	    return 1;
	    else return 0;
	}
	

}
