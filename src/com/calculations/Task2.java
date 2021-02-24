package com.calculations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Task2 extends FileAccess {

    public void Check(String filename,int lim,byte sw) throws IOException {
        this.SetFileName(filename);
        switch (sw){
            case 0:{
                for (int n = 0; n <= lim; n += 50) {
                    Array_double(n);
                }
                break;
            }
            case 1:{
                for (int n = 0; n <= lim; n += 50) {
                    LinkedList_double(n);
                }
                break;
            }
            case 2:{
                for (int n = 0; n <= lim; n += 50) {
                    ArrayList_double(n);
                }
                break;
            }
            default:break;
        }
        this.CloseFile();
    }
    public void Array_double(int n) {

        long start = System.currentTimeMillis();
        double[] array = new double[n];

        for (int i = 0; i < n; i++)
            array[i] = i;

        double sum = 0;
        for (int i = 0; i < n; i++)
            sum += array[i];

        long end = System.currentTimeMillis();
        printWriter.println(n + " \t" + (end - start));
    }

    public void LinkedList_double(int n) {
        long start = System.currentTimeMillis();
        LinkedList<Double> linked_list = new LinkedList<>();
        for (int i = 0; i < n; i++)
            linked_list.add((double) i);
        double sum = 0;
        for (int i = 0; i < n; i++)
            sum += linked_list.get(i);
        long end = System.currentTimeMillis();
        printWriter.println(n + " \t" + (end - start));
    }

    public void ArrayList_double(int n) {
        long start = System.currentTimeMillis();
        ArrayList<Double> array_list = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
            array_list.add((double) i);

        double sum = 0;
        for (int i = 0; i < n; i++)
            sum += array_list.get(i);

        long end = System.currentTimeMillis();
        printWriter.println(n + " \t" + (end - start));
    }
}
