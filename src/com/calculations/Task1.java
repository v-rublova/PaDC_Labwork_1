package com.calculations;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task1 extends Parent{

    public void PerformCalc_int(String filename, int lim, boolean rc_sw) throws IOException {
        this.SetFileName(filename);
        for (int n = 0; n <= lim; n += 50) {
            this.RowsCols(new int[n][n], n, rc_sw);
        }
        this.CloseFile();
    }

    public void PerformCalc_float(String filename, int lim, boolean rc_sw) throws IOException {
        this.SetFileName(filename);
        for (int n = 0; n <= lim; n += 50) {
            this.RowsCols(new float[n][n], n, rc_sw);
        }
        this.CloseFile();
    }
    /**
     * rc_sw stands for 'row-column switch'
     * rw_sw = true - rows;
     * rw_sw = false - columns.
     */
    private void RowsCols(int[][] array, int n, boolean rc_sw) {

        long start = System.currentTimeMillis();
        int bytes = n * n * 4 / 1024;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (rc_sw) array[i][j] = (i * j);
                else array[j][i] = (i * j);
            }
        }
        long end = System.currentTimeMillis();
        printWriter.println(bytes + " \t" + (end - start));

    }

    private void RowsCols(float[][] array, int n, boolean rc_sw) {

        long start = System.currentTimeMillis();
        int bytes = n * n * 4 / 1024;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (rc_sw) array[i][j] = (i * j);
                else array[j][i] = (i * j);
            }
        }
        long end = System.currentTimeMillis();
        printWriter.println(bytes + " \t" + (end - start));
    }

}
