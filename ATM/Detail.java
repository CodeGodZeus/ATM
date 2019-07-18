import java.io.*;
class Detail
{
    public static void Account()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        File f=new File("f:\\Accounts.csv");
        System.out.println("Only to get detail of your account");
        FileReader fr=new FileReader(f);
        BufferedReader fbr=new BufferedReader(fr);
        String line;
        System.out.println("Enter Acc/No.");
        String acc=br.readLine();
        System.out.print("\f");
        while((line=fbr.readLine())!=null)
        {
            String ar[]=line.split(",");
            if(acc.equalsIgnoreCase(ar[0]))
            {
                System.out.println("Name = "+ar[1]);
                System.out.println("Acc/No. = "+ar[0]);
                System.out.println("Balance = "+ar[2]);
            }
        }
        fbr.close();
        fr.close();
    }
}