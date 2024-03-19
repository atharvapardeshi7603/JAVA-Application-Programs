import java.util.Scanner;

class FhToCs
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        float fahr = 0.0f;
        float celcius = 0.0f;

        System.out.println("Enter the temperature in Fahrenheit : ");
        fahr = sobj.nextFloat();

        celcius = (float)(5.0f/9.0f)*(fahr - 32.0f);

        System.out.println("The temperature in celcius is : " + celcius);

        sobj.close();
    }
}