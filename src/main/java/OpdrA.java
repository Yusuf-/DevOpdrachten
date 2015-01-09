package main.java;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import main.java.Klant;
import main.java.Bestelling;

/**
 * Created by Yusuf on 12-12-2014.
 */
public class OpdrA {

    public static void main(String[] args){
        Queue<Bestelling> queue = new LinkedList<Bestelling>();
        queue.offer(new Bestelling(new Klant()));
        System.out.println(queue.poll().toString());
//
        queue.offer(new Bestelling(new Klant()));
        System.out.println(queue.poll().toString());

        queue.offer(new Bestelling(new Klant()));
        System.out.println(queue.poll().toString());
    }

}