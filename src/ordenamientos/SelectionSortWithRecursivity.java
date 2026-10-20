/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

import java.util.Arrays;

/**
 *
 * @author ferna
 */
public class SelectionSortWithRecursivity {
    
    public static void main(String[] args) {
        int [] arr = {5,23,6,76,43,23,12,9};
        System.out.println(Arrays.toString(sort(arr)));
    }
    
    public static int [] sort(int [] arr){
        sort(arr, 0);
        return arr;
    }

    private static void sort(int[] arr, int i) {
        if(i < arr.length){
            int indexMin = getIndexMin(arr, i, i);
            //swap
            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
            //recursive call
            sort(arr, i+1);
        }
    }

    private static int getIndexMin(int[] arr, int i,int indexMin) {
        if(i < arr.length){
            if(arr[indexMin] > arr[i]){
                indexMin = i;
            }
            return getIndexMin(arr, i+1, indexMin);
        }
        return indexMin;
    }
    
    
}
