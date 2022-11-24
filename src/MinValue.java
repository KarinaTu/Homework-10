import java.util.ArrayList;
import java.util.Collections;
public class MinValue {
    public static int minValue(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
    public static int toMin(ArrayList<Integer> xxx){
        return Collections.min(xxx);
    }
}