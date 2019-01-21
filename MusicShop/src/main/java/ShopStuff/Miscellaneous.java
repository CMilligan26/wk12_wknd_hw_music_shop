package ShopStuff;

public class Miscellaneous extends StockItem {
    private String relatedInstrument;

    public Miscellaneous(String name, String description, double retailPrice, double wholesalePrice, String relatedInstrument) {
        super(name, description, retailPrice, wholesalePrice);
        this.relatedInstrument = relatedInstrument;
    }

    public String getRelatedInstrument() {
        return this.relatedInstrument;
    }
}
