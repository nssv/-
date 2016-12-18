package ru.sbt.bit.ood.hw1;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Stepan on 29.11.2016.
 */
public class ParseCSV implements ParseFromSource {

    @Override
    public Iterable<Trade> parse(String filename) {
        try {
            Reader in = new FileReader(filename);
            return transform(CSVFormat.EXCEL.parse(in));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error while parsing");
        }
    }

    public Iterable<Trade> transform(Iterable<CSVRecord> records) {
        List<Trade> tradeList = new ArrayList<Trade>();
        for (CSVRecord record : records) {
            Map<String, String> mp = record.toMap();
            Trade trade = new Trade(mp);
            tradeList.add(trade);

        }
        return tradeList;
    }
}
