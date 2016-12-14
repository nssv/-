package ru.sbt.bit.ood.hw1;

import java.util.ArrayList;

/**
 * Created by Stepan on 14.12.2016.
 */
public class TradeParseSample implements ParseFromSource {
    @Override
    public Iterable<Trade> parse(String filename) {
        System.out.println("Successful parsing");
        return new ArrayList<Trade>();
    }
}
