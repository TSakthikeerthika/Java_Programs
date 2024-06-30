import java.util.Scanner;
class print_tables{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to create multipication table : ");
        float num = scan.nextFloat();
        for (int i = 1; i<=10; i++){
            System.out.println(i + " * " + num + " = " + (num*i) );
        }
    }
}