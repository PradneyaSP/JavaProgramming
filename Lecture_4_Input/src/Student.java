import java.util.Scanner;

//input name, roll number and field of interest from user and print in the format below :
//Name: xyz, Roll number: xyz, Field of interest: xyz
public class Student {
    public static void main(String[] args) {
        int rollNo;

        System.out.println("Enter Name, roll number and field of interest: ");
        Scanner sc= new Scanner(System.in);

        java.lang.String name = sc.nextLine();
        rollNo = sc.nextInt();
        Scanner s= new Scanner(System.in);
        java.lang.String FoI = s.nextLine();

        System.out.println("Name: "+ name + " , Roll number: " + rollNo + " , Field of interest: "+ FoI);
    }
}
