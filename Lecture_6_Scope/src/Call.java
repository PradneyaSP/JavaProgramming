public class Call {

    static void changeValue(int a){
        a *= 100;
    }
    public static void main(String[] args) {
        int a =9;
        System.out.println("Before changing value: " + a);
        changeValue(a);
        System.out.println("After changing value: "+ a);
    }
}
