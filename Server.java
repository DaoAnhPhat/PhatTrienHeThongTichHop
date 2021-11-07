import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {
  public static void main(String[] args) {
      try {
        LocateRegistry.createRegistry(20211);
        Naming.bind("rmi://localhost:20211/MyService1", new IPM());
        System.out.println("Server started");

      } catch (Exception e) {
          System.out.println("loi");
      }
       
  }
}
