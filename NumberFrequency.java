import java.util.Scanner;

class NumberFrequency
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, iRet = 0, iNo = 0;

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        Array aobj = new Array(iSize);

        aobj.Accept();
        aobj.Display();

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iRet = aobj.Frequency(iNo);

        System.out.println("Frequency of " + iNo + " is : " + iRet);

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

    public int Frequency(int A)
    {
        int iFreq = 0;

        for(int i = 0; i < iSize; i++)
        {
            if(Arr[i] == A)
            {
                iFreq++;
            }
        }

        return iFreq;
    }
}