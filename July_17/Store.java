
import java.util.*;

class ProductNotFoundException extends Exception {
  public ProductNotFoundException(String s) {
    super(s);
  }
}

public class Store {
  ArrayList<ProductPj> products = new ArrayList<>();
  Scanner sc = new Scanner(System.in);

  public void addProduct() {
    ProductPj pobj = new ProductPj();
    System.out.println("Enter the product id");
    int id = sc.nextInt();
    boolean flag = true;
    for (int i = 0; i < products.size(); i++) {
      if (products.get(i).getPid() == id) {
        System.out.println("Product Id already in the storage");
        flag = false;
        break;
      }
    }
    if (flag) {
      pobj.setPid(id);
      sc.nextLine();
      System.out.println("Enter the product name");
      pobj.setPname(sc.nextLine());
      System.out.println("Enter the product Price");
      pobj.setPrice(sc.nextDouble());
      System.out.println("Enter the product quatity");
      pobj.setPqty(sc.nextInt());
      if (products.add(pobj))
        System.out.println("Product successfully added");
      else
        System.out.println("Something went worng please try again");
      System.out.println();

    }
  }

  public void deleteProduct() throws ProductNotFoundException {
    System.out.println("Enter the product id to be deleted");
    int id = sc.nextInt();
    boolean flag = false;
    for (int i = 0; i < products.size(); i++) {
      if (products.get(i).getPid() == id) {
        products.remove(i);
        System.out.println("Product deleted successfully");
        System.out.println();
        flag = true;
        break;
      }
    }
    if (flag == false) {
      throw new ProductNotFoundException("Product Not Found with the mentioned Id");
    }
  }

  public void displayProduct() throws ProductNotFoundException {
    System.out.println("Enter the product id to show the details");
    int id = sc.nextInt();
    boolean flag = false;
    for (int i = 0; i < products.size(); i++) {
      if (products.get(i).getPid() == id) {
        System.out.println("Product Id " + products.get(i).getPid());
        System.out.println("Product name " + products.get(i).getPname());
        System.out.println("Product Quantity " + products.get(i).getPqty());
        System.out.println("Product Price " + products.get(i).getPrice());
        System.out.println();
        flag = true;
        break;
      }
    }
    if (flag == false) {
      throw new ProductNotFoundException("Product Not Found with the mentioned Id");
    }
  }

  public static void main(String[] args) {
    int option = 0;
    Store s = new Store();
    do {
      System.out.println("1. Add product");
      System.out.println("2. Remove Products");
      System.out.println("3. Display products");
      System.out.println("4. Exit");
      option = s.sc.nextInt();
      switch (option) {
        case 1:
          s.addProduct();
          break;
        case 2:
          try {
            s.deleteProduct();
          } catch (ProductNotFoundException e) {
            System.out.println(e);
          }
          break;
        case 3:
          try {
            s.displayProduct();
          } catch (ProductNotFoundException e) {
            System.out.println(e);
          }
          break;
        case 4:
          System.out.println("*** ThankYou ***");
          break;
      }
    } while (option != 4);
  }

}
