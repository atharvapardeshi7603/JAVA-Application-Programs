class SLLtemplate
{
    public static void main(String Arg[])
    {
        
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
}