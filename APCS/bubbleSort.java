import java.util.*;
public class bubbleSort{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < 10; i++){
      list.add(scan.nextInt());
    }
    System.out.println("bubbleSort");
    list = bubbleSort(list, list.size());
    System.out.println();
  }
  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list, int location){
    if(location==0){
      return list;
    }
    System.out.println(list);
    for (int i=0; i<location-1; i++)
        if (list.get(i) > list.get(i+1)){
          int temp = list.get(i);
          list.set(i, list.get(i+1));
          list.set(i+1, temp);
        }
    return bubbleSort(list, location-1);
  }
}
