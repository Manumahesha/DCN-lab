import java.net.*;
import java.io.*;
public class prgm3btcpcln{
    public static void main(String args[])throws Exception
{
    Socket sock=new Socket("127.0.0.1",4000);
    System.out.println("Enter the file name");
    BufferedReader KeyRead=new BufferedReader(new InputStreamReader(System.in));
    String fname=KeyRead.readLine();
    OutputStream ostream=sock.getOutputStream();
    PrintWriter pwrite=new PrintWriter(ostream,true);
    pwrite.println(fname);
    InputStream istream=sock.getInputStream();
    BufferedReader SocketRead=new BufferedReader(new InputStreamReader(istream));
    String str;
    while((str=SocketRead.readLine()!=null)
    {
        System.out.println(str);
        pwrite.close
        SocketRead.close();
        KeyRead.close();
    }
    }
}
