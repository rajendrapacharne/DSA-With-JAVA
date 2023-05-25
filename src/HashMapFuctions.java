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

/*
This code demonstrates the usage of various functions in the `HashMap` class in Java. Here's a breakdown of what each part of the code does:

1. Importing Required Packages:
   ```java
   import java.util.HashMap;
   import java.util.Map;
   ```
   The code imports the necessary classes from the `java.util` package, including `HashMap` and `Map`, which are used for implementing and working with hash maps.

2. Declaring and Initializing a HashMap:
   ```java
   HashMap<Integer, String> data = new HashMap<>();
   ```
   This line creates a new `HashMap` instance called `data` with keys of type `Integer` and values of type `String`. It's initially empty.

3. Putting Key-Value Pairs:
   ```java
   data.put(1, "Rajendra");
   data.put(2, "Java");
   data.put(3, "DSA");
   data.put(4, "Machine Learning");
   ```
   This code adds key-value pairs to the `data` hashmap using the `put` function. The keys are integers, and the corresponding values are strings.

4. Accessing a Value by Key:
   ```java
   String result = data.get(3);
   ```
   The `get` function retrieves the value associated with the key `3` from the hashmap and assigns it to the variable `result`. In this case, `result` will be `"DSA"`.

5. Checking if a Key Exists:
   ```java
   System.out.println(data.containsKey(2));
   ```
   The `containsKey` function checks whether the hashmap contains a specific key, in this case, `2`. It returns `true` if the key exists, and `false` otherwise. The result is printed to the console.

6. Removing an Entry:
   ```java
   data.remove(1);
   ```
   The `remove` function removes the key-value pair with the specified key, in this case, `1`, from the hashmap.

7. Iterating Over the HashMap:
   ```java
   for (Map.Entry<Integer, String> e : data.entrySet()) {
       System.out.println(e.getKey() + " " + e.getValue());
   }
   ```
   This loop iterates over the entries in the `data` hashmap using the `entrySet` function. For each entry, it retrieves the key and value using `getKey()` and `getValue()`, respectively, and prints them to the console.

Overall, this code demonstrates the basic usage of the `HashMap` class in Java, including adding and removing elements, accessing values by keys, checking for key existence, and iterating over the hashmap.

 */