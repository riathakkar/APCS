import java.util.*;
public class printSquares{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("positive integer: ");
    int num = scan.nextInt();
    printSquares(num);
  }
  // public static void printSquares(int num, List<Integer> list, int check){
  //   if(num < 0) {
  //     int sum = 0;
  //     for(int value : list){
  //       sum = sum+value;
  //     }
  //     if(sum == num){
  //         System.out.println(list);
  //     }
  //   }
  //   if(num == 0){
  //     int sum = 0;
  //     for(int value : list){
  //       sum = sum+value;
  //     }
  //     if(sum == num){
  //         System.out.println(list);
  //     }
  //   }
  //   if(check*check > num){
  //     int sum = 0;
  //     for(int value : list){
  //       sum = sum+value;
  //     }
  //     if(sum == num){
  //         System.out.println(list);
  //     }
  //   }
  //   else {
  //     list.add(check);
  //     printSquares(num - check * check, list, check + 1);
  //     list.remove(list.size() - 1);
  //     printSquares(num, list, check + 1);
  //   }
  // }
  public static void printSquares(int n) {
    List<Integer> list = new LinkedList<Integer>();
    printSquares(n, list, 1);
  }
  public static void printSquares(int n, List<Integer> list, int i) {
      if(n < 0)
          return;

      if(n == 0) {
          System.out.println(list);
          return;
      }

      if(i * i > n)
          return;

      list.add(i);
      printSquares(n - i * i, list, i + 1);
      list.remove(list.size() - 1);
      printSquares(n, list, i + 1);
  }
}
