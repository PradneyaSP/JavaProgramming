public class A_StudentClass {
    public static class Student {        //Creating a data type
        public String name;
        private int rollno;
        double per;

        //getters ->they help to display private variables outside
        public int getRollno() {
            return rollno;
        }

        //setters ->they help to set the value of private variables from outside the class.
        public void setRollno(int rno) {
            rollno = rno;
        }

        //this ->they tell the computer that the variable used is the member of the class.
        //       and not the local variable used in the function.
        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Pradneya";
        x.rollno = 221210079;
        x.per = 90.81;
        System.out.println(x.name);
        System.out.println(x.rollno);
        System.out.println(x.per);

        Student s = new Student();
        s.name = "Vedarth";
        s.rollno = 50;
        s.per = 85.5;
        System.out.println(s.name);
        System.out.println(s.rollno);
        System.out.println(s.per);
    }
}
