/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Nov-20
 *  Time: 11:51 AM
 */
package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//set operation UNION
public class SetDemo2 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            s1.add((int)(Math.random() * 100));
            s2.add((int)(Math.random() * 100));
        }
        System.out.println( "S1 - >"+ s1);
        System.out.println( "S2 - >"+ s2);

        //union
        Set<Integer> union = new HashSet<>();
        union.addAll(s1);
        union.addAll(s2);
        System.out.println("union - > " + union);

    }
}
