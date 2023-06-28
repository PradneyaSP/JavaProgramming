import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        System.out.println("Enter the cost price and selling price: ");
        Scanner sc = new Scanner(System.in);

        int cp = sc.nextInt();
        int sp = sc.nextInt();

        if(sp>cp){
            int profit = sp-cp;
            System.out.println("Profit: " + profit);
        }else if (sp<cp){
            int loss = cp-sp;
            System.out.println("Loss: " + loss);
        }else{
            System.out.println("No profit, No loss");
        }
    }
}
