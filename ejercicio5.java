public class ejercicio5 {
  public static void main(String[] args) {
    java.util.Scanner read = new java.util.Scanner(System.in);
    System.out.print("enter day of the week in number? ");
    int day = read.nextInt();
    switch (day){
      case 1:
        System.out.println("Monday 5%");
        break;
      case 2:
        System.out.println("Tuesday 3%");
        break;
      case 3:
        System.out.println("Wednesday 10%");
        break;
      case 4:
        System.out.println("Thursday 4%");
        break;
      case 5:
        System.out.println("Friday 6%");
        break;
      case 6:
        System.out.println("Saturday 2%");
        break;
      case 7:
        System.out.println("Sunday 1%");
        break;
      default:
        System.out.println("Bad input. Bye!");
    }
  }
}
