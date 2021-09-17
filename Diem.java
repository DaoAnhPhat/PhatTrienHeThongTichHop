package Phan2;

import java.util.Scanner;

public class Diem {
    static int x;
    int y;
    void nhaptoado(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    void intoado(){
        System.out.println("("+x +"," +y+")");
    }
    
    static void nhap()
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Tọa độ x: ");
        x=sc.nextInt();
        System.out.println("Tọa độ y: ");
        y=sc.nextInt();
        Diem d1 = new Diem();
        d1.nhaptoado(x, y);
        System.out.println("Tọa độ là: ");
        d1.intoado();
    }
    static void khoangcach()
    {
        int x,y;;
        Scanner sc=new Scanner(System.in);
        System.out.println("Tọa độ x: ");
        x=sc.nextInt();
        System.out.println("Tọa độ y: ");
        y=sc.nextInt();       
        double kq=Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
        System.out.println("Khoang cách từ tọa độ ("+x+","+y+") là: "+kq);
    }
    public static void main(String[] args) {
        Diem d1=new Diem();
        Diem d2=new Diem();
        nhap();
        khoangcach();
    }
}