package org.example;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"aaa","bbb","ccc","aaa","bbb","ccc"};
        String[] newArr = new String[arr.length];
        int count = 0;
        for (String s : arr) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (s.equals(newArr[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newArr[count] = s;
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(newArr[i]);
        }
        String[] arr1 = {"aaa","bbb","ccc","aaa","bbb","ccc"};
        System.out.println(noDuplicates(arr1));
    }
    public static String noDuplicates(String ...arr){
        return Arrays.stream(arr)
                .distinct()
                .collect(Collectors.joining(", "));
    }
}
