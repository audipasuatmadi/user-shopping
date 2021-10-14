public class ShoppingItem {
  private String itemName;
  private long itemPrice;

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public long getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(long itemPrice) {
    this.itemPrice = itemPrice;
  }

  @Override
  public String toString() {
    return "ShoppingItem{" +
        "itemName='" + itemName + '\'' +
        ", itemPrice=" + itemPrice +
        '}';
  }
}
