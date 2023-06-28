class Algebra{
    int a = 10;     //member variables. Can be accessed inside the class
    int b = 5;      //Class level scope of variables.

    int add(){
        int p=100,q=40 ;    //Method level scope of variables

        return (p+q);
    }
    int sub(){
        return (a-b);
    }

    static void demo(){
        int k = 10;
        System.out.println(k);

        {
            int l = 1;      //block level scope of variables.
            System.out.println(l);
        }
    }
}





public class Scope {
    public static void main(String[] args) {
        int a = 10;
        /*int a = 11;        -> not possible
          double a;          -> not possible
          String a;          -> not possible
         */
        Algebra a1 = new Algebra();
        System.out.println(a1.add());
        System.out.println(a1.sub());
        Algebra.demo();
    }
}
