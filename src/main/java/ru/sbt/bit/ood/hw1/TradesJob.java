package ru.sbt.bit.ood.hw1;

public class TradesJob {

    private final TradeUpdater updater;
    private final DownloadFromSource downloader;
    private final ParseFromSource parser;

    public void run() {
        String filename = downloader.download();
        Iterable tradeRecords = parser.parse(filename);
    }

    public TradesJob(TradeUpdater updater, DownloadFromSource downloader, ParseFromSource parser) {
        this.updater = updater;
        this.downloader = downloader;
        this.parser = parser;
    }
}
