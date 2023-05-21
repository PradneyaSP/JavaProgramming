public class App {

    static void printArray(int [] a){
        for(int i = 0 ;i< a.length ; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    static void changeArray(int [] a){
        for(int i = 0 ; i<a.length ; i++)
            a[i]=0;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3};

        printArray(arr);
        System.out.println("After changing: ");
        changeArray(arr);
        printArray(arr);
    }
}
