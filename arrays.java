import java.util.Scanner;
class arrays{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Java Program to array");
        System.out.print("Enter number of elements in array: ");
        int size = scan.nextInt();
        int [] arr1 = new int [size];

        for(int i = 0; i<size ; i++){
            System.out.print("Enter ["+ i+"]th element in array : ");
            arr1[i] = scan.nextInt();
        }
        System.out.println("\n\nThe given array is : ");
        for( int i = 0 ; i< size; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\n\nSum of all element in given array is : ");
        int sum = 0;
        for( int i = 0 ; i< size; i++){
            sum += arr1[i];

        }
        System.out.println(sum);

        int mid = (size+1)/2;
        System.out.print("Middle element of given array is : "+ arr1[mid]);
        
    }
}