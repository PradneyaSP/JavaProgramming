import java.util.ArrayList;

//Wrapper Class is a class that contains PDT.
//Ex -> int is in Integer class.
public class F_ArrayList_Intro {
    public static void main(String[] args) {
        //Wrapper Class
        Integer in = Integer.valueOf(45);
        Float f = 4.5f;
        System.out.println(in + " " + f);

        //Creating an ArrayList.
        ArrayList<Integer> l1 = new ArrayList<>();

        //Adding Values to the ArrayList.
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

/*
        //printing the values.
        System.out.println(l1.get(0));
*/


        //printing all the element with loop
        for (int i = 0; i < l1.size(); i++)
            System.out.println(l1.get(i));

        //printing the entire ArrayList
        System.out.println();
        System.out.println(l1);

        //Adding an element at index i
        l1.add(1, 56);
        System.out.println(l1);

        //Modifying an element at index i
        l1.set(1, 69);
        System.out.println(l1);

        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        //Removing an element 'e'
        l1.remove(Integer.valueOf(4));
        System.out.println(l1);
        //If we ask to remove 15 which doesn't exist in the list , then the list will be returned as it is,
        // error will not be generated . Instead, you will get a boolean value if the element is removed as True else False.
        System.out.println(l1.remove(Integer.valueOf(12)));

        //Creating a ArrayList with any class
        ArrayList l2 = new ArrayList();
        l2.add(57);
        l2.add("Prad");
        l2.add(true);
        System.out.println(l2);
    }
}
