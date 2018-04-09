import java.util.*;
public class sortAll{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    for(int i=0; i < 10; i++){
      list1.add(scan.nextInt());
    }
    System.out.println("bubbleSort");
    bubbleSort(list1, list1.size());
    System.out.println();
    System.out.println("selectionSort");
    selectionSort(list1, 0);
    System.out.println();
    System.out.println("insertionSort");
    insertionSort(list1, 1);
    System.out.println();
    System.out.println("mergeSort");
    mergeSort(list1);
  }
  public static void bubbleSort(ArrayList<Integer> newlist, int location){
    ArrayList<Integer> list = new ArrayList<Integer>(newlist);
    if(location==0){
      return;
    }
    System.out.println(list);
    for (int i=0; i<location-1; i++)
        if (list.get(i) > list.get(i+1)){
          int temp = list.get(i);
          list.set(i, list.get(i+1));
          list.set(i+1, temp);
        }
    bubbleSort(list, location-1);
  }
  public static void selectionSort(ArrayList<Integer> newlist, int n){
    ArrayList<Integer> list = new ArrayList<Integer>(newlist);
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
  public static void insertionSort(ArrayList<Integer> newlist, int location){
    ArrayList<Integer> list = new ArrayList<Integer>(newlist);
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
  public static void mergeSort(ArrayList<Integer> newlist){
    ArrayList<Integer> list = new ArrayList<Integer>(newlist);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
    return;
  }
}
