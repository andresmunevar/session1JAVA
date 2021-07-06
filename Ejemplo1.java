/*
using conditionals and cycles in JAVA

get a series of numbers and return the average of them

analysis:

inputs:
  n, int and > 0
  numbers... int
  sum, Double
  max, int

outputs:
  average
  maximum

process:
  read n
  validate n
  init sum and max
  cycle n times reading, summing and comparing maximum
  show results
*/

import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Ejemplo1 {
  public static void main(String[] args) throws Exception {
    int n;
    int num;
    int sum = 0;
    int max = -10000000;
    int i;
    java.util.Scanner read =  new java.util.Scanner(System.in);
    System.out.print("Input number of numbers: ");
    n = read.nextInt();

    if (n <= 0){
      System.out.println("not valid number");
    } else {
      for (i = 1; i <= n; i++) {
        System.out.print("number " + i + " ?: ");
        num = read.nextInt();
        sum += num;
        if(num > max)
          max = num;
      }
      DecimalFormat df = new DecimalFormat("##.##");
      df.setRoundingMode(RoundingMode.DOWN);
      System.out.println("average: " + df.format(sum / (double)n));
      System.out.println("maximum is: " + max);
    }
    read.close();
  }
}
