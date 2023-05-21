import java.util.Scanner;

public class Student {
    int rollno;
    String name;

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println("Enter the name and rollno: ");
        Scanner sc = new Scanner(System.in);
        s1.name = sc.nextLine();
        s1.rollno = sc.nextInt();

        System.out.println("Name: "+s1.name+"  Roll No.: "+ s1.rollno);
    }
}
