import java.io.*;
class Credit
{
    public static void Account()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        File f=new File("f:\\Accounts.csv");
        File f2=new File("f:\\temp.csv");
        System.out.println("Only to creadit in your account");
        FileReader fr=new FileReader(f);
        BufferedReader fbr=new BufferedReader(fr);
        String line;
        System.out.println("Enter Acc/No.");
        String acc=br.readLine();
        FileWriter fw=new FileWriter(f2);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        while((line=fbr.readLine())!=null)
        {
            String ar[]=line.split(",");

            if(acc.equalsIgnoreCase(ar[0]))
            {
                System.out.println("Enter amount to be credited");
                int n=Integer.parseInt(br.readLine());
                int n1=Integer.parseInt(ar[2]);
                String s=String.valueOf(n1+n);
                pw.println(ar[0]+","+ar[1]+","+s);
                System.out.println("Your account has been successfully creadited");
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
    }
}