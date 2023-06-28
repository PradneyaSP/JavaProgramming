package Physics_Wallah.skills;

class App2{
     void printFromOutside(){
         App a2 = new App();
         System.out.println("Within package , outside class : "+ a2.s1);
     }
}
public class App {
    public String s1 = "I am public member";

    public App(){
        System.out.println("MOSHI MOSHI.......!!");
    }
    void printFromClass(){
        System.out.println("Within class, outside main: " + s1);
    }
    public static void main(String[] args) {

        App a = new App();
        System.out.println("Within class, inside main: "+ a.s1 );
        a.printFromClass();

        App2 a3 = new App2();
        a3.printFromOutside();
    }


}

