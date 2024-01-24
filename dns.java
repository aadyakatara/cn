import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

class DNS
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter domain name : ");
        String dn=sc.nextLine();
        try
        {
            InetAddress inet=InetAddress.getByName(dn);
            System.out.println("IP address for "+dn+" is :"+inet.getHostAddress());
        }
        catch(Exception e)
        {
            System.out.println("Unable to resolve host");
        }
    }
}
