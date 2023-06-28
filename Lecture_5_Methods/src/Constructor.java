import java.util.Scanner;

class Maths{
    int a,b;
    Maths(int x, int y){
     a =x;
     b=y;
    }

    int add(){
        return a+b;
    }

    int sub(){
        return a-b;
    }

    int product(){
        return a*b;
    }

    float div(){
        return a/b;
    }
}

public class Constructor {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter x and y: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();


        Maths M1 = new Maths(a,b);
        System.out.println("Sum: "+ M1.add());
        System.out.println("Sub: "+ M1.sub());
        System.out.println("Pro: "+ M1.product());
        System.out.println("Div: "+ M1.div());
    }
}
