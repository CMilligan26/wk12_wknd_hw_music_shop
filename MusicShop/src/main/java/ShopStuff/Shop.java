package ShopStuff;

import InstrumentStuff.Cowbell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<StockItem> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<StockItem> getStock() {
        return this.stock;
    }

    public void addStock(StockItem stockItem) {
        this.stock.add(stockItem);
    }

    public void removeStock(StockItem stockItem) {
        this.stock.remove(stockItem);
    }

    public double calculateProfit(double overhead) {
        double profit = 0;
        for (StockItem stockItem : this.stock){
            double deductedOverhead = stockItem.calculateMarkup()*overhead;
            profit += stockItem.calculateMarkup()-deductedOverhead;
        }
        return profit;
    }
}
