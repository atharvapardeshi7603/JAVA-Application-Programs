import java.util.Scanner;

class ChkSeventhAndFifteenthAndTwentyFirstAndTwentyEighthBit
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean Result = false;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();
    
        Chkbit chk = new Chkbit();

        Result = chk.ChkBit(iNo);

        if(Result)
        {
            System.out.println("7th, 15th, 21st, 28th bits are on");
        }
        else
        {
            System.out.println("Bits is off");
        }

        sobj.close();
    }
}

class Chkbit
{
    public boolean ChkBit(int iNo)
    {
        int iMask = 0x08104040;
        int iRet = iNo & iMask;

        if(iRet == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}