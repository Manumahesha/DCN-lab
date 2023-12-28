import java.math.*;
import java.util.*;
import java.util.Random;
import java.io.*;
import java.lang.*;
public class prgm2leaky {
    public static void main(String args[]) 
    {
        int drop=0,mini,i,o_rate,b_size,nsec,p_remain=0;
        int packet[]=new int[100];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the bucket size:");
        b_size= in.nextInt();
        System.out.println("Enter output rate:");
        o_rate=nextInt();
        System.out.println("Enter the number of seconds to simulate:");
        nsec=in.nextInt();
        Random rand=new Random();
        for (i=0;i<nsec;i++) 
            {
                packet[i]=(rand.nextInt(1000));
            }
            System.out.println("Seconds  Packet recieved  Packet sent  Packets left  Packets dropped:");
            System.out.println("       ");
            for (i=0;i<nsec;i++) 
            {
                p_remain+=packet[i];
                if(p_remain>b_size)
                {
                    drop=p_remain-b_size;
                    p_remain=b_size;
                    System.out.println(i+1+"          ");
                    System.out.println(packet[i]+"   ");
                    mini=math.min(p-remain,o_rate);
                    System.out.println(mini+"   ");
                    p_remain=p_remain-mini;
                    System.out.println(drop+"   ");
                    System.out.println("   ");
                    drop=0;
                }
            }
            while(p_remain!=0){
                if(p_remain>b_size)
                {
                    drop=p_return-b_size;
                }
                mini=math.min(p-remain,o_rate);
                System.out.println("   "+p_remain+"   "+drop);
                drop=0;
        }
    }
}    

//Output
Enter the bucket size:
10
Enter the output rate:
4
Enter the number of seconds to simulate:
10
Seconds  |  Packet recieved   |  Packet sent   |  Packets left   |  Packets dropped
    1            90                   4                6                 80
    2            20                   4                6                 16
