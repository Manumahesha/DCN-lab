import java.util.*;
public class crc{
    public static void main(string args[])
    {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the data");
        n=s.nextInt();
        int data[]=new int[n];
        System.out.println("Enter the data bit by bit:");
        for(int i=0; i<n; i++)
        {
            data[i]=s.nextInt();
        }
        System.out.println("Enter the size of the divisor:");
        n=s.nextInt();
        int divisor[]=newInt[n];
        System.out.println("Enter the divisor bit by bit:");
        for(int i=0; i<n; i++)
        divisor[i]=s.nextInt();
        int remainder[]=divide(data,divisor);
        System.out.println("\n The crc code generated is:");
        for(int i=0; i<n; i++)
        System.out.println(data[i]);
        for(int i=0; i<remainder.length-1; i++)
        System.out.println(remainder[i]);
        System.out.println();
        int sent_data[]=new int[data.length+remainder.length-1];
        System.out.println("Enter the data to be sent:");
        for(int i=0; i<sent_data.length; i++)
        sent_data[i]=s.nextInt();
        recieve(sent_data,divisor);
    }
    static int[] divide(int old_data[],int divisor[])
    {
        int remainder[],i;
        int data[]=new int[old_data.length+divisor];
        System.arraycopy(old_data,0,data,0,old_data.length);
        System.out.println("message bits after appending divisor_length-1 0's:");
        for(i=0; i<data.length-1; i++)
        System.out.println(data[i]);
        remainder=new int[divisor.length];
        System.arraycopy(data,0,remainder,0,divisor.length);
        for(j=1; j<divisor.length; j++)
        {
            remainder[j-1]=exor(remainder[j],divisor[j]);
        }
    }
    else{
        for(int j=1; j<divisor.length; j++)
        {
        remainder[j-1]=exor(remainder[j],0);
    }
    remainder[divisor.length-1]=data[i+divisor.length];
}
return remainder;
}
static int exor(int a,int b)
{
    if(a==b)
    return 0;
    return 1;
}
static void recieve(int data[],int divisor[])
{
    int remainder[]=divide(data,divisor);
    for(int i=0; i<remainder.length; i++)
    {
        if(remainder[i]!=0)
        {
         System.out.println("There is an error in recieved data...");
         return;
        }
    }
    System.out.println("Data was recieved without any error");
}

*//output
  Enter the size of data:
  7
  Enter the data bit by bit
  1
  0
  1
  1
  0
  0
  1
  Enter the size of divisor:
  3
  Enter the divisor bit by bit
  1
  0
  1
  Message bits after appending divisor.length-1 0's:
  1 0 1 1 0 0 1 1 1
  Enter the data to be sent:
  1
  0
  1
  1
  0
  0
  1
  0
  1 
  Message bits after appending divisor length-1 0's:
  1 0 1 1 0 0 1 0 1 0 0 there is an error in recieved data 
