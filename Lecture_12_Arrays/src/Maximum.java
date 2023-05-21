public class Maximum {
    int max(int []a){
        int flag =0;
        for(int i =0 ;i<a.length;i++)
        {
            if(a[flag]<a[i])
                flag = i;
        }

        return a[flag];
    }

    public static void main(String[] args) {
        int [] arr = {2,34,56,43,12,9};
        Maximum M = new Maximum();
        int max = M.max(arr);

        System.out.println("Maximum value in the given array is "+max);

    }
}
