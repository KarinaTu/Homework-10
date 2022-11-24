import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] newArray = new int[]{29, 2, 4, 8, 23};
        System.out.println(MinValue.minValue(newArray));

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(8);
        newList.add(25);
        newList.add(4);
        newList.add(53);
        System.out.println(MinValue.toMin(newList));

        Integer[] toPrimitive = newList.toArray(new Integer[0]);

//        for (Integer n: toPrimitive){
//            System.out.println(n);
//        }
//        System.out.println(Arrays.toString(toPrimitive));

        int[] bubbles = {5, 45, 23, 29, 8, 7};
        Sort.bubbleSort(bubbles);
        System.out.println(Arrays.toString(bubbles));

        int element = 65;
        int index = Search.search(bubbles, element);
        if (index < 0) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Element " + element + " is found at index " + index);
        }
    }

}