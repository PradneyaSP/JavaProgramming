public class D_Constructor {
    //Constructor is a function which is called everytime an object is created.
    //It has the same name as the class.
    int rollno;
    String name;
    double cgpa;
    //The final keyword makes the variable unchangeable though out the code.
    final String schoolName = "NIT Delhi";
    //static keyword makes a member which is class dependent and not object dependent.
    //It is a shared property.
    private static int numberOfStudents;

    //This is a default constructor which does not take any arguments.
    public D_Constructor() {
        numberOfStudents++;
    }

    //This is a parametrised constructor.
    public D_Constructor(int rollno, String name, double cgpa) {
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
        numberOfStudents++;
    }

    //When we have to share the static int to another package then it's preferable to use getter.
    //This getter function is a static function.
    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void main(String[] args) {
        D_Constructor student = new D_Constructor(221210079, "Pradneya", 8.5);
        System.out.println("Name: " + student.name + "\nRoll No: " + student.rollno + "\nCGPA: " + student.cgpa);
        System.out.println("College: " + student.schoolName + "\n");

        D_Constructor student2 = new D_Constructor(221220047, "Pratyush", 8.4);
        System.out.println("Name: " + student2.name + "\nRoll No: " + student2.rollno + "\nCGPA: " + student2.cgpa);
        System.out.println("College: " + student2.schoolName + "\n");

        D_Constructor student3 = new D_Constructor();
        student3.name = "Piyush";
        student3.rollno = 221230045;
        student3.cgpa = 69.420;
        System.out.println("Name: " + student3.name + "\nRoll No: " + student3.rollno + "\nCGPA: " + student3.cgpa);

        System.out.println("College: " + student3.schoolName + "\n");

        //static variables does not need an object
        System.out.println("Number of Students: " + numberOfStudents);
    }
}
