package src;

import java.util.Scanner;

public class TargetSum {

     public static void Sum(int[] a, int target){
        int []pair = new int [2];
        int flag=0;
        System.out.println("The pairs are:  ");
        for(int i=0; i<a.length ; i++){
            pair[0]=a[i];
            for(int j=i+1 ; j<a.length ; j++){
                if(a[i] + a[j]==target){
                    pair[1]=a[j];
                    flag = 1;
                }
                if(flag == 1){
                    System.out.println("("+pair[0] +" , " + pair[1]+")");
                    flag=0;
                }

            }

        }
    }

    public static void main(String[] args) {
        int target,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array : ");
        for(int i=0 ; i< n; i++ )
            arr[i]= sc.nextInt();

        System.out.println("Enter the target sum: ");
        target = sc.nextInt();

        Sum(arr,target);
    }
}
