import java.util.*;

class InsufficientFundsException extends Exception {
  public InsufficientFundsException(String e) {
    super(e);
  }
}

public class Bank {
  ArrayList<BankAccountPj> list = new ArrayList<>();
  Scanner sc = new Scanner(System.in);

  public void addAccount() {
    sc.nextLine();
    System.out.println("Enter the account number ");
    String number = sc.nextLine();
    boolean flag = false;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getAccount_number().equals(number)) {
        flag = true;
        System.out.println("Account number already registered please enter valid number");
        break;
      }

    }
    if (flag == false) {
      System.out.println("Enter the Name of the Account holder");
      String name = sc.nextLine();
      System.out.println("Enter the opening balance");
      double amt = sc.nextDouble();
      BankAccountPj b = new BankAccountPj();
      b.setAccount_number(number);
      b.setName(name);
      b.setBalance(amt);
      if (list.add(b)) {
        System.out.println("Successfully added account");
      } else {
        System.out.println("Something went wrong please try agian");
      }
    }
  }

  public void deposit() {
    sc.nextLine();
    System.out.println("Enter the account number ");
    String number = sc.nextLine();
    boolean flag = false;
    int index = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getAccount_number().equals(number)) {
        flag = true;
        index = i;
        break;
      }
    }
    if (flag) {
      System.out.println("Enter the Amount to be deposit");
      double amt = sc.nextDouble();
      list.get(index).setBalance(list.get(index).getBalance() + amt);
      System.out
          .println("Deposit succesfull and the balance amount in your account is " + list.get(index).getBalance());
    } else {
      System.out.println("Please Enter the Valid account number");
    }
  }

  public void withDraw() throws InsufficientFundsException {
    sc.nextLine();
    System.out.println("Enter the account number ");
    String number = sc.nextLine();
    boolean flag = false;
    int index = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getAccount_number().equals(number)) {
        flag = true;
        index = i;
        break;
      }
    }
    if (flag) {
      System.out.println("Enter the Amount to be withdraw");
      double amt = sc.nextDouble();
      if (amt <= (list.get(index).getBalance() - 50)) {
        list.get(index).setBalance(list.get(index).getBalance() - amt);
        System.out
            .println("Withdraw succesfull and the balance amount in your account is " + list.get(index).getBalance());
      } else {
        throw new InsufficientFundsException(
            "please Enter the valid amount as your balance is less than amount you want to withdraw");
      }
    } else {
      System.out.println("Please Enter the Valid account number");
    }
  }

  public void checkBalance() {
    sc.nextLine();
    System.out.println("Enter the account number ");
    String number = sc.nextLine();
    boolean flag = false;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getAccount_number().equals(number)) {
        flag = true;
        System.out.println("Your Account Balance is " + list.get(i).getBalance());
        break;
      }
    }
    if (flag == false) {
      System.out.println("Please Enter the Valid account number");
    }
  }

  public static void main(String[] args) {
    Bank b = new Bank();
    int option = 0;
    do {
      System.out.println("1. Add Account");
      System.out.println("2. Deposit Amount");
      System.out.println("3. Withdraw Amount");
      System.out.println("4. View Balance");
      System.out.println("5. Exit");
      option = b.sc.nextInt();
      switch (option) {
        case 1:
          b.addAccount();
          break;
        case 2:
          b.deposit();
          break;
        case 3:
          try {
            b.withDraw();
          } catch (InsufficientFundsException e) {
            System.out.println(e);
          }
          break;
        case 4:
          b.checkBalance();
          break;
        case 5:
          System.out.println("ThankYou for Using");
          break;
      }
    } while (option != 5);
  }
}