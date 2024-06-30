import java.util.Scanner;
class rcbcup{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the final results : ");
        String result = scan.nextLine();
        result = result.trim();

        String condition = "RCB won the final";

        if(result.equalsIgnoreCase(condition)){
            System.out.println("Ee Sala cup namde...!");
        }
        else{
            System.out.println("Better luck next time..!");
        }
    }
}