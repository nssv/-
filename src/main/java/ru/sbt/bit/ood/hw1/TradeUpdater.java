package ru.sbt.bit.ood.hw1;

/**
 * Created by Stepan on 15.12.2016.
 */
public class TradeUpdater {
    private final TradesDAO tradesDAO;

    public TradeUpdater(TradesDAO tradesDAO) {
        this.tradesDAO = tradesDAO;
    }

    public void updateTrades(Iterable<Trade> trades) {
        tradesDAO.deleteAll();
        for (Trade trade : trades) {
            tradesDAO.save(trade);
        }
    }
}
