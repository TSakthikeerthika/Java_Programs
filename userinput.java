import java.util.Scanner;

class userinput{
    public static void main(String args [])
    {
        //creating object to scanner class
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter A: ");
        float a = scan.nextFloat();
        
        scan.nextLine(); //to get input for string after int or float inputs 
        
        System.out.println("Enter String : ");
        String b = scan.nextLine();

        System.out.println("The output is: "+ a + " and " + b);



    }
}