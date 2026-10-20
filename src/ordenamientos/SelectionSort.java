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
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,3,2,4,1,1,2,45,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    //first with clasic loops 
    public static void sort(int [] arr){
        for(int i = 0; i < arr.length ; i++){
            int indexMin = i;
            for(int j = i; j < arr.length; j++){
                if(arr[indexMin] > arr[j]){
                    indexMin = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
        }
    }
}
