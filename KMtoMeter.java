import java.util.Scanner;

class KMtoMeter
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        float KM = 0.0f;
        
        System.out.println("Enter the distance in kilometers : ");
        KM = sobj.nextFloat();

        System.out.println("The distance in meter is : " + (KM*1000));

        sobj.close();
    }
}