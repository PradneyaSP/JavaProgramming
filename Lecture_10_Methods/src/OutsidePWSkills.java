import Physics_Wallah.skills.App;

public class OutsidePWSkills {

    public static void main(String[] args) {
        App a = new App();
        System.out.println("Outside package : "+ a.s1);
        App3 a3 = new App3();
        a3.printFromChildClass();
    }
}
//child class of class App
class App3 extends App{
    void printFromChildClass(){
        App3 a2  = new App3();
        System.out.println("Child class : " + a2.s1);
    }
}
