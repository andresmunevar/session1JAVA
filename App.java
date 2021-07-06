public class App {
  public static void main(String[] args) throws Exception {
    // declare variables each variable per line
    double salary;
    String name;
    char option;
    // valid asignations
    salary = 100000;
    name = "Felipe";
    option = 'X';
    // printing
    System.out.println("my salary is: " + salary);
    System.out.println("my name is: " + name);
    System.out.println("my option is: " + option);
    // no valid asignations
    salary = Double.parseDouble("100000");
    option = "Felipe".charAt(0);
    System.out.println("my salary is: " + salary);
    // System.out.println("my name is: " + name);
    System.out.println("my option is: " + option);
  }
}
