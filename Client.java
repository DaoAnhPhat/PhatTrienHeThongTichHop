import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        while (true) {
            System.out.println("1. Dem so luong tu trong chuoi\n2. Dao chuoi\nExit");
            String luaChon=nhap.nextLine();
            
            try {
                Registry rgt=LocateRegistry.getRegistry(20211);
                ITF itf=(ITF) rgt.lookup("MyService1");
                switch (luaChon) {
                    case "1":
                        System.out.println("Chuoi cua ban: ");
                        String s=nhap.nextLine();
                        System.out.println("So luong chuoi: "+itf.DemTu(s));
                        break;
                    case "2":
                        System.out.println("Nhap chuoi: ");
                        String s2=nhap.nextLine();
                        System.out.println("Dao nguoc chuoi: "+itf.DaoChuoi(s2));
                        break;
                    default:
                        System.out.println("SAI CU PHAP!!");
                        break;
                }
                
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        
        
        

    }
}
