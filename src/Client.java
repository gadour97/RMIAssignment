import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a string : ");
            String ch=scanner.nextLine() ;
            System.out.println("Input: "+ch);
            System.out.println("Output : "+service1.reverse(ch));


            MyInterface service2 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println("Enter a string : ");
            String ch1=scanner.nextLine() ;
            System.out.println("Input: "+ch1);
            System.out.println("Output : "+service2.minChar(ch1));


            MyInterface service3 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println("Enter a string : ");
            String ch2=scanner.nextLine() ;
            System.out.println("Input: "+ch2);
            System.out.println("Output : "+service3.caseChanger(ch2));



        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}
