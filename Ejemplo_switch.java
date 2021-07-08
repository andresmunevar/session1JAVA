public class Ejemplo_switch {
  public static void main(String[] args) {
    int i;
    java.util.Scanner read = new java.util.Scanner(System.in);
    i = read.nextInt();
    switch (i) {
      case 0:
        System.out.println("i is zero.");
        break;
      case 1:
        System.out.println("i is one.");
        break;
      case 2:
        System.out.println("i is two.");
        break;
      default:
        System.out.println("i is greater than 2.");
    }
  }
}
