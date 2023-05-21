class ArrayExample{
    void demoArrays(){
        int[] arr = new int[3];
        float[] a = new float[3];
        String[] str = {"Pradneya","Aditya", "Parth", "Yash"};

        System.out.println(arr.length);
        System.out.println(a.length);
        System.out.println(str.length);
        System.out.println();
        arr[0]= 1;
        arr[1]= 2;
        arr[2] = 3;

        for (int b :arr) {
            System.out.print(b+" ");
        }
        System.out.println();

        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");
        System.out.println(arr[2]);
        System.out.println();

        for (int i=0;i<4;i++){
            System.out.println(str[i]);
        }
        System.out.println();
    }
}

public class Arrays {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArrays();
    }
}
