public class C_AccessModifiers {
    public static void main(String[] args) {
        //creating an object of a class from different file
        A_StudentClass.Student s = new A_StudentClass.Student();
        s.name = "John";
        s.per = 10.00;
        //We cant access roll no because it is private attribute.
        //s.rollno cannot be used. Private attribute can only be used inside the class
        /*
         * Public - All Packages
         * Private - Same Class
         * Default - Same Package
         * All data types without access modifiers are automatically considered default
         */
        System.out.println(s.name + "\n" + s.per);
        //Using the setter to set the value of rollno.
        s.setRollno(69420);
        //Using the getter to print rollno.
        System.out.println(s.getRollno());
    }
}
