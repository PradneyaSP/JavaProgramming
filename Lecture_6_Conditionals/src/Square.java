import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("Enter length and breadth");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int bre = sc.nextInt();

        if(len==bre){
            System.out.println("It is a square!");
        }else{
            System.out.println("It is not a square!");
        }
    }
}
