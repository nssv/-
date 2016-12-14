package ru.sbt.bit.ood.hw1;

public class TradesJob {

    private final TradesDAO tradesDAO;
    private final DownloadFromSource downloader;
    private final ParseCSV parser;

    public TradesJob(TradesDAO tradesDAO, DownloadFromSource downloader, ParseCSV parser) {
        this.tradesDAO = tradesDAO;
        this.downloader = downloader;
        this.parser = parser;
    }

    public void run() {
        String filename = downloader.download();
        Iterable tradeRecords = parser.parse(filename);
        updateTrades(tradeRecords);
    }

    private void updateTrades(Iterable trades) {
        tradesDAO.deleteAll();
        for (Object o : trades) {
            tradesDAO.save((Trade) o);
        }
    }


}
