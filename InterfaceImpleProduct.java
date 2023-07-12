
import java.util.*;

interface ProductMethod {
  public void addProduct();

  public void viewProducts();

  public void viewProductId();

  public void viewProductByName();

  public void deleteProduct();

  public void updateProduct();

  public void productInformationBRange();
}

abstract class A implements ProductMethod {
  Scanner sc = new Scanner(System.in);
  static int n = 0;
  Product[] p = new Product[100];

  public void addProduct() {
    Product pobj = new Product();
    boolean flag = true;
    if (n >= 100) {
      System.out.println("The array is full");
      flag = false;
    } else {
      System.out.println("Enter the product id");
      int id = sc.nextInt();
      for (int i = 0; i < n; i++) {
        if (p[i].getPid() == id) {
          System.out.println("Please Enter uniques pid");
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
        p[n] = pobj;
        System.out.println("Product added successfully");
        n++;
      }
    }
  }

  public void deleteProduct() {
    System.out.println("Enter the product id to be deleted");
    int id = sc.nextInt();
    int temp = n;
    for (int i = 0; i < n; i++) {
      if (p[i].getPid() == id) {
        for (int j = i; j < n - 1; j++)
          p[j] = p[j + 1];
        n--;
        break;
      }
    }
    if (temp == n) {
      System.out.println("The id is not found in the list");
    } else
      System.out.println("The deletion is succes");
  }

  public void updateProduct() {
    System.out.println("Enter the product id that to be updated");
    int id = sc.nextInt();
    int option = 1;
    do {
      System.out.println("Enter option");
      System.out.println("1. change Product name");
      System.out.println("2. change Product price");
      System.out.println("3. change Product Quantity");
      System.out.println("4. exit");
      int c = sc.nextInt();
      switch (c) {
        case 1:
          System.out.println("Enter the product name");
          sc.nextLine();
          String name = sc.nextLine();
          boolean flag = false;
          for (int i = 0; i < n; i++) {
            if (p[i].getPid() == id) {
              p[i].setPname(name);
              System.out.println("Product updated successfully");
              flag = true;
            }
          }
          if (flag == false) {
            System.out.println("Please enter valid id");
          }
          break;
        case 2:
          System.out.println("Enter the product price");
          double price = sc.nextDouble();
          boolean flag1 = false;
          for (int i = 0; i < n; i++) {
            if (p[i].getPid() == id) {
              p[i].setPrice(price);
              System.out.println("Product updated successfully");
              flag1 = true;
            }
          }
          if (flag1 == false) {
            System.out.println("Please enter valid id");
          }
          break;
        case 3:
          System.out.println("Enter the product Quantity");
          int qty = sc.nextInt();
          boolean flag2 = false;
          for (int i = 0; i < n; i++) {
            if (p[i].getPid() == id) {
              p[i].setPqty(qty);
              System.out.println("Product updated successfully");
              flag2 = true;
            }
          }
          if (flag2 == false) {
            System.out.println("Please enter valid id");
          }
          break;
        case 4:
          option = 4;
          // System.out.println("Updated");
          break;
      }
    } while (option != 4);
  }
}

abstract class B extends A {
  public void viewProducts() {
    if (n == 0) {
      System.out.println("No Products avaliable");
    } else {
      for (int i = 0; i < n; i++) {
        System.out.println("The product id: " + p[i].getPid() + "The product name: " + p[i].getPname()
            + " The product price is : " + p[i].getPrice() + " The product quantity is : " + p[i].getPqty());
      }
    }
  }

  public void viewProductId() {
    System.out.println("Enter the product id to get information");
    int id = sc.nextInt();
    boolean flag = false;
    for (int i = 0; i < n; i++) {
      if (id == p[i].getPid()) {
        System.out.println("The product name: " + p[i].getPname() + " The product price is : " + p[i].getPrice()
            + " The product quantity is : " + p[i].getPqty());
        flag = true;
        break;
      }
    }
    if (flag == false) {
      System.out.println("No Product is  avaliable with id : " + id);
    }
  }

  public void viewProductByName() {
    System.out.println("Enter the product name to get information");
    sc.nextLine();
    String name = sc.nextLine();
    boolean flag = false;
    for (int i = 0; i < n; i++) {
      if (p[i].getPname().contains(name)) {
        flag = true;
        System.out.println("The product name: " + p[i].getPname() + " The product price is : " + p[i].getPrice()
            + " The product quantity is : " + p[i].getPqty());
      }
    }
    if (flag == false) {
      System.out.println("No Product is  avaliable that contains name : " + name);
    }
  }

  public void productInformationBRange() {
    System.out.println("Enter the starting range of price");
    double a = sc.nextDouble();
    System.out.println("Enter the ending range of price");
    double b = sc.nextDouble();
    boolean flag = false;
    for (int i = 0; i < n; i++) {
      if (a <= p[i].getPrice() && p[i].getPrice() <= b) {
        flag = true;
        System.out.println("The product name: " + p[i].getPname() + " The product price is : " + p[i].getPrice()
            + " The product quantity is : " + p[i].getPqty());
      }
    }
    if (flag == false) {
      System.out.println("No Product is  avaliable in the range of price");
    }
  }
}

class C extends B {

}

public class InterfaceImpleProduct {

  public static void main(String[] args) {
    int option = 1;
    ProductMethod obj = new C();
    Scanner s = new Scanner(System.in);

    do {
      System.out.println("1. Insert");
      System.out.println("2. Delete product based on product id");
      System.out.println("3. Update product information");
      System.out.println("4. View all products");
      System.out.println("5. product information based on Id");
      System.out.println("6. product information based on name");
      System.out.println("7. product information based specific range of price");
      System.out.println("8. Exit");
      int opt = s.nextInt();
      switch (opt) {
        case 1:
          obj.addProduct();
          obj.viewProducts();
          break;
        case 2:
          obj.deleteProduct();
          ;
          obj.viewProducts();
          break;
        case 3:
          obj.updateProduct();
          ;
          obj.viewProducts();
          break;
        case 4:
          obj.viewProducts();
          break;
        case 5:
          obj.viewProductId();
          ;
          // obj.displayProducts();
          break;
        case 6:
          obj.viewProductByName();
          ;
          // obj.displayProducts();
          break;
        case 7:
          obj.productInformationBRange();
          ;
          // obj.displayProducts();
          break;
        case 8:
          System.out.println("Thank you for using");
          option = 8;
          break;
      }
    } while (option != 8);
    s.close();
  }
}
