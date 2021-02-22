package com.main;

import com.calculations.Task1;
import com.calculations.Task2;
import com.calculations.Task3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Task1 obj = new Task1();
        Task2 obj2 = new Task2();
        Task3 obj3 = new Task3();
        int lim = 12000;
        //obj.PerformCalc_int("log_int_rows", lim,true);
        //obj.PerformCalc_int("log_int_cols", lim,false);
        //obj.PerformCalc_float("log_float_rows", lim,true);
        //obj.PerformCalc_float("log_float_cols", lim,false);
        obj2.Check("log_array",lim, (byte) 0);
        obj2.Check("log_arraylist",lim, (byte) 2);
        obj2.Check("log_linkedlist",lim, (byte) 1);
        //obj3.Check(10_000_0,true);
        //obj3.Check(10_000_0,false);
    }
}
