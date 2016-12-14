package ru.sbt.bit.ood.hw1;

/**
 * Created by Stepan on 14.12.2016.
 */
public class TradeDownloadSample implements DownloadFromSource {
    @Override
    public String download() {
        System.out.println("Successful downloading");
        return null;
    }
}
