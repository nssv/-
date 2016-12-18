package ru.sbt.bit.ood.hw1;

public class TradesJob {

    private final TradeUpdater updater;
    private final DownloadFromSource downloader;
    private final ParseFromSource parser;

    public TradesJob(TradeUpdater updater, DownloadFromSource downloader, ParseFromSource parser) {
        this.updater = updater;
        this.downloader = downloader;
        this.parser = parser;
    }

    public void run() {
        String filename = downloader.download();
        Iterable<Trade> tradeRecords = parser.parse(filename);
        updater.updateTrades(tradeRecords);
    }
}
