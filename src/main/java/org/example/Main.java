package org.example;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"aaa","bbb","ccc","aaa","bbb","ccc"};
        String[] newArr = new String[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++){
                if (arr[i].equals(newArr[j])){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                newArr[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(newArr[i]);
        }
        String[] arr1 = {"aaa","bbb","ccc","aaa","bbb","ccc"};
        System.out.println(noDuplicate(arr1));
    }
    public static String noDuplicate(String ...arr){
        return Arrays.stream(arr)
                .distinct()
                .collect(Collectors.joining(", "));
    }
}
