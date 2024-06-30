import java.util.Scanner;
class ifelse{
    public static void main(String args[])
    {

        System.out.println("Java Program for compare two numbers \n ------------------------------------\n");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = scan.nextInt();

        System.out.print("Enter number 2 : ");
        float num2 = scan.nextFloat();

        if(num1 == num2 ){
            System.out.println("Both numbers are equal, please enter different numbers to comapre ..! ");
        }
        else{
            if(num1 > num2){
                System.out.println("number1 is greater than number2 (or) number2 is less than number1");
            }
            else{
                System.out.println("number2 is greater than number1 (or) number1 is less than number2");
            }
        }
    }

}