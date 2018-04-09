import java.util.*;
public class WriteSequence{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int n = scan.nextInt();
    if(n < 1)
      throw new IllegalArgumentException();
    printer(n);
    System.out.println();
  }
  public static void printer(int n){
    if(n == 1)
      System.out.print("1");
    else if(n <= 2){
      System.out.print("1 1");
    } else{
      System.out.print((int)Math.ceil(n/2.0) + " ");
      printer(n-2);
      System.out.print(" "+(int)Math.ceil(n/2.0));
    }
  }
}
