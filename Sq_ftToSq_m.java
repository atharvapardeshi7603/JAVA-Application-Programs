import java.util.Scanner;

class Sq_ftToSq_m
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        float sq_ft = 0.0f;
        float sq_m = 0.0f;

        System.out.println("Enter the area in square feet : ");
        sq_ft = sobj.nextFloat();

        sq_m = sq_ft * (0.0929f);

        System.out.println("The area in square meter is : " + sq_m);

        sobj.close();
    }
}