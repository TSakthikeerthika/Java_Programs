import java.util.Scanner;

class add3num{
    public static void main(String args[])
    {
        System.out.println("Program to add 3 numbers : \n ---------------------");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = scan.nextInt();

        System.out.print("Enter num2: ");
        int num2 = scan.nextInt();

        System.out.print("Enter num3: ");
        int num3 = scan.nextInt();

        System.out.println("The output for "+ num1 + " + " + num2 + " + " + num3 + " is :-  "+ (num1 + num2 + num3));

        System.out.println("Program finished..!");
    }
}