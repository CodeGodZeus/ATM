import java.io.*;
class PIN
{
    public int PIN(String a)throws IOException
    {
        File f=new File("f:\\PIN.csv");
        FileReader fr=new FileReader(f);
        BufferedReader fbr=new BufferedReader(fr);
        String line;
        while((line=fbr.readLine())!=null)
        {
            String ar[]=line.split(",");
            if(a.equalsIgnoreCase(ar[0]))
            {
                int d=Integer.parseInt(ar[1]);
                return d;
            }
        }
        fbr.close();
        fr.close();
        return -1;
    }
}
