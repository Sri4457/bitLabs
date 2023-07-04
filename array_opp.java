import java.util.Scanner;

public class array_opp {

  int arr[] = new int[100];
  Scanner s = new Scanner(System.in);
  int n = 0; // number of elements

  public void insertFirst() {
    System.out.println("Enter new value : ");
    int value = s.nextInt();
    if (n == arr.length)
      System.out.println("Array is full");
    else if (n == 0) {
      arr[0] = value;
      n++;
    } else {
      for (int i = n; i > 0; i--) {
        arr[i] = arr[i - 1];
      }
      arr[0] = value;
      n++;
    }
  }

  public void insertLast() {
    System.out.println("Enter new value : ");
    int value = s.nextInt();
    if (n == arr.length)
      System.out.println("Array is full");
    else if (n == 0) {
      arr[0] = value;
      n++;
    } else {
      arr[n] = value;
      n++;
    }
  }

  public void insertSpecific() {
    System.out.println("Enter new value : ");
    int value = s.nextInt();
    System.out.println("Enter index value : ");
    int index = s.nextInt();
    if (n == arr.length)
      System.out.println("Array is full");
    else if (index <= n) {
      if (n == 0) {
        arr[index] = value;
        n++;
      } else {
        for (int i = n; i > index; i--) {
          arr[i] = arr[i - 1];
        }
        arr[index] = value;
        n++;
      }
    } else {
      System.out.println("Invalid index position");
    }
  }

  public void deleteAllOccurances() {
    System.out.println("Enter search element : ");
    int search = s.nextInt();
    int temp = n;
    for (int i = 0; i < n; i++) {
      if (search == arr[i]) {
        for (int j = i; j < n - 1; j++) {
          arr[j] = arr[j + 1];
        }
        n--;
        i--;
      }
    }
    if (temp == n) {
      System.out.println("The search element is not found");
    }
  }

  public void deleteFirstOccurance() {
    System.out.println("Enter search element : ");
    int search = s.nextInt();
    int temp = n;
    for (int i = 0; i < n; i++) {
      if (search == arr[i]) {
        for (int j = i; j < n - 1; j++) {
          arr[j] = arr[j + 1];
        }
        n--;
        break;
      }
    }
    if (temp == n) {
      System.out.println("The search element is not found");
    }
  }

  public void deleteLastOccurane() {
    System.out.println("Enter search element : ");
    int search = s.nextInt();
    int temp = n;
    for (int i = n - 1; i >= 0; i--) {
      if (search == arr[i]) {
        for (int j = i; j < n - 1; j++) {
          arr[j] = arr[j + 1];
        }
        n--;
        break;
      }
    }
    if (temp == n) {
      System.out.println("The search element is not found");
    }
  }

  public void display() {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public void viewOptions() {
    int option = 0;
    do {
      System.out.println("\n1. Insert first ");
      System.out.println("2. Insert last ");
      System.out.println("3. Insert in specific index");
      System.out.println("4. Delete first occurance of search element");
      System.out.println("5. Delete last occurance of search element");
      System.out.println("6. Delete all the occurance of search element");
      System.out.println("7. Enter 0 for exit");
      System.out.println("Choose your option");
      option = s.nextInt();
      if (option == 1) {
        insertFirst();
        display();
      } else if (option == 2) {
        insertLast();
        display();
      } else if (option == 3) {
        insertSpecific();
        display();
      } else if (option == 4) {
        deleteFirstOccurance();
        display();
      } else if (option == 5) {
        deleteLastOccurane();
        display();
      } else if (option == 6) {
        deleteAllOccurances();
        display();
      }
    } while (option != 0);
  }

  public static void main(String[] args) {
    array_opp obj = new array_opp();
    obj.viewOptions();
  }

}