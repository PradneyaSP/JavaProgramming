class MultiDim{
    void multiArray(){
        //int [] [] arr2 = new int[3][4];
        int [] [] arr2 = {{00,01,02,03},{10,11,12,13},{20,21,22,23}};

        for (int i=0;i<3;i++){
            for(int j = 0;j<4;j++)
                System.out.print(arr2[i][j]+" ");
            System.out.println();
        }
        System.out.println();
        System.out.println(arr2.length);
        System.out.println(arr2[1].length);

        //int[][][] arr3 = new int[5][3][2];

    }
}
public class Multi {
    public static void main(String[] args) {
        MultiDim obj = new MultiDim();
        obj.multiArray();
    }

}
