import java.util.Scanner;

class Recursion2
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
        if(iCnt <= iNo)
        {
            System.out.print(iCnt + " ");
            iCnt++;
            display(iNo);
        }
    }
}