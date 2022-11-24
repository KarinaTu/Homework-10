import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Search {
    public static int search(int[] array, int element){
        List<Integer> list = Arrays.stream(array).boxed().toList();
        return Collections.binarySearch(list, element);
    }

    public static int searchWithoutCollections(int array[], int element){

        for(int i=0; i<array.length; i++){
            if (array[i] == element)
                return i;
        }
        return -1;
    }
}
