import java.util.Scanner;
class forloop{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value for 'a' :  ");
        int a = scan.nextInt();
        System.out.print("Enter value for 'b' :  ");
        int b = scan.nextInt();
        System.out.println("Even numbers between " + a + " and " + b + " are : " );
        for(int i = a; i<= b; i++)
        {
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.print(" \ncount of odd numbers between " + a + " and " + b + " is : ");
        int odd_count = 0;
        for(int i = a; i<= b; i++)
        {
            if(i%2 != 0){
                odd_count += 1;
            }
        }
        System.out.println(odd_count);

        System.out.println("Numbers devisible by both 3 and 5 are : ");
        for( int i = a; i<=b; i++){
            if( (i % 3 == 0) && ( i % 5 == 0)){
                System.out.print(i + " ");
            }
        }


    }
}