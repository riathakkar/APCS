import java.util.*;
public class selectionSort{
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    for(int i = 0; i < 10; i++){
      list.add(scan.nextInt());
    }
    System.out.println("selectionSort");
    selectionSort(list, 0);
    System.out.println();
  }
  public static void selectionSort(ArrayList<Integer> list, int n){
    System.out.println(list);
    if(n >= list.size()-1) return;
    int min = n;
    for(int j = n; j < list.size(); j++){
      if(list.get(j) < list.get(min)) min = j;
    }
    int temp = list.get(min);
    list.set(min, list.get(n));
    list.set(n, temp);
    selectionSort(list, n+1);
  }
}
