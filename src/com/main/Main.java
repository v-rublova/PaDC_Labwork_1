package com.main;

import com.calculations.Task1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Task1 obj = new Task1();
        int lim = 12000;
        obj.PerformCalc_int("log_int_rows", lim,true);
        obj.PerformCalc_int("log_int_cols", lim,false);
        obj.PerformCalc_float("log_float_rows", lim,true);
        obj.PerformCalc_float("log_float_cols", lim,false);
    }
}
