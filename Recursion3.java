import java.util.Scanner;

class Recursion3
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Display dobj = new Display();

        dobj.display(iValue);

        sobj.close();
    }
}

class Display
{
    int iCnt = 1;

    public void display(int iNo)
    {
        if(iNo > 0)
        {
            System.out.print(iNo + " ");
            iNo--;
            display(iNo);
        }
    }
}