import java.util.*;

interface ProductMethod {
  public List<Product> addProduct(Product p);

  public void viewProducts(List<Product> p);

  public void viewProductId(List<Product> list, int pid);

  public void viewProductBtwRange(List<Product> list, double a, double b);
}

abstract class A implements ProductMethod {
  public List<Product> addProduct(Product p, List<Product> list) {
    for (int i = 0; i < list.size(); i++) {
      if (p.Pid == list.get(i).getPid()) {
        System.out.println("Product id should be unique ");
        return list;
      }
    }
    list.add(p);
    return list;
  }

  public void viewProduct(List<Product> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.println("The Product Id " + list.get(i).getPid());
      System.out.println("The Product Name " + list.get(i).getPname());
      System.out.println("The Product Price " + list.get(i).getPrice());
      System.out.println("The Product Quantity " + list.get(i).getPqty());
    }
  }
}

abstract class B extends A {
  public void viewProductId(List<Product> list, int pid) {
    boolean flag = false;
    for (int i = 0; i < list.size(); i++) {
      if (pid == list.get(i).getPid()) {
        flag = true;
        System.out.println("The Product Id " + list.get(i).getPid());
        System.out.println("The Product Name " + list.get(i).getPname());
        System.out.println("The Product Price " + list.get(i).getPrice());
        System.out.println("The Product Quantity " + list.get(i).getPqty());
      }
    }
    if (flag == false)
      System.out.println("Product Id is not present in the Details");
  }

  public void viewProductBtwRange(List<Product> list, double a, double b) {
    boolean flag = false;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getPrice() >= a && list.get(i).getPrice() <= b) {
        flag = true;
        System.out.println("The Product Id " + list.get(i).getPid());
        System.out.println("The Product Name " + list.get(i).getPname());
        System.out.println("The Product Price " + list.get(i).getPrice());
        System.out.println("The Product Quantity " + list.get(i).getPqty());
      }
    }
    if (flag == false)
      System.out.println("Product Id is not present in the Details");
  }

}

class InterfacseImple {
  public static void main(String[] args) {

  }
}