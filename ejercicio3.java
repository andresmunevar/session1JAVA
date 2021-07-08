public class Ejemplo_switch {
  public static void main(String[] args) {
    java.util.Scanner read = new java.util.Scanner(System.in);
    int inStore;
    int required;
    System.out.print("How many products are in Store? ");
    inStore = read.nextInt();
    System.out.print("How many products do you require? ");
    required = read.nextInt();
    if (required > inStore) {
      System.out.println("Not enough products. You need to make a requisition for at least: " + (required - inStore));
    } else if (inStore - required < 10) {
      System.out.println("In store just: " + (inStore - required) + " units. Consider making a new requisition");
    } else {
      System.out.println("In store: " + (inStore - required));
    }
  }
}
