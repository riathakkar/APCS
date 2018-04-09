import java.util.*;
public class insertionSort{
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    for(int i = 0; i < 10; i++){
      list.add(scan.nextInt());
    }
    System.out.println("insertionSort");
    insertionSort(list, 1);
    System.out.println();
  }
  public static void insertionSort(ArrayList<Integer> list, int location){
    if(location == list.size()){
      System.out.println(list);
      return;
    }
    System.out.println(list);
  //   if(list.get(0) > list.get(location)){
  //     int temp = list.get(location);
  //     list.add(0, temp);
  //     list.remove(location);
  //   } else {
  //     for(int j = 0; j < location; j++){
  //       if(list.get(location) < list.get(j)) max = j;
  //     }
  //     list.add(max, list.get(location));
  //     list.remove(location);
  //   }
  //   return insertionSort(list, location+1);
  // }
    int key = list.get(location);
    int j = location-1;
    while (j>=0 && list.get(j) > key){
        list.set(j+1, list.get(j));
        j = j-1;
    }
    list.set(j+1, key);
    insertionSort(list, location+1);
  }
}
