import java.util.Scanner;

class CheckEleven
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;
        boolean Result = false;

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        Array aobj = new Array(iSize);

        aobj.Accept();
        aobj.Display();

        Result = aobj.CheckEleven();

        if(Result)
        {
            System.out.println("Eleven is present");
        }
        else
        {
            System.out.println("Eleven is absent");
        }

        sobj.close();
    }
}

class Array
{
    Scanner sobj = new Scanner(System.in);

    int iSize;
    int Arr[];

    Array(int A)
    {
        iSize = A;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < iSize; i++)
        {
            System.out.print("Enter the element no " + (i+1) + " : ");
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of the Array are : ");

        for(int i = 0; i < iSize; i++)
        {
            System.out.print(Arr[i] + " ");
        }

        System.out.println();
    }

    public boolean CheckEleven()
    {
        boolean bRet = false;

        for(int i = 0; i < iSize; i++)
        {
            if(Arr[i] == 11)
            {
                bRet = true;
                break;
            }
        }

        return bRet;
    }
}