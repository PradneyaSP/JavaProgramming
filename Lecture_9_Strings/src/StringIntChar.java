
public class StringIntChar {
    public static void main(String[] args) {
        String str = "abc";
        str = str + "xyz";
        str = str +10;
        System.out.println(str);

        str = "abc";
        System.out.println(10+20+str);
        System.out.println(str+10+20);
    }
}
