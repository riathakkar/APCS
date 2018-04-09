import java.util.*;
public class maxSum{
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    int length = scan.nextInt();
    for(int i = 0; i < length; i++){
      list.add(scan.nextInt());
    }
    int limit = scan.nextInt();
    System.out.print(maxSum(list, limit)+"\n");
  }
  public static int maxSum(List<Integer> list, int limit){
    return maxSum(list, 0, limit, list.size());
  }
  public static int maxSum(List<Integer> list, int i, int limit, int length){
    if(limit <= 0 || length == 0)
      return 0;
    int with = list.get(i)+maxSum(list, i+1, limit-list.get(i), length-1);
    int withOut = maxSum(list, i+1, limit, length-1);

    if(with <= limit && with > withOut){
      return with;
    }
    return withOut;
  }
}
