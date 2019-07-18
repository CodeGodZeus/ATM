import java.io.*;
class Bank
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("                WELCOME\n                ALLAHABAD      BANK");
        System.out.println("Enter Your Choice");
        System.out.println("1  ~  Opening New Account\n2  ~  Credit\n3  ~  Debit\n4  ~  Get Detail Of Your Account");
        int ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:
            ACC.Account();
            break;
            case 2:
            Credit.Account();
            break;
            case 3:
            Debit.Account();
            break;
            case 4:
            Detail.Account();
            break;
            default :
            System.out.println("Invalid Choice");
        }
    }
}
                
        