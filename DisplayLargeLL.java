class DisplayLargeLL
{
    public static void main(String Arg[])
    {
        SinglyLL sll = new SinglyLL();

        sll.InsertFirst(11);
        sll.InsertLast(250);
        sll.InsertLast(532);
        sll.InsertLast(419);

        sll.Display();

        sll.DisplayLargestDigitOfEachElement();
    }
}

class Node
{
    int data;
    Node next;

    Node(int A)
    {
        data = A;
        next = null;
    }
}

class SinglyLL
{
    Node first = null;
    private int Count = 0;

    public void InsertFirst(int No)
    {
        Node newn = null;
        newn = new Node(No);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }
        Count++;
    }

    public void DeleteFirst()
    {
        if(first == null)
        {
            System.out.println("ERROR : LL is empty");
            return;
        }
        else
        {
            first = first.next;
        }
        Count--;
    }

    public void InsertLast(int No)
    {
        Node newn = null;
        newn = new Node(No);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            Node temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }
        Count++;
    }

    public void DeleteLast()
    {
        if(first == null)
        {
            System.out.println("ERROR : LL is empty");
            return;
        }
        else
        {
            Node temp = first;

            while(temp.next.next != null)
            {
                temp = temp.next;
            }

            temp.next = null;
        }
        Count--;
    }

    public void Display()
    {
        Node temp = first;

        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public int Count()
    {
        return Count;
    }

    public void InsertAtPos(int No, int Pos)
    {
        if((Pos < 1) || (Pos > (Count+1)))
        {
            System.out.println("Invalid position");
            return;
        }
        else if(Pos == 1)
        {
            InsertFirst(No);
        }
        else if(Pos == (Count+1))
        {
            InsertLast(No);
        }
        else
        {
            Node newn = null;
            newn = new Node(No);

            Node temp = first;

            for(int i = 1; i < (Pos-1); i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next = newn;
            Count++;
        }
    }

    public void DeleteAtPos(int Pos)
    {
        if((Pos < 1) || (Pos > Count))
        {
            System.out.println("Invalid position");
            return;
        }
        else if(Pos == 1)
        {
            DeleteFirst();
        }
        else if(Pos == Count)
        {
            DeleteLast();
        }
        else
        {
            Node temp = first;

            for(int i = 1; i < (Pos-1); i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            Count--;
        }
    }

    public int Reverse(int iNo)
    {
        int iCopy = iNo;
        int iDigit = 0;
        int iRev = 0;

        while(iCopy > 0)
        {
            iDigit = iCopy % 10;
            iRev = (iRev*10) + iDigit;
            iCopy = iCopy / 10;
        }

        return iRev;
    }

    public void ReverseEachElement()
    {
        Node temp = first;

        System.out.println("Reversing each element...");

        while(temp != null)
        {
            temp.data = Reverse(temp.data);
            temp = temp.next;
        }
    }

    public boolean ChkPallindrome(int iNo)
    {
        boolean bRet = false;

        int iRev = 0;
        int iCopy = iNo;
        int iDigit = 0;

        while(iCopy > 0)
        {
            iDigit = iCopy % 10;
            iRev = (iRev*10) + iDigit;
            iCopy = iCopy / 10;
        }

        if(iRev == iNo)
        {
            bRet = true;
        }

        return bRet;
    }

    public void DisplayPallindromeElements()
    {
        Node temp = first;
        boolean bTemp = false;

        System.out.println("Pallindrome elements in the LL are : ");

        while(temp != null)
        {
            bTemp = ChkPallindrome(temp.data);

            if(bTemp)
            {
                System.out.print(temp.data + " ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public int ProductOfDigits(int iNo)
    {
        int iProd = 1;
        int iCopy = iNo;
        int iDigit = 0;

        while(iCopy > 0)
        {
            iDigit = iCopy % 10;

            if(iDigit == 0)
            {
                iDigit = 1;
            }

            iProd = iProd * iDigit;
            iCopy = iCopy / 10;
        }

        return iProd;


    }

    public void DisplayProductOfEachElement()
    {
        Node temp = first;
        int iTemp = 0;

        System.out.println("Product of digits of each element is : ");

        while(temp != null)
        {
            iTemp = ProductOfDigits(temp.data);
            System.out.print(iTemp + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public int Smallest(int iNo)
    {
        int iCopy = iNo;
        int iDigit = 0;
        int iMin = iNo;

        while(iCopy > 0)
        {
            iDigit = iCopy % 10;
            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
            iCopy = iCopy / 10;
        }

        return iMin;
    }

    public void DisplaySmallestDigitOfEachElement()
    {
        Node temp = first;
        int iTemp = 0;

        System.out.println("Smallest digit of each element is : ");

        while(temp != null)
        {
            iTemp = Smallest(temp.data);
            System.out.print(iTemp + " ");
            temp = temp.next;
        }
    }

    public int Largest(int iNo)
    {
        int iCopy = iNo;
        int iDigit = 0;
        int iMax = 0;

        while(iCopy > 0)
        {
            iDigit = iCopy % 10;
            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
            iCopy = iCopy / 10;
        }

        return iMax;
    }

    public void DisplayLargestDigitOfEachElement()
    {
        Node temp = first;
        int iTemp = 0;

        System.out.println("Largest digit of each element is : ");

        while(temp != null)
        {
            iTemp = Largest(temp.data);
            System.out.print(iTemp + " ");
            temp = temp.next;
        }
    }
}