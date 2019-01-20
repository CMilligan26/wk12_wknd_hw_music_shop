package ShopStuff;

import ShopStuff.Behaviors.ISell;

public abstract class StockItem implements ISell {

    private String name;
    private String description;
    private double retailPrice;
    private double wholesalePrice;

    public StockItem(String name, String description, double retailPrice, double wholesalePrice) {
        this.name = name;
        this.description = description;
        this.retailPrice = retailPrice;
        this.wholesalePrice = wholesalePrice;
    }


    @Override
    public double calculateMarkup() {
        return this.retailPrice - this.wholesalePrice;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }
}
