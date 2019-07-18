/**
 * This Program Is Based On The ATM Machine. 
 * Author ADITYA PANDEY 
 * Version 8.2 updated on 09/September/2015
 */
import java.io.*;
class ATM
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int z;
        Denomination ob=new Denomination();
        PIN Ob=new PIN();
        int c=0;
        do
        {
                        System.out.print("\f");
            c++;
            System.out.println("                WELCOME\nBANK OF BARODA ATM  बैंक ऑफ़ बड़ौदा ऐटीएम");
            try
            {
                System.out.println("Press ENTER key......");
                char q=(char)br.read();
                System.out.println("Choose your Language  1 - for ENGLISH , 2 - हिंदी के लिये");
                int d=Integer.parseInt(br.readLine());
                String a="";
                int m=0,y=0;
                if(d==1)
                {
                    System.out.println("Enter Your ATM Card Name");
                    a=br.readLine();
                    System.out.println("Your card is being reading");
                    Thread.sleep(5000);
                    System.out.println("Enter your pin number");
                    int n=Integer.parseInt(br.readLine());
                    if(n==(Ob.PIN(a)))
                    {
                        System.out.println("1 - Saving Bank       2 - Current Bank");
                        int o=Integer.parseInt(br.readLine());
                        if(o==1)
                        {
                            System.out.println("Enter Withdrawl Amount");
                            m=Integer.parseInt(br.readLine());
                            System.out.println("\f");
                            System.out.println("You want recipt\n1 ~ Yes     2 ~ No");
                            y=Integer.parseInt(br.readLine());
                            System.out.println("Your Transaction Is Being Processed");
                            Thread.sleep(5000);

                        }

                        else if(o==2)
                        {
                            System.out.println("Enter Withdrawl Amount");
                            m=Integer.parseInt(br.readLine());
                            System.out.println("\f");
                            System.out.println("You want recipt\n1 ~ Yes     2 ~ No");
                            y=Integer.parseInt(br.readLine());
                            System.out.println("Your Transaction Is Being Processed");
                            Thread.sleep(5000);

                        }
                        else
                        {
                            System.out.println("Invalid Choice");
                        }
                    }
                    else
                    {
                        System.out.println("Incorect Password");
                    }
                }
                else if(d==2)
                {
                    System.out.println("अपने ऐटीएम कारड का नाम लिखीयें ।");
                    a=br.readLine();
                    System.out.println("आपका कारड पढ़ॉं जा रहैं । ");
                    Thread.sleep(5000);
                    System.out.println("अपना ऐटीएम पिंन संखया लिखीय ।");
                    int n=Integer.parseInt(br.readLine());
                    if(n==(Ob.PIN(a)-n))
                    {
                        System.out.println("१ -  सेविंग बैंक      २ - करैंट बैंक");
                        int o=Integer.parseInt(br.readLine());
                        if(o==1)
                        {
                            System.out.println("पैसा निकालने की राशी भरिये");
                            m=Integer.parseInt(br.readLine());
                            System.out.println("\f");
                            System.out.println("क्या आपको रशीद चाहिऐ\n१ ~ हाँ     २ ~ नहीं");
                            y=Integer.parseInt(br.readLine());
                            System.out.println("आपकि प्रकि्रया हो रही है ");
                            Thread.sleep(5000);

                        }
                        else if(o==2)
                        {
                            System.out.println("पैसा निकालने की राशी भरिये");
                            m=Integer.parseInt(br.readLine());
                            System.out.println("\f");
                            System.out.println("क्या आपको रशीद चाहिऐ\n१ ~ हाँ     २ ~ नहीं");
                            y=Integer.parseInt(br.readLine());
                            System.out.println("आपकि प्रकि्रया हो रही है ");
                            Thread.sleep(5000);

                        }
                        else
                        {
                            System.out.println("आपने गलत अंक दबाया है");
                        }
                    }
                    else
                    {
                        System.out.println("आपने गलत कोड भरे है");
                    }
                }
                else
                {   
                    if(d==1)
                    {
                        System.out.println("Invalid Choice");
                    }
                    else
                    {
                        System.out.println("आपने गलत अंक दबाया है");
                    }
                }
                if(y==1)
                {
                    ob.Denomination(m,c,a);
                }
                if(d==1)
                {
                    System.out.println("If you want more money to withdrawl Press {1 - YES / 2 - NO}");
                    z=Integer.parseInt(br.readLine());
                }
                else
                {
                    System.out.println("अगर आप औंर पैसे निकालना चाहतें हैं तो दबाया {१ - हॉं /२  - नहीं}");
                    z=Integer.parseInt(br.readLine());
                }
            }
            catch(Exception e)
            {
                System.out.println("You entered a WRONG input.\n\tTry Again");
                System.out.println("If you want more money to withdrawl Press {1 - YES / 2 - NO}");
                z=Integer.parseInt(br.readLine());
            }
        }while(z==1);
    }
}