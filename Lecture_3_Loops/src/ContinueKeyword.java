public class ContinueKeyword {
    public static void main(String[] args) {
        System.out.println("The program will print every number except multiples of 3");

//       for(int i=0 ; i<=50;i++){
//           if( i % 3 == 0) {
//               continue;
//           }
//           System.out.println(i);
//        }
        int i=0;
        while ( i <=50){
            i++;
            if ( i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
