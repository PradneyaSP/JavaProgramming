import java.util.Arrays;

public class Array_Class {
    static void printArray(int [] a){
        int i = 0 ;
        while (i< a.length) {
            System.out.print(a[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        //trying to copy arr to arr2
        int[] arr2 = Arrays.copyOf(arr, arr.length);    //DEEP COPY
        int[] arr3 = Arrays.copyOf(arr , 3);
        int[] arr4 = Arrays.copyOfRange(arr , 2 ,5 );
        System.out.println("Original Array: ");
        printArray(arr);
        System.out.println("Copied Array 2 : ");
        printArray(arr2);
        System.out.println("Copied Array 3 (copyOf) : ");
        printArray(arr3);
        System.out.println("Copied Array 4 (copyOfRange) : ");
        printArray(arr4);

        //changing some values of arr2

        arr2[2] = 0;
        arr2[3] = 0;

        System.out.println("Original array after changing arr2: ");
        printArray(arr);
        System.out.println("Copied array 2 after changing arr2: ");
        printArray(arr2);
    }
}
