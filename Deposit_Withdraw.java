import java.util.Scanner;

public class Deposit_Withdraw {
  int i = 1;
  Scanner s = new Scanner(System.in);
  double acbal = 10000;
  int w_count = 0;

  public void bal_enquiry() {
    System.out.println("The avaliable balance is: " + acbal);
  }

  public void no_of_notes(int amount) {
    int n500 = amount / 500;
    amount %= 500;
    int n200 = amount / 200;
    amount %= 200;
    int n100 = amount / 100;
    if (n500 > 0)
      System.out.println("No.of 500 Notes: " + n500);
    if (n200 > 0)
      System.out.println("No.of 200 Notes: " + n200);
    if (n100 > 0)
      System.out.println("No.of 100 Notes: " + n100);
  }

  // having only 500 notes
  public double only_five__hundred_notes(int amount) {
    if (amount % 500 == 0) {
      return (amount);
    } else if (amount % 500 < 300) {
      System.out.println(
          "Could you like to withdraw " + (amount - (amount % 500)) + " for continue press 1 and for exit 0");
      int input = s.nextInt();
      if (input == 0) {
        return 0;
      } else {
        return (amount - (amount % 500));
      }
    } else {
      System.out.println(
          "Could you like to withdraw " + (amount + (500 - (amount % 500))) + " for continue press 1 and for exit 0");
      int input = s.nextInt();
      if (input == 0) {
        return 0;
      } else {
        return (amount + (500 - (amount % 500)));
      }
    }
  }

  public void withdraw() {
    System.out.println("Enter withdraw amount");
    int amount = s.nextInt();
    if (amount % 100 == 0) {
      if (amount <= 20000) {
        if (amount <= acbal - 500) {
          // only if the machine has 500 notes
          // double chang_amount = only_five__hundred_notes(amount);
          // if (chang_amount != 0) {
          acbal = acbal - amount; // acbal-chang_amount;
          w_count++; // incrementing the withdrawls count
          no_of_notes(amount);// we call this function with chang_amount incase we have 500 notes
          // notes
          System.out.println("Available bal is :" + acbal);
          // } else {
          // System.out.println("We are unable to provide your specific amount as we only
          // have 500 notes");
          // }
        } else {
          System.out.println("insucffient fund");
        }
      } else {
        System.out.println("Transaction limit is 20k only");
      }
    } else {
      System.out.println("Please enter multiples of 100 only");
    }

  }

  public void deposit() {
    System.out.println("Enter deposit amount");
    int amount = s.nextInt();
    if (amount % 100 == 0) {
      if (amount <= 50000) {

        acbal = acbal + amount;
        System.out.println("Available bal is :" + acbal);
      } else {
        System.out.println("Deposit limit is 50k only");
      }
    } else {
      System.out.println("Please enter multiples of 100 only");
    }

  }

  public void viewOptions() {

    System.out.println("============Welcome to ABC bank===========");

    while (i == 1) {
      System.out.println("1.Deposit");
      System.out.println("2.Withdaraw");
      System.out.println("3.bal Enquiry");
      System.out.println("0.EXIT");
      System.out.println("Choose your option :");
      int option = s.nextInt();
      if (option == 1) {
        deposit();
      } else if (option == 2) {
        if (w_count < 3)
          withdraw();
        else {
          System.out.println("No.of Withdraws exceeded");
        }
      } else if (option == 3) {
        bal_enquiry();
      } else if (option == 0) {
        i = 0; // exiting as he entered exit
      }
      if (i == 1) {
        System.out.println("1 Continue 0. EXIT");
        i = s.nextInt();
      }
    }
    System.out.println("============Thankyou for using our bank===========");
  }

  public static void main(String args[]) {
    Deposit_Withdraw obj = new Deposit_Withdraw();
    obj.viewOptions();

  }
}