package codingChallenges;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr =new int[]{1,50,20,30,10};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
