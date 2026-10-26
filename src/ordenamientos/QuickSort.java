/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

import java.util.Arrays;

/**
 *
 * @author FernandoFernandezEs
 */
public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {12, 7 ,4,3, 8, 11, 9};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(new QuickSort().sort(arr)));
    }
    public int [] sort(int [] arr){
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private void sort(int[] arr, int low, int high) {
        if(low < high){
            
            int indiceDePivot = getIndex(arr, low, high);
            
            sort(arr, low, indiceDePivot - 1);
            sort(arr, indiceDePivot + 1, high);
        }
    }

    private int getIndex(int[] arr, int low, int high) {
        //this method should put the pivot in the correct position and return the index of pivot
        int pivot = arr[high];
        int i = low - 1;
        i = searchIndex(arr, pivot, i, low, high);
        int temp = arr[i+1];
        arr[i+1] = pivot;
        arr[high] = temp;
        
        return i+1;
    }

    private int searchIndex(int[] arr, int pivot, int i, int j, int jfin) {
        if (j >= jfin) {
            return i; 
        }
        
        if (arr[j] < pivot) {
            i++; 
            int temporal = arr[i];
            arr[i] = arr[j];
            arr[j] = temporal;
        }
        
        return searchIndex(arr, pivot, i, j + 1, jfin);
    }
}
