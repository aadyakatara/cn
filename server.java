import java.io.*;
import java.net.*;
public class Server {
private Socket socket;
private ServerSocket server;
private DataInputStream input;
public Server(int port) {
try {
server = new ServerSocket(port);
System.out.println("Server Started");
System.out.println("Waiting for client .....");
socket = server.accept();
System.out.println("Client accecpted");
input = new DataInputStream(new
BufferedInputStream(socket.getInputStream()));
String line = "";
 while (!line.equals("Over")) {
 line = input.readUTF();
 System.out.println(line);
 }
 System.out.println("Closing connection"); 
 socket.close();
 input.close();
}
catch(Exception e) {
}
}
public static void main(String[] args) {
// TODO Auto-generated method stub
new Server(5000);
}
}
