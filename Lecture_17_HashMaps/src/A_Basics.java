import java.util.HashMap;
import java.util.Map;

public class A_Basics {
    public static void hashmapsIntro(){
        Map<String,Integer> mp = new HashMap<>();
        //Adding elements into the hashmap
        mp.put("Pradneya",79);
        mp.put("Anshu",11);
        mp.put("Piyush",45);
        mp.put("Pratyush",47);
        mp.put("Varun",120);
        //Retrieving the values of a specific key
        System.out.println(mp.get("Pradneya"));
        System.out.println(mp.get("Manav"));
        //Updating the values of a specific key
        mp.put("Anshu",-1);
        //Removing an entry
        mp.remove("Piyush");
        //Checking if a key is present in the map
        System.out.println(mp.containsKey("Varun"));
        System.out.println(mp.containsKey("Robin"));
        //Entering entries if there is no other key
        mp.putIfAbsent("Pratyush" , 7);
        mp.putIfAbsent("Priyanshu" , 83);
        //Get all the keys in the Map
        System.out.println(mp.keySet());
        //Get all the values in the Map
        System.out.println(mp.values());
        //Printing the Map
        System.out.println(mp.entrySet());
        System.out.println();
        for(var v : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",v.getKey(),v.getValue());
        }

    }
    public static void main(String[] args) {
        hashmapsIntro();
    }
}
