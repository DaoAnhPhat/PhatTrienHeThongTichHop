package Phan2;

public class MainPS {
    public static void main(String[] args) throws Exception {
        System.out.println("Chương trình phân số");
        PhanSo a = new PhanSo(10,2);
        System.out.println(a);
        a.nghichDao();
        a.giaTriThuc();
    }
}