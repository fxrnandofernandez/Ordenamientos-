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
public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {4,5,2,6,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void sort(int [] arr){
        for(int i = 1; i < arr.length; i++){
           int key = arr[i];
           int j = i - 1;
           while(j >= 0 && arr[j] > key ){
               arr[j + 1] = arr[j];
               j--;
           }
           arr[j+1] = key;
        }
    }
}
