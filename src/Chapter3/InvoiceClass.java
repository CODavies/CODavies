package Chapter3;

public class InvoiceClass {
    String partNumber;
    String  partDescription;
    int itemBeingPurchased;
    double pricePerItem;

    public InvoiceClass(String partNumber, String partDescription, int itemBeingPurchased, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemBeingPurchased = itemBeingPurchased;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return  "01" + partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getItemBeingPurchased() {
        return itemBeingPurchased;
    }

    public void setItemBeingPurchased(int itemBeingPurchased) {
        this.itemBeingPurchased = Math.max(itemBeingPurchased, 0);
    }
    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem < 0)? 0.0 : pricePerItem;
    }

    public double getInvoiceAmount() {
        return itemBeingPurchased * pricePerItem;
    }
}
