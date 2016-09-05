package com.informatorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Informatorio on 05/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Pilot", 14, "undefined");
        Eva one = new Eva(100, "01", Color.BLUE, pilot, Collections.emptyList());
        Eva two = new Eva(75, "02", Color.RED, pilot, Collections.emptyList());
        Eva three = new Eva(80, "03", Color.RED, pilot, Collections.emptyList());
        List<Eva> evas = new ArrayList<Eva>();
        evas.add(one);
        evas.add(two);
        evas.add(three);
        //Comparator<Eva> color = ColorComparator.INSTANCE;
        Collections.sort(evas);
        printList(evas);
        Collections.sort(evas, new Comparator<Eva>() {
            @Override
            public int compare(Eva o1, Eva o2) {
                return Integer.compare(o1.getCharge(), o2.getCharge());
            }
        });
        printList(evas, "charge");
    }

    private static void printList(List<Eva> evas, String field) {
        System.out.println("============================ " + field + "============================");
        for (Eva e : evas) {
            System.out.println(e);
        }
        System.out.println("============================ Funny Line ============================");
    }

    private static void printList(List<Eva> evas) {
        printList(evas, "Normal");
    }
}
