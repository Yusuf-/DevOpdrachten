/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

/**
 *
 * @author Yusuf
 */
public class Search {

    public int[] randomArray(int range, int size){
        int[] array = new int[size];
        for(int x = 0; x < array.length; x++){
            int random = (int) (Math.random() * range + 1);
            array[x] = random;
        }
        return array;
    }

    public void linearSearch(int[] array, int key){
        int count = 0;

        for(int x = 0; x < array.length; x++){
            if(array[x] == key){
                System.out.println("Value: " + array[x] + " Found at position: " +count);
            }
            count++;
        }
        System.out.println(Arrays.toString(array));
    }

    public void binarySearch(int[] array, int key){
        int high = array.length;
        int low = 0;
        while (low < high){
            int middle = (low + high) / 2;
            if(array[middle] > key){
                high = middle -1;
            }
            else if (array[middle] < key){
                low = middle + 1;
            }
            else {
                System.out.println("Found at position: " + middle);
                break;
            }
        }
        System.out.println("Length and values: " + array.length + " " + Arrays.toString(array) );
    }
    public static void main(String[] args){
        int key = 5;
        int range = 10;
        int size =  20;
        Search s1 = new Search();

        /*int[] array = s1.randomArray(range, size);
        int[] orderArray = s1.randomArray(range, size);
        Arrays.sort(orderArray);
        s1.binarySearch(orderArray, key);*/
        int[] array = s1.randomArray(range, size);
        s1.linearSearch(array, key);
    }
}
