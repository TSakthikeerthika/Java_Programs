import java.util.Scanner;
class nestedfor{
    public static void main( String arga[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = scan.nextInt();
        System.out.print("Enter number of columns : ");
        int c = scan.nextInt();

        System.out.println("----------Normal pattern--------------\n");
        for(int i = 1 ; i<= r; i++)
        {
            for(int j = 1 ; j<= c ; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("-----------Left angle triangle---------\n");
        for(int i = 1 ; i<= r ; i++){
            for(int j = 1 ; j<= i ; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("-----------Right angle triangle---------\n");
        for(int i = 1 ; i<= r ; i++){
            for(int j = c ; j>= i; j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
}