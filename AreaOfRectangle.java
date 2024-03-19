import java.util.Scanner;

class AreaOfRectangle
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        float Width = 0.0f;
        float Height = 0.0f;
        
        System.out.println("Enter the width of the rectangle : ");
        Width = sobj.nextFloat();

        System.out.println("Enter the height of the rectangle : ");
        Height = sobj.nextFloat();

        System.out.println("The area of the rectangle is : " + (Width*Height));

        sobj.close();
    }
}