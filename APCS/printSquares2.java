import java.util.*;
public class printSquares{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("positive integer: ");
    int num = scan.nextInt();
    List<Integer> list = new LinkedList<Integer>();
    printSquares(num, list, 1);
  }
  public static printSquares(int num, List<Integer> list, int check){
    if(num < 0)
      return;
    if(num == 0)
      return;
    if(check*check > n)
      return;
    list.add(check);
    printSquares(num - check * check, list, check + 1);

    list.remove(list.size() - 1);
    System.out.print(list);
    printSquares(num, list, check + 1);

  }
}
