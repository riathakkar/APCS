import java.util.*;
public class binarySearch{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int length = scan.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < length; i++){
      list.add(scan.nextInt());
    }
    int value = scan.nextInt();
    int start = 0;
    Collections.sort(list);

    System.out.println(binary(list, value, start, length-1));

  }
  public static int binary(ArrayList<Integer> list, int value, int start, int end){
    // if((list.size() > 1)){
    //   if(value != list.get(0)){
    //     System.out.println("-1");
    //   }
    //   System.out.println(list.get(0));
    //   return;
    // } else {
    //   int size = list.length()/2;
    //   if(value > list.get(size)){
    //     binary(list.sublist(size, list.length(), value);
    //   } else if(value < list.get(size)){
    //     binary(list.sublist(0, size), value);
    //   } else if(value == list.get(size)){
    //     System.out.println()
    //   }
    // }

    int size = start + (end - start)/2;
    if((end-start) >=  0) {
      if(value == list.get(size))
        return size;
      if(value > list.get(size)){
        return binary(list, value, size+1, end);
      }
      if(value < list.get(size)){
        return binary(list, value, start, size-1);
      }
    }
    return -1;
  }
}
