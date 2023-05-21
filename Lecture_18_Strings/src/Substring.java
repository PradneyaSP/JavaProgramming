public class Substring {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(2));

        String str2 = "Physics";
        for(int i=2;i<4;i++)
            System.out.print(str2.substring(i));


        //Printing all substrings
        System.out.println();
        for(int i=0 ;i<=3 ; i++){
            for(int j=i+1;j<=4;j++){
                System.out.print(str.substring(i,j));
                System.out.print(" ");
            }
        }
    }
}
