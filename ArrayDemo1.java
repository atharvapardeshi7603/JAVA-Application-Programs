import java.util.Scanner;

class ArrayDemo1
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iDiff = 0;

        System.out.println("Enter the number of elements in the array : ");
        iNo = sobj.nextInt();

        Array arr = new Array(iNo);

        arr.Accept();
        arr.Display();

        iDiff = arr.Difference();

        System.out.println("The difference is : " + iDiff);

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
        System.out.println("Enter the elements : ");
        for(int i = 0; i < iSize; i++)
        {
            System.out.print("Enter the element no " + (i + 1) + " : ");
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of the array are : ");
        for(int i = 0; i < iSize; i++)
        {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    public int Difference()
    {
        int iEvenSum = 0;
        int iOddSum = 0;

        for(int i = 0; i < iSize; i++)
        {
            if((Arr[i] % 2) == 0)
            {
                iEvenSum += Arr[i];
            }
            else
            {
                iOddSum += Arr[i];
            }
        }

        return (iEvenSum - iOddSum);
    }
}

