// Buffer Input Technique 
import java.io.*;


class inputoutput
{
    public static void main(String a[]) throws Exception
    {   
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first number : ");

        int ino1 = Integer.parseInt(bobj.readLine());

        System.out.println("Enter the Second number " );

        int ino2 = Integer.parseInt(bobj.readLine());

        int Ans = ino1 + ino2;

        System.err.println("Addition is "+Ans);
    }   
}