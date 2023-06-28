import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {

        System.out.println("Enter your marks in Physics: ");
        Scanner scn = new Scanner(System.in);
        int mark1 = scn.nextInt();

        System.out.println("Enter your marks in Chemistry: ");
        int mark2 = scn.nextInt();

        System.out.println("Enter your marks in Maths: ");
        int mark3 = scn.nextInt();

        int total= mark1+mark2+mark3;
        System.out.println("The total is: "+ total);

        float perc = total/3;

        System.out.println("The percentage is: "+ perc);

    }
}
