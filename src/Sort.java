public class Sort {
    public static void bubbleSort (int[] abc) {
        int size = abc.length;
        for(int i=0; i< size - 1; i++){
            for(int j=0; j<size-i-1; j++){
                if(abc[j]>abc[j+1]){
                    int temp = abc[j];
                    abc[j]= abc[j+1];
                    abc[j+1]=temp;
                }
            }
        }
    }
}
