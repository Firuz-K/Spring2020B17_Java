package day00_Re_Studying.InterveiwQ.Combain;

import java.util.Arrays;

public class combain2array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr3 = new int[arr.length + arr2.length];
        for (int i=0; i<arr.length;i++){
            arr3[i]=arr[i];
        }
        for (int i=0; i<arr2.length;i++){
            arr3[arr.length+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }



}
