/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java;

import java.util.Arrays;

/**
 *
 * @author Yusuf
 */
public class Klant {
    int leeftijd;
    long ID;
    String achternaam, voornaam, plaats, geslacht, email;
    Klant[] myArray;

    public Klant(){
        ID = setID();
    }
    public long setID(){
        long random = (long) (Math.random() * 10000 + 1);
        return random;
    }

    public void setName(String firstname, String lastname, String tvoegsel){
        this.achternaam = lastname;
        this.voornaam = firstname;
    }

    public void setAge(int age){
        this.leeftijd = age;
    }

    public void setAddress(String address){
        this.plaats = address;
    }

    public long getID(){
        return ID;
    }

    public int getAge(){
        return leeftijd;
    }

    public String getAddress(){
        return plaats;
    }

    public String getName(){
        return voornaam + " " + achternaam;
    }

    @Override public String toString() {
        return voornaam + " " + achternaam + ", " + getID() ;
    }

    public class Factuur {
        long klantID = Klant.this.ID;
        long factuurID = (long)(Math.random() * 10000 + 1);
        boolean verwerking, compleet, dadelijk;
        long startTijd = System.currentTimeMillis();
    }
    public void mergeSort(Klant inputArr[]) {
        this.myArray = inputArr;
        divide(0, this.myArray.length - 1);
    }

    private void divide(int p, int r) {

        if (p < r) {
            int middle = p + (r - p) / 2;
            // Below step sorts the left side of the myArray
            divide(p, middle);
            // Below step sorts the right side of the myArray
            divide(middle + 1, r);
            // Now merge both sides
            merge(p, middle, r);
        }
    }

    private void merge(int p, int middle, int r) {
        Klant[] tempArray = new Klant[this.myArray.length];
        for (int i = p; i <= r; i++) {
            tempArray[i] = myArray[i];
        }
        int i = p;
        int j = middle + 1;
        int k = p;

        while (i <= middle && j <= r) {
            if (tempArray[i].leeftijd <= tempArray[j].leeftijd) {
                myArray[k] = tempArray[i];
                i++;
            } else {
                myArray[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            myArray[k] = tempArray[i];
            k++;
            i++;
        }
    }
    public void linearSearch(Klant[] array, int key){
        for(int i = 0; i < array.length; i++){
            if(array[i].leeftijd == key){
                System.out.println("Found at position: " + i);
                break;
            }
        }
        System.out.println("Not present in array");
    }

    public void insertionSort(Klant[] array){
        for(int j = 1; j < array.length; j++){
            String key = array[j].voornaam;
            int i = j -1;
            while(i >= 0){
                if(key.compareTo(array[i].voornaam) > 0){
                    break;
                }
                array[i+1] = array[i];
                i--;
            }
            array[i+1].voornaam = key;
        }
    }

    public void binarySearch(Klant[] array, String key){
        int high = array.length -1;
        int low = 0;
        while (low < high){
            int middle = (low + high) / 2;
            if(array[middle].voornaam.compareTo(key) > 0){
                high = middle -1;
            }
            else if (array[middle].voornaam.compareTo(key) < 0){
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
        Klant k1 = new Klant();
        int key = 24;
        Klant[] klantArray = new Klant[6];
        String[] names = {"Kevin", "Casey","Peter", "Priscilla", "John", "Jane", "Steve", "Stephanie", "Karl", "Kate","Martha","Jesse","Wilma"};
        for(int x = 0; x < klantArray.length; x++){
            int age = 20 +(int) (Math.random() * 10);
            klantArray[x] = new Klant();
            klantArray[x].setAge(age);
            klantArray[x].setName(names[x], null, null);
        }

        //k1.mergeSort(klantArray);

        //k1.linearSearch(klantArray, key);
        k1.insertionSort(klantArray);
        k1.binarySearch(klantArray, "Casey");
        for(Klant k: klantArray){
            System.out.println("INSERTION-SORT! Value: " + k.ID + " " + k.voornaam);
        }
    }
}
