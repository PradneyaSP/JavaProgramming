public class Interning {
    public static void main(String[] args) {
        String s = "Hello";
        String x = "Hello";         //s and x point to the same memory location "Hello"
        System.out.println(s);
        System.out.println(x);

        String w = new String("Hello");         //w and s point to different "Hello"
        System.out.println(w);

        System.out.println(s==x);
        System.out.println(s==w);           //compares address
        System.out.println(s.equals(w));    //compares strings
    }
}
