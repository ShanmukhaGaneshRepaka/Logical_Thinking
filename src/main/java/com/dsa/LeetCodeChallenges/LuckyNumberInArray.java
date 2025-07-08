
import java.util.*;

class LuckyNumberInArray {
    public static void main(String[] args) {
        int arr[] = {2, 2, 3, 4};
        System.out.println(luckyNumber(arr));
    }

    static int luckyNumber(int arr[]) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        int max = -1;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                if (max < entry.getKey()) {
                    max = entry.getKey();
                }
            }
        }

        return max;
    }
}
