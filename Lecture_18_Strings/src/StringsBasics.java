import java.util.*;

public class StringsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Pradneya Prabhudesai";
        System.out.println(str);

        String st = sc.next();      //Does not take anything after space;
        System.out.println(st);
        st = sc.nextLine();
        st = sc.nextLine();         //Takes complete input
        System.out.println(st);

        String str1 = "Vedu Babu";
        System.out.println(str1.length());  //Finds the length of string
        char ch = str.charAt(2);    //finds char at a particular position
        System.out.println(ch);

        int idx = str.indexOf('a'); //will return the index of first occurring element
        String str2 = "Vedu Babu";
        System.out.println(str.compareTo(str2));    //Compares 2 strings.
        System.out.println(str1.compareTo(str2));   //Returns 0

        String str3 = "Physics Wallah";
        System.out.println(str3.contains("Wal"));
        System.out.println(str3.startsWith("Wa"));
        System.out.println(str3.endsWith("ah"));

        //str3.toLowerCase() or str3.toUpperCase();

        String s1 = str2.concat(str3);  //concatenation
        System.out.println(s1);
    }
}
