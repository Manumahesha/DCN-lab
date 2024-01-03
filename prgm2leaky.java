import java.math.*;
import java.util.*;
import java.util.Random;
import java.io.*;
import java.lang.*;
public class prgm2leaky{
public static void main(String args[])
{
	int drop=0,mini,i,orate,bsize,nsec,premain=0;
	int packet[]= new int[100];
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the bucket size : ");
	bsize=s.nextInt();
	System.out.print("Enter the output rate : ");
	orate=s.nextInt();
	System.out.print("Enter the number of seconds to simulate : ");
	nsec=s.nextInt();
	Random rand=new Random();
	for(i=0;i<nsec;i++)
	packet[i]=(rand.nextInt(1000));
	System.out.println("----------------------------------------------------------------------");
	System.out.println("Seconds | Packets recieved | Packets sent  | Packets left | Packets dropped");
	System.out.println("----------------------------------------------------------------------");
	for(i=0;i<nsec;i++){
	premain+=packet[i];
	if(premain>bsize)
	{
		drop=premain-bsize;
		premain=bsize;
		System.out.print(i+1 +"		");
		System.out.print(packet[i] +"		");
		mini=Math.min(premain,orate);
		System.out.print(mini +"		");
		premain=premain-mini;
		System.out.print(premain +"		");
		System.out.println(drop +"		");
		System.out.println("		");
		drop=0;
	}
}
	while(premain!=0)
	{
		if(premain>bsize){
		drop=premain-bsize;
	}
		mini=Math.min(premain,orate);
		System.out.print("		"+premain+"		"+mini);
		premain=premain-mini;
		System.out.println("		"+premain+"		"+drop);
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
