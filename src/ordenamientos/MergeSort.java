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

public class MergeSort
{
    public static void main(String[] args) {
        int [] arr = {5,3,53,32,65,23};
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length)));
    }
    public static int [] mergeSort(int [] arr, int start , int end){
        if(arr.length == 1){
            return arr;
        }else{
            int mid = start + (end - start)/2;
            int [] left = Arrays.copyOfRange(arr, start, mid);
            int [] right = Arrays.copyOfRange(arr, mid , end);
            mergeSort(left, 0, left.length);
            mergeSort(right, 0 ,right.length);
            merge(arr,left, right , 0, 0, 0);
            return arr;
        }
    }
    
    private static void merge(int [] arr, int [] left, int [] right, int k, int i, int j){
        if(k == arr.length){
            
        }else{
            if(i < left.length && j < right.length && left[i] < right[j]){
                arr[k] = left[i];
                merge(arr, left, right, k+1, i+1, j);
            }else if(i == left.length){
                arr[k] = right[j];
                merge(arr , left , right, k+1, i, j+1);
            }else if(j == right.length){
                arr[k] = left[i];
                merge(arr, left, right, k+1, i+1, j);
            }else{
                arr[k] = right[j];
                merge(arr , left , right, k+1, i, j+1);
            }
        }
    }
}

