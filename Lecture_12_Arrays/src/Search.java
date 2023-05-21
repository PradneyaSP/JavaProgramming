import java.util.Scanner;

public class Search {
    int se(int [] a,int b){
        int i=0,flag=0;
        for(;i<a.length;i++){
            if(a[i]==b){
                flag++;
                break;
            }

        }
        if(flag>0)
            return i;
        else
            return -1;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10} ;
        System.out.println("Enter the element to be searched: ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        Search s1 = new Search();
        int ele = s1.se(a,b);
        if(ele>0)
            System.out.println("Element is found at index : "+ele);
        else
            System.out.println("Element not found!");
    }
}
