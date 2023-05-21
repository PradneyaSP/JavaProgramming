import java.util.Arrays;

public class Array_Reference {
    static void printArray(int [] a){
        for(int i = 0 ;i< a.length ; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        //trying to copy arr to arr2
        // int[] arr2 = Arrays.copyOf(arr, arr.length);   //DEEP COPY
        int [] arr2 = arr.clone();         // DEEP COPY
        //int [] arr2 = arr ;         ---> SHALLOW COPY

        System.out.println("Original Array: ");
        printArray(arr);
        System.out.println("Copied Array: ");
        printArray(arr2);

        //changing some values of arr2

        arr2[2] = 0;
        arr2[3] = 0;

        System.out.println("Original array after changing arr2: ");
        printArray(arr);
        System.out.println("Copied array 2 after changing arr2: ");
        printArray(arr2);
    }
}
