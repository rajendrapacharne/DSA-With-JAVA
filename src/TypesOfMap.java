import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class  TypesOfMap {
    public static void main(String[] args) {
        HashMap <Integer,String> data1=new HashMap<>();
        data1.put(7,"Seven");
        data1.put(5,"Five");
        data1.put(1,"One");
        data1.put(3,"Three");

        // It will print data in sorted manner
        System.out.println("HashMap Data :"+data1);
        System.out.println();

        LinkedHashMap <Integer,String> data2=new LinkedHashMap<>();
        data2.put(7,"Seven");
        data2.put(5,"Five");
        data2.put(1,"One");
        data2.put(3,"Three");

        // It will print data in Inserted order
        System.out.println("LinkedHashMap Data :"+data2);
        System.out.println();


        TreeMap<Integer,String> data3=new TreeMap<>();
        data3.put(7,"Seven");
        data3.put(5,"Five");
        data3.put(1,"One");
        data3.put(3,"Three");

        // It will print data in sorted manner
        System.out.println("TreeMap Data :"+data3);
        System.out.println();

    }
}

/*

Import Statements:
The code begins with importing the necessary classes for using maps: HashMap, LinkedHashMap, and TreeMap from the java.util package.

Class and Method Declaration:
The code defines a class named TypesOfMap with a main method. This serves as the entry point for the program.

HashMap:

The code creates an instance of HashMap called data1 using the generic type HashMap<Integer, String>. This map will store integer keys and string values.
Four key-value pairs are added to the data1 map using the put method.
The System.out.println statement prints the contents of the data1 map. However, please note that the order of elements in a HashMap is not guaranteed to be in the same order as they were inserted.
LinkedHashMap:

The code creates an instance of LinkedHashMap called data2 using the generic type LinkedHashMap<Integer, String>.
Four key-value pairs are added to the data2 map using the put method.
The System.out.println statement prints the contents of the data2 map. Unlike HashMap, a LinkedHashMap maintains the order of elements based on the insertion order.
TreeMap:

The code creates an instance of TreeMap called data3 using the generic type TreeMap<Integer, String>.
Four key-value pairs are added to the data3 map using the put method.
The System.out.println statement prints the contents of the data3 map. TreeMap automatically sorts the elements based on the natural order of the keys.
Output:
When you run the code, it will display the data stored in each map:

The HashMap data will be printed in a sorted manner based on the hash codes of the keys.
The LinkedHashMap data will be printed in the order in which the elements were inserted.
The TreeMap data will be printed in a sorted manner based on the natural order of the keys.
 */