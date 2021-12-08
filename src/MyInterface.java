import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    String sayHello()throws RemoteException;
    String reverse(String ch) throws RemoteException;
    char minChar(String ch) throws RemoteException;
    StringBuffer caseChanger(String ch) throws RemoteException;
}
