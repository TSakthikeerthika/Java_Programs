import java.util.Scanner;
import java.util.Random;
class whileloop{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of times : ");
        int size = scan.nextInt();

        System.out.print("Enter Range form 0 to  : ");
        int rng = scan.nextInt();

        Random rand = new Random();
        int number = 0;
        
        for(int i = 1; i <= size; i++){
            number = rand.nextInt(rng);
            System.out.print(number + " ");
        }
        


    }
}