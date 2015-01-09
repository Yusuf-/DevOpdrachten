package main.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yusuf on 13-12-2014.
 */
public class Bestelling{
    long factuurID = (long)(Math.random() * 10000 + 1), startTijd, klantID, duur;
    boolean verwerking, compleet, dadelijk;

    public Bestelling(Klant klant){
        klantID = klant.getID();
        verwerking = false;
    }

    public void startBestelling(){
        verwerking = true;
        startTijd = System.nanoTime();
    }

    public void endBestelling(){
        compleet = true;
        long endTime = System.nanoTime();
        duur = endTime - startTijd;
        dadelijk = false;
        System.out.println("COMPLETED " + toString());
    }

    @Override
    public String toString(){
        String time = "Duration: " + duur;
        return klantID + " " + factuurID + " " +  compleet + " " + dadelijk + " " + time;
    }

    public static void main(String[] args){
        Queue<Bestelling> bestellingQueue = new LinkedList<Bestelling>();
        Bestelling[] bestellingen = new Bestelling[5];
        for(int i = 0; i < bestellingen.length; i++) {
            bestellingen[i] = new Bestelling(new Klant());
            bestellingQueue.add(bestellingen[i]);
        }

        int count = 0;

        while(!bestellingQueue.isEmpty()){
            bestellingQueue.peek().dadelijk = true;
            bestellingQueue.peek().startBestelling();
            System.out.println("FIRST! " + bestellingQueue.peek().toString() + " " + count);
            count++;
            if(bestellingQueue.peek().factuurID>=5000){
                //System.out.println("FACTUUR ID IS LOWER THAN 5000");
                System.out.println("REMOVE! "  + bestellingQueue.remove().toString());
            }
            else{
                bestellingQueue.peek().endBestelling();
                System.out.println("SMALLER! " + bestellingQueue.poll().toString());
            }
        }

        /*
        while(!bestellingQueue.isEmpty()){
            bestellingQueue.peek().dadelijk = true;
            if(System.nanoTime() > (bestellingQueue.peek().startTijd) + bestellingQueue.peek().duur){
                bestellingQueue.poll().endBestelling();
                System.out.println("IF CHECK!");
            }
            else {
                bestellingQueue.peek().verwerking = true;
                bestellingQueue.poll().startTijd = System.nanoTime();
                System.out.println(count);
                count++;
            }
        }*/
    }
 }
