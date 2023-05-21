public class StringBuilderIntro {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.append("world");            //Adds a string.
        System.out.println(str);
        str.insert(5," ");      //inserts at the 5th position
        str.setCharAt(6,'W');   //changes character
        System.out.println(str);
        str.deleteCharAt(5);        //deletes character
        System.out.println(str);

        str.reverse();
        System.out.println(str);
        str.reverse();      //reverses string
        str.delete(2,4);    //2 to 3 delete
        System.out.println(str);



    }
}
