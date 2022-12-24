package org.example;

import java.util.HashMap;

public class FIndDuplicatesInArray {
    public static void main(String[] args) {
        isDuplicateInUnsortedArray();
        isDuplicateInSortedArray();
    }

    private static void isDuplicateInSortedArray() {
        boolean hasDuplicate = false;
        int[] arr = {1, 2, 2, 3, 4, 5};
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                hasDuplicate = true;
                break;
            }
            i++;
        }
        First
        System.out.println(hasDuplicate);
    }

    private static void isDuplicateInUnsortedArray() {
        int[] arr = {1, 2, 3, 4, 5, 1, 3, 4};
        boolean hasDuplicate = false;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) && map.get(arr[i]) > 0) {
                hasDuplicate = true;
                break;
            } else {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
        }

        System.out.println(hasDuplicate);
    }
}
