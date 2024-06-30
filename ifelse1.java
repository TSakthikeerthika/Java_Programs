import java.util.Scanner;
class ifelse1{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Java program for exam results using if else : \n ----------------------------------------");

        System.out.print("Enter mark out of 100 in subject 1  : ");
        float m1 = scan.nextFloat();
         System.out.print("Enter mark out of 100 in subject 2 : ");
        float m2 = scan.nextFloat();
         System.out.print("Enter mark out of 100 in subject 3 : ");
        float m3 = scan.nextFloat();
         System.out.print("Enter mark out of 100 in subject 4 : ");
        float m4 = scan.nextFloat();
         System.out.print("Enter mark out of 100 in subject 5 : ");
        float m5 = scan.nextFloat();

        if( (m1 >= 35) && (m2 >= 35) && ( m3 >= 35) && ( m4 >= 35) && (m5 >= 35) ){
            System.out.println(" Result :  PASS ");
            float total_marks = (m1+m2+m3+m4+m5);
            float average_marks = (total_marks / 5);
            System.out.println(" Total marks : "+ total_marks + "/500");
            System.out.println(" Percentage : "+ average_marks + " %");
            if(average_marks<50){
                System.out.println("--------Need To Improve your studies----------");
            }
            else if(average_marks==50 || average_marks<=70){
                System.out.println("------------Good Job---------------");
            }
            else{
                System.out.println("-------------------Great Job, keep it up----------------");
            }

        }
        else{
            System.out.println("Result : FAIL \n Better luck next time ! keep preparing ! ");
        }

        

    }
}