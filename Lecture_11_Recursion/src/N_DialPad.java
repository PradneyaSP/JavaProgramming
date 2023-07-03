import java.util.Scanner;

public class N_DialPad {
    static String[] keymap = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    static void dialpad (String str , String ans){
        if(str.length()==0){
            System.out.print(ans + " ");
            return;
        }

        int n = str.charAt(0)-'0';
        String currLetters = keymap[n];
        for(int i = 0 ; i < currLetters.length() ; i++)
            dialpad(str.substring(1),ans + currLetters.charAt(i));
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println("The total combinations are : ");
        dialpad(str,"");
    }
}
