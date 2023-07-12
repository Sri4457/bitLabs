
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

abstract class Vechile {
  public abstract double calculateRent(LocalTime m1, LocalTime m2);

}

class Car extends Vechile {

  @Override
  public double calculateRent(LocalTime t1, LocalTime t2) {
    Duration d = Duration.between(t1, t2);
    System.out.println("The charge for the car rental is $0.2 for every second and the duration for your rent is "
        + d.getSeconds() + " seconds");
    double rent = (0.2) * (d.getSeconds());
    return rent;
  }

  public void fuelConsumption(double miles) {
    System.out.println("*** The fuel consumption for the car is one gallon of gas for every 25 miles ***");
    double fuel = ((double) (1) / 25) * miles;
    System.out.println("The fuel consumed in the rental period is :  " + fuel + " galoons");
  }

}

class Bike extends Vechile {

  @Override
  public double calculateRent(LocalTime t1, LocalTime t2) {
    Duration d = Duration.between(t1, t2);
    System.out.println("The charge for the car rental is $0.1 for every second and the duration for your rent is "
        + d.getSeconds() + " seconds");
    double rent = (0.1) * (d.getSeconds());
    return rent;
  }

}

class Truck extends Vechile {

  @Override
  public double calculateRent(LocalTime t1, LocalTime t2) {
    Duration d = Duration.between(t1, t2);
    System.out.println("The charge for the car rental is $0.5 for every second and the duration for your rent is "
        + d.getSeconds() + " seconds");
    double rent = (0.5) * (d.getSeconds());
    return rent;
  }

  public void maxLoad() {
    System.out.println("Max load for the truck are 100lbs");
  }

}

public class Vechile_Implementation {
  VechilePojo[] v = new VechilePojo[100];
  int num_vech = 0;
  Scanner sc = new Scanner(System.in);

  public void insertVechile() {
    System.out.println("Please Enter the vechile number");
    String plate = sc.nextLine();
    boolean flag = false;
    for (int i = 0; i < num_vech; i++) {
      if (plate.equalsIgnoreCase(v[i].getLisence_plate())) {
        System.out.println("Already the vechile you entered under rent");
        flag = true;
        break;
      }
    }
    if (flag == false) {
      System.out.println("Enter the Model name");
      String model = sc.nextLine();
      System.out.println("Enter the company name");
      String comp = sc.nextLine();
      System.out.println("Enter type of vechile");
      String type = sc.nextLine();
      VechilePojo obj = new VechilePojo();
      obj.setLisence_plate(plate);
      obj.setCompany(comp);
      obj.setModel(model);
      obj.setType(type.toLowerCase());
      obj.setM1(LocalTime.now());
      v[num_vech] = obj;
      num_vech++;
      System.out.println("successfully registered");
      System.out.println("===========================");
    }
  }

  public void getRent() {
    System.out.println("Please Enter the vechile number");
    String plate = sc.nextLine();
    boolean flag = false;
    for (int i = 0; i < num_vech; i++) {
      if (plate.equalsIgnoreCase(v[i].getLisence_plate())) {
        String type = v[i].getType();
        LocalTime lt = LocalTime.now();
        v[i].setM2(lt);
        switch (type) {
          case "car":
            Car c = new Car();
            System.out.println("The Rent for the vechile is " + c.calculateRent(v[i].getM1(), lt));
            System.out.println("Enter the miles");
            double miles = sc.nextDouble();
            v[i].setMiles(miles);
            c.fuelConsumption(miles);
            break;
          case "bike":
            Bike b = new Bike();
            System.out.println("The Rent for the vechile is " + b.calculateRent(v[i].getM1(), lt));
            break;
          case "truck":
            Truck t = new Truck();
            System.out.println("The Rent for the vechile is " + t.calculateRent(v[i].getM1(), lt));
            break;
        }
        flag = true;
        break;
      }
    }
    if (flag == false) {
      System.out.println("Vehcile not found");
      System.out.println("===========================");
    }
  }

  public void deleteVechile() {

    System.out.println("Please Enter the vechile number");
    String plate = sc.nextLine();
    boolean flag = false;
    for (int i = 0; i < num_vech; i++) {
      if (plate.equalsIgnoreCase(v[i].getLisence_plate())) {
        flag = true;
        for (int j = i; j < num_vech; j++)
          v[j] = v[j + 1];
        num_vech--;
        break;
      }
    }
    if (flag == false) {
      System.out.println("Vechile is not found");
      System.out.println("===========================");
    }
  }

  public void viewDetails() {

    System.out.println("Please Enter the vechile number");
    String plate = sc.nextLine();
    boolean flag = false;
    // System.out.println(num_vech);
    for (int i = 0; i < num_vech; i++) {
      if (plate.equalsIgnoreCase(v[i].getLisence_plate())) {
        flag = true;
        System.out.println("The vechile type is " + v[i].getType());
        System.out.println("The vechile company is " + v[i].getCompany());
        System.out.println("The time when vechile is registered for rent : " + v[i].getM1());
        System.out.println("===========================");
        break;
      }
    }
    if (flag == false) {
      System.out.println("Vechile is not found");
      System.out.println("===========================");
    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Vechile_Implementation v_obj = new Vechile_Implementation();
    int option = 0;
    do {
      System.out.println("1. Insert the rental vechile information");
      System.out.println("2. Insert number plate of vechile to calculate the rent");
      System.out.println("3. View details of registered vechile");
      System.out.println("4. Delete record");
      System.out.println("5. Exit");
      option = new Vechile_Implementation().sc.nextInt();
      switch (option) {
        case 1:
          v_obj.insertVechile();
          break;
        case 2:
          v_obj.getRent();
          break;
        case 3:
          v_obj.viewDetails();
          break;
        case 4:
          v_obj.deleteVechile();
          break;
        case 5:
          System.out.println("**** Thankyou for using ****");
          break;
      }
    } while (option != 5);
  }

}
