import java.util.Scanner;

class ArrayDemo2
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the number of elements in the array : ");
        iNo = sobj.nextInt();

        Array arr = new Array(iNo);

        arr.Accept();
        arr.Disp();

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

    public void Disp()
    {
        System.out.println("The elements divisible by 5 are : ");
        for(int i = 0; i < iSize; i++)
        {
            if((Arr[i] % 5) == 0)
            {
                System.out.print(Arr[i] + " ");
            }
        }
    }
}

