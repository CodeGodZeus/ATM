import java.io.*;
class Debit
{
    public static void Account()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        File f=new File("f:\\Accounts.csv");
        File f2=new File("f:\\temp.csv");
        System.out.println("Only to debit in your account");
        FileReader fr=new FileReader(f);
        BufferedReader fbr=new BufferedReader(fr);
        String line;
        System.out.println("Enter Acc/No.");
        String acc=br.readLine();
        FileWriter fw=new FileWriter(f2);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        boolean money=false;
        while((line=fbr.readLine())!=null)
        {
            String ar[]=line.split(",");
            if(acc.equalsIgnoreCase(ar[0]))
            {
                System.out.println("Enter amount to be withdrawl");
                int n=Integer.parseInt(br.readLine());
                int n1=Integer.parseInt(ar[2]);
                String s;
                if(n1>n)
                {
                    s=String.valueOf(n1-n);
                    money=true;
                    System.out.println("Your account has been successfully debited");
                }
                else
                {
                    s=String.valueOf(n1);
                    money=false;
                }
                pw.println(ar[0]+","+ar[1]+","+s);
            }
            else
            {
                pw.println(line);
            }

        }
        pw.close();
        bw.close();
        fw.close();
        fbr.close();
        fr.close();
        f.delete();
        f2.renameTo(f);
        if(money==false)
        {
            System.out.println("Not enough money in your account");
        }
    }
}