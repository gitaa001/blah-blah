package src;

public class Misc extends Item {
    private String itemDescription;

    public Misc(String itemName, String itemDescription) {
        super(itemName, "Misc");
        this.itemDescription = itemDescription;
    }

    public String getItemDescription() {
        return itemDescription;
    }
}
