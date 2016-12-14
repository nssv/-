package ru.sbt.bit.ood.hw1;

import org.apache.commons.csv.CSVFormat;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Stepan on 29.11.2016.
 */
public class ParseCSV implements ParseFromSource {

    @Override
    public Iterable parse(String filename) {
        try {
            Reader in = new FileReader(filename);
            return CSVFormat.EXCEL.parse(in);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("There was an error while parsing CSV file");
        }
    }
}
