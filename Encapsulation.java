
class Arithematic
{
    public int ino1;
    public int ino2;

    public Arithematic(int A , int B)
    {
        this.ino1 = A;
        this.ino2 = B;    
    }
    public Arithematic()
    {
        this.ino1 = 11;
        this.ino2 = 21;
    }   

    public int Addition()
    {
        int Ans = 0;

        Ans = ino1 + ino2;

        return Ans;
    }
    public int Substraction()
    {
        int Ans = 0;
        Ans = ino1 - ino2;
        return Ans;
    }
}
public class Encapsulation 
{
    public static void main(String a[])
    {       
        Arithematic aobj1 = new Arithematic(21,31);
        Arithematic aobj2 = new Arithematic();

        int iRet = aobj1.Addition();
        System.out.println("Addition of two number is : "+iRet);
        iRet = aobj1.Substraction();
        System.out.println("substtaction  is of two number is : "+iRet); 
        iRet  = aobj2.Addition();
        System.out.println("Addition is "+iRet);
        iRet = aobj2.Substraction();
        System.out.println("Subsraction  is "+iRet);

    }   
}
