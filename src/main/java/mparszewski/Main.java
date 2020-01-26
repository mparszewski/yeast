package mparszewski;

import mparszewski.common.CsvWriter;
import mparszewski.common.YeastParser;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("data\\yeast.csv");
            YeastParser yeastParser = new YeastParser("data/yeast.data");

            CsvWriter.write(writer, yeastParser.getAllYeasts());

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
