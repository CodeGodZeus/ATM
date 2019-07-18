import java.io.*;
import java.util.Date;
class Denomination
{
    public void Denomination(int n,int c,String a)throws Exception
    {
        Date C=new Date();
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int no[]={1000,500,100,50,20,10,5,2,1};
        int ac=0;
        String date=String.valueOf(C);
        date=date.substring(0,19)+" 2015";
        ACCOUNT Ob=new ACCOUNT();
        int acc=Ob.ACCOUNT(a);
        if(c>2)
        {
            ac=ac+20;
        }
        int t=n-ac,n1=t;
        acc=acc-t;
        Debited.Account(a,t);
        
        System.out.print("\f");
        System.out.println("*********************************************************************");
        System.out.println("                WELCOME\nBANK OF BARODA ATM  बैंक ऑफ़ बड़ौदा ऐटीएम\n");
        System.out.println("Date                  :  "+date);
        System.out.println("Card Name             :  "+a.toUpperCase());
        System.out.println("Withdrawl Amount      :  Rs. "+n);
        System.out.println("Access Fee            :  Rs. "+ac);
        System.out.println("Total Amount          :  Rs. "+(n-ac));
        System.out.println("Available Amount      :  Rs. "+acc);
        for(int x=0;x<=no.length-1;x++)
        {
            int d=n/no[x];
            if(d>0)
            {
                System.out.println(no[x]+"\tX\t"+d+"\t=\t"+d*no[x]);
            }
            n=n%no[x];
        }
        System.out.println("_________________________________________________");
        System.out.print(Number.To_Words(n1)+"\n");
        System.out.println("_________________________________________________");
        System.out.print("*********************************************************************");
        System.out.println("\n\n");
    }
}