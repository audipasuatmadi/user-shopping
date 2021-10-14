import java.util.List;

public class Customer {
  private String name;
  private List<ShoppingItem> shoppingItems;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<ShoppingItem> getShoppingItems() {
    return shoppingItems;
  }

  public void setShoppingItems(List<ShoppingItem> shoppingItems) {
    this.shoppingItems = shoppingItems;
  }

  public void addToShoppingItem(ShoppingItem shoppingItem) {
    this.shoppingItems.add(shoppingItem);
  }

  @Override
  public String toString() {
    return "Customer{" +
        "name='" + name + '\'' +
        ", shoppingItems=" + shoppingItems +
        '}';
  }
}
