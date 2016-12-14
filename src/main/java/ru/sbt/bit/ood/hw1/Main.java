package ru.sbt.bit.ood.hw1;

/**
 * Created by Stepan on 29.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        TradesJob tradesjob = new TradesJob( new TradesDAO(), new DownloadFromFTP(), new ParseCSV());
        tradesjob.run();

    }
}
