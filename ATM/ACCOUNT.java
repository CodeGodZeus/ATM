import java.io.*;
class ACCOUNT
{
    public int ACCOUNT(String a)throws IOException
    {
        File f=new File("f:\\Accounts.csv");
        FileReader fr=new FileReader(f);
        BufferedReader fbr=new BufferedReader(fr);
        String line;
        while((line=fbr.readLine())!=null)
        {
            String ar[]=line.split(",");
            if(a.equalsIgnoreCase(ar[1]))
            {
                int d=Integer.parseInt(ar[2]);
                return d;
            }
        }
        fbr.close();
        fr.close();
        return -1;
    }
}
