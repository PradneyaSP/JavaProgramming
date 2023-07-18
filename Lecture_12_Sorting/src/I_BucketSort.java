import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class I_BucketSort {

    public static void main(String[] args) {
        System.out.println("Enter the length of Array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];

        System.out.println("Enter the Array : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextFloat();

        //Bucket Sort
        bucketSort(arr);

        System.out.println("The Sorted Array is : ");
        for (float val : arr)
            System.out.print(val + " ");
    }

    private static void bucketSort(float[] arr) {
        int n = arr.length;
        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        //Adding element into bucket
        for (float v : arr) {
            int bucketIndex = (int) v * 10;
            buckets[bucketIndex].add(v);
        }

        //Sorting all the buckets
        for (int i = 0; i < n; i++)
            Collections.sort(buckets[i]);

        //merge all buckets
        int index = 0;
        for (int i = 0 ; i < n ; i++){
            ArrayList<Float> currBucket = buckets[i];
            for(float v : currBucket){
                arr[index++]= v;
            }
        }
    }
}
