import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner (System.in);
        System.out.println("Enter length of a rectangle");
        int Length = myObj.nextInt();
        System.out.println("Enter height of a rectangle");
        int Height = myObj.nextInt();
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < Length; i++)
        {
            stars. append("*");
        }
        for (int x = 0; x < Height; x++)
        {
            System.out.println(stars);
        }
    }
}
