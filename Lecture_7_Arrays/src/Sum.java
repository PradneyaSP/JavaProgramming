public class Sum {
    public static void main(String[] args) {
        int [] a = {1,5,3};
        int sum =0;

        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }

        System.out.println("Sum: "+sum);
    }


}
