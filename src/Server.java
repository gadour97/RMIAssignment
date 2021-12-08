import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class server extends UnicastRemoteObject implements MyInterface {

    public server() throws RemoteException {}
    @Override
    public String sayHello() throws RemoteException {
        return null;
    }



    public String reverse(String ch1){
        String ch="";
        for (int i=0;i<ch1.length();i++){
            ch=ch1.charAt(i)+ch;
        }
        return ch;
    }



    public char minChar (String ch){
        char min='z';
        int a=ch.length();
        for (int i=0; i<a-1; i++){
            if (ch.charAt(i) < min)
            { min = ch.charAt(i);}
        }
        return min;
    }


    public StringBuffer caseChanger (String ch){
        StringBuffer newStr=new StringBuffer(ch);

        for(int i = 0; i < ch.length(); i++) {
            if(Character.isLowerCase(ch.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(ch.charAt(i)));
            }

            else if(Character.isUpperCase(ch.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(ch.charAt(i)));
            }
        }
        return newStr;

     }






    public static void main(String[] args) throws RemoteException, MalformedURLException {
        server server = new server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}
