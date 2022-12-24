package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FIndDuplicatesInArray {
    public static void main(String[] args) {
//        isDuplicateInUnsortedArray();
//        isDuplicateInSortedArray();
       // findSum();
        System.out.println(romanToInt("MCMXCIV"));
        ;
    }

    private static void findSum() {
        int target = 6;
        int arr[] = {3,2,4};
        int k=0;
        Arrays.sort(arr);
        int[] output = new int[2];
        int i = 0;
        int j=  arr.length-1;
        while(i<=j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                output[0] = i;
                output[1] = j;
                break;
            }else if(sum > target){
                j--;
            }else{
                i++;
            }
        }
        for(int s: output){
            System.out.println(s);
        }

      /*  for(int i=0; i < arr.length; i++) {
            for(int j=i+1; j< arr.length; j++) {
                if(arr[i]+arr[j] == target) {
                    output[k] = arr[i];
                    output[k+1] = arr[j];
                }
            }

        }*/

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
        System.out.println(hasDuplicate);
    }

    private static void isDuplicateInUnsortedArray() {
        int[] arr = {0,1, 2, 3, 4, 5, 1, 4 , 4};
        boolean duplicate = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< arr.length; i++) {

            map.put(arr[i],map.getOrDefault(arr[i],0));
        }
        map.entrySet().stream().forEach(System.out::println);
        /*boolean hasDuplicate = false;
        int count = 0, k=0;
        int[] output = new int[arr.length];

        for(int i=0; i< arr.length; i++){
            for(int j= i+1; j< arr.length; j++) {

                if(arr[i]== arr[j]) {
                    count+=1;
                    output[count] = arr[i];
                }
            }
        }
        for(int m : output) {
            System.out.println(m);
        }*/


    }
    public static int romanToInt(String s) {
        char[] r = s.toCharArray();
        int sum = 0;
        char last = 'J';
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i= 0; i <r.length; i++){
            if(s == null || s == ""){
                return sum;
            }
            if(map.get(last) == null){
                sum+=map.get(r[i]);
                continue;
            }
            System.out.println(map.get(r[i]));
            if(map.get(last) < map.get(r[i])){
                sum-=map.get(r[i]);
            }else{
                sum+=map.get(r[i]);
            }
        }

        return sum;

    }

}
