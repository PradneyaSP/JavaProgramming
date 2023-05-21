public class B_PassingClassToFunc {
    public static class Student2 {        //Creating a data type
        String name;
        int rollno;
        double per;
    }

    public static void display(Student2 s) { //We have to declare the class outside
        System.out.println(s.name);
        System.out.println(s.rollno);
        System.out.println(s.per);
        System.out.println();
    }

    public static void change(Student2 s) {  //Classes are passed by reference
        s.name = "Pradneya Prabhudesai";
    }

    public static void main(String[] args) {
        Student2 x = new Student2();
        x.name = "Pradneya";
        x.rollno = 221210079;
        x.per = 90.81;
        System.out.println(x.name);
        System.out.println(x.rollno);
        System.out.println(x.per);
        System.out.println("\nPassing to Function: ");
        display(x);
        change(x);
        System.out.println("After Change:");
        display(x);
    }
}
