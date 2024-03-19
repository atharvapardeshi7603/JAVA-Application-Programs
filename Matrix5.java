import java.util.Scanner;

class Matrix5
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

        newMat.SwapRows();

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

    public void SwapRows()
    {
        int newMat[][] = new int[iRow][iCol];

        for(int i = 1; i < iRow; i=i+2)
        {
            for(int j = 0; j < iCol; j++)
            {
                newMat[i][j] = Mat[i-1][j];
            }
        }

        for(int i = 0; i < iRow; i=i+2)
        {
            for(int j = 0; j < iCol; j++)
            {
                newMat[i][j] = Mat[i+1][j];
            }
        }

        System.out.println("Elements of the matrix after swapping are : ");
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(newMat[i][j] + " ");
            }
            System.out.println();
        }
        

    }

}