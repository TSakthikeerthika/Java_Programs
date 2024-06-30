import java.util.Scanner;
class stringcompare{
    public static void main(String args[])
    {

        System.out.println("Java program to compare 2 strings, (with trim, ignore case ) \n -----------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first string : ");
        String s1 = scan.nextLine();
        s1 = s1.trim();

        System.out.println("Enter second string : ");
        String s2 = scan.nextLine();
        s2 = s2.trim();

        if(s1.equalsIgnoreCase(s2)){
            System.out.println("both strings are same or equal.");
        }
        else{
            System.out.print("both strings are different or not equal");
        }
    }
}