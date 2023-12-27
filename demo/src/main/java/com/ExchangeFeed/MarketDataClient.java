package com.ExchangeFeed;

public class MarketDataClient {
    private MarketData marketDataProvider;

    public MarketDataClient(MarketData marketDataProvider) {
        this.marketDataProvider = marketDataProvider;
    }

    public static void main(String[] args) {
        MarketDataClient clientWithVendor = new MarketDataClient(new VenderMarketDataProvider());
        MarketDataClient clientWtihDirectFeed = new MarketDataClient(new DirectExchangeFeed());
    }
}
