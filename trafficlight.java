import java.util.Scanner;
class trafficlight {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter traffic light color : ");
        String color = scan.nextLine();
        color = color.trim();

        System.out.println( color.equalsIgnoreCase("Red") ? "STOP" : ( color.equalsIgnoreCase("Yellow") ? "Wait" :  (color.equalsIgnoreCase("Green") ? "Go" : ("---Enter valid color (Red/yellow/green)---") ) ) );
    }
}