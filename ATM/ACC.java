import java.io.*;
class ACC
{
    public static void Account()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        File f=new File("f:\\Accounts.csv");
        FileWriter fw=new FileWriter(f,true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        System.out.print("\f");
        System.out.println("Only For New Accounts Opening");
        System.out.println("Enter fullname");
        String name=br.readLine();
        System.out.println("Enter Amount to be credited");
        String cr=br.readLine();
        FileReader fr1=new FileReader(f);
        BufferedReader fbr1=new BufferedReader(fr1);
        int x=1;
        String line1;
         while((line1=fbr1.readLine())!=null)
        {
            x++;
        }
        fbr1.close();
        fr1.close();
        pw.println(x+","+name+","+cr);
        pw.close();
        bw.close();
        fw.close();
        FileReader fr=new FileReader(f);
        BufferedReader fbr=new BufferedReader(fr);
        String line;
        System.out.print("\f");
        while((line=fbr.readLine())!=null)
        {
            String ar[]=line.split(",");
            if(name.equalsIgnoreCase(ar[1]))
            {
                System.out.println("Your Account has been sucessfully Created :\nNAME     "+ar[1]+"\nACC/NO       "+ar[0]);
                break;
            }
        }
        fbr.close();
        fr.close();
    }
}
