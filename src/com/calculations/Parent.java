package com.calculations;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Parent {
    FileWriter fileWriter;
    PrintWriter printWriter;

    void SetFileName(String name) throws IOException {
        fileWriter = new FileWriter(name);
        printWriter = new PrintWriter(fileWriter);
    }

    public void CloseFile() {
        printWriter.close();
    }

}
