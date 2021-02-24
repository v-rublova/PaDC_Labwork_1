package com.calculations;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task3 extends FileAccess {
    private void InsertData(HashSet<Integer> set, int cap) {
        for (int i = 0; i < cap; i++) {
            set.add(i);
        }
    }
    /**
     * sw stands for switch between checking all values (0) and one value (1)
     * */
    public void Check(int capacity,boolean sw){
        if (sw) CheckSingle(capacity);
        else CheckAll(capacity);
    }
    void CheckSingle(int cap) {
        final HashSet aHashStructure = new HashSet(cap);

        InsertData(aHashStructure,cap);
        long aStartTime = System.currentTimeMillis();

        Integer aElement = 0;
        for (int i = 0; i < cap; i++) {
            assertTrue(aHashStructure.contains(aElement));
        }

        System.out.println("Time_single (ms)=" + (System.currentTimeMillis() - aStartTime));
    }
    void CheckAll(int cap) {
        final HashSet aHashStructure = new HashSet(cap);

        InsertData(aHashStructure,cap);
        long aStartTime = System.currentTimeMillis();


        for (int i = 0; i < cap; i++) {
            Integer aElement = i;
            assertTrue(aHashStructure.contains(aElement));
        }

        System.out.println("Time_all (ms)=" + (System.currentTimeMillis() - aStartTime));
    }
}
