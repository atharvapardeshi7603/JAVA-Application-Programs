import java.util.Scanner;

class Matrix4
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0; 
        int iCol = 0;

        System.out.println("Enter the number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iCol = sobj.nextInt();

        Matrix newMat = new Matrix(iRow, iCol);
        
        newMat.Accept();
        newMat.Display();

        newMat.AddColumn();

        sobj.close();
    }
}

class Matrix
{
    Scanner sobj = new Scanner(System.in);

    int iRow, iCol;
    int Mat[][];

    Matrix(int A, int B)
    {
        iRow = A;
        iCol = B;
        Mat = new int[iRow][iCol];
    }

    public void Accept()
    {
        System.out.println("Enter the elements of the matrix : ");
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Mat[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("Elements of the matrix are : ");
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void AddColumn()
    {
        int Addition = 0;

        System.out.println("Column-wise addition is : ");

        for(int i = 0; i < iCol; i++)
        {
            Addition = 0;

            for(int j = 0; j < iRow; j++)
            {
                Addition += Mat[j][i];
            }

            System.out.print(Addition + " ");
        }
    }

}