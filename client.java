import java.io.*;
import java.net.*;
public class Client {
private Socket socket;
private BufferedReader input;
private DataOutputStream output;
public Client(String address,int port) {
try {
socket = new Socket(address,port);
System.out.println("Connection Successful");
input = new BufferedReader(new InputStreamReader(System.in));
output = new DataOutputStream(socket.getOutputStream());
String line="";
while(!line.equals("Over")) {
line=input.readLine();
output.writeUTF(line);
}
input.close(); 
output.close();
socket.close();
}
catch(Exception e) {
}
}
public static void main(String[] args) {
// TODO Auto-generated method stub
new Client("127.0.0.1",5000);
}
}
