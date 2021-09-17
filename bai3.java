package Baicogiao;

import java.util.Scanner;
public class bai3 {
    static Scanner sc= new Scanner(System.in);
  public static void main(String[] args) {
      System.out.println("Giải phương trình bậc 2 : ");
      System.out.print("a= ");
      float a=sc.nextInt();
      System.out.print("b= ");
      float b=sc.nextInt();
      System.out.print("c= ");
      float c=sc.nextInt();
      float x1,x2;
      if(a==0.0){
          if(b==0.0)
          System.out.println("Vô nghiệm");
          System.out.println("Phương trình có nghiệm x="+(float)-c/b);
      }else{
          float delta= b*b -4*a*c;
          if(delta>0){
              x1=(float) ((-b+ Math.sqrt(delta)) / (2*a));
              x2=(float) ((-b+ Math.sqrt(delta)) / (2*a));
              System.out.println("Phương trình có nghiệm phân biệt:\nx1="+ (float)x1+"\nx2"+(float)x2);
      }else if(delta==0){
          x1=(-b/(2*a));
          System.out.println("Phương trình có nghiệm kép :\nx1="+(float)x1);
      }else{
          System.out.println("Phương trình vô số nghiệm");
      }
    }
}
}

