import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String []args) {
    Scanner scanner = new Scanner(System.in);
    List<Customer> customers = new ArrayList<Customer>();
    System.out.println("Program pencatatan pembelanjaan");
    System.out.println("Masukkan jumlah customer dibawah: ");
    int customerCount = scanner.nextInt(); scanner.nextLine();
    int purchaseCount;
    for (int i = 0; i < customerCount; i++) {
      Customer customer = new Customer();
      customers.add(customer);
      System.out.println("Masukkan nama pelanggan dibawah: ");
      customer.setName(scanner.nextLine());
      System.out.println("Masukkan jumlah belanjaan dibawah: ");
      purchaseCount = scanner.nextInt(); scanner.nextLine();

      customer.setShoppingItems(new ArrayList<ShoppingItem>());

      for (int j = 0; j < purchaseCount; j++) {
        ShoppingItem shoppingItem = new ShoppingItem();
        customer.addToShoppingItem(shoppingItem);
        System.out.println("Masukkan nama barang belanjaan dibawah:");
        shoppingItem.setItemName(scanner.nextLine());
        System.out.println("Masukkan harga barang belanjaan dibawah:");
        shoppingItem.setItemPrice(scanner.nextLong()); scanner.nextLine();
      }
    }
    System.out.println("Hasil program: ");
    for (Customer customer : customers) {
      System.out.println(customer.toString());
      for (ShoppingItem shoppingItem : customer.getShoppingItems()) {
        System.out.println(shoppingItem.toString());
      }
      System.out.println("-------------------------");
    }
  }
}
