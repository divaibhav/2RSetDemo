/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Nov-20
 *  Time: 11:37 AM
 */
package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * creating a set which can hold integer objects by using HashSet class
 */
public class SetDemo {
    public static void main(String[] args) {
        //creating a set
        Set<Integer> set = new HashSet<>();//capacity = 16 and Load factor = 0.75
        //adding some elements
        set.add(10);
        set.add(Integer.valueOf(23));
        //duplicate
        System.out.println(set.add(10));
        set.add(24);
        set.add(214);
        set.add(53);

        //printing the set
        System.out.println(set);

        //addAll method
        ArrayList<Integer> list = new ArrayList<>();
        //initializing with random integers
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(100));
        }
        System.out.println("list -> " + list);
        //addAll
        set.addAll(list);
        System.out.println("set - > " +set);

        //remove
        System.out.println(set.remove(12));
        System.out.println(set.remove(24));
    }
}
