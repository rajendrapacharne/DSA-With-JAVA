import java.util.HashMap;
import java.util.Map;

public class HashMapFuctions {
    public static void main(String[] args) {
        HashMap <Integer,String> data=new HashMap<>();

        // put Function
        data.put(1,"Rajendra");
        data.put(2,"Java");
        data.put(3,"DSA");
        data.put(4,"Machine Learning");
        System.out.println("Data :"+data);

        // Get Function

        String result=data.get(3);
        System.out.println("Value of Given Key  :"+result);

        // Contains Fuctions
        System.out.println(data.containsKey(2));

        // Remove Function
        data.remove(1);
        System.out.println("Updated hashmap :"+data);

        // Iterative using for loop

        for(Map.Entry<Integer,String> e: data.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
