import java.util.Scanner;

class AreaOfCircle
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int Radius = 0;
        final double PI = 3.14;

        System.out.println("Enter the radius of the circle : ");
        Radius = sobj.nextInt();

        System.out.println("Area of circle is : " + (Radius*Radius*PI));

        sobj.close();
    }
}