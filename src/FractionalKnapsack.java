import java.util.*;

class Item {
    int weight;
    int value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

class FractionalKnapsack {
    public static double getMaxValue(int[] weights, int[] values, int capacity) {
        List<Item> items = new ArrayList<>();

        // Create a list of items
        for (int i = 0; i < weights.length; i++) {
            items.add(new Item(weights[i], values[i]));
        }

        // Sort the items based on their value per unit weight
        Collections.sort(items, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));

        int currentWeight = 0;
        double finalValue = 0.0;

        for (Item item : items) {
            // If adding the current item doesn't exceed the capacity, add it completely
            if (currentWeight + item.weight <= capacity) {
                currentWeight += item.weight;
                finalValue += item.value;
            } else {
                // Otherwise, add a fraction of the item
                int remainingCapacity = capacity - currentWeight;
                double fraction = (double) remainingCapacity / item.weight;
                finalValue += item.value * fraction;
                break;
            }
        }

        return finalValue;
    }

    public static void main(String[] args) {
        int[] weights = { 5, 10, 12,4,7,9,3 };
        int[] values = { 25,75,100,50,45,90,30};
        int capacity = 37;

        double maxValue = getMaxValue(weights, values, capacity);
        System.out.println("Maximum value: " + maxValue);
    }
}
